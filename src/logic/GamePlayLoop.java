package logic;

import actors.Actor;
import actors.Prop;
import actors.Slush;
import javafx.animation.AnimationTimer;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import levels.LevelGenerator;
import main.Main;

import java.util.ArrayList;

import static main.Main.HEIGHT;
import static main.Main.WIDTH;

/**
 * Created by Liandri on 7/11/2016.
 */
public class GamePlayLoop extends AnimationTimer {

    protected Main main;
    public StackPane root;
    public int fps = 0;
    private ArrayList<Prop> remove = new ArrayList<>();
    private ArrayList<Prop> add = new ArrayList<>();
    public GamePlayLoop(Main mainn){
        this.main = mainn;
    }
    @Override
    public void handle(long now) {        // Program logic that gets processed on every pulse that JavaFX processes
        //gameloop
        if((fps%10)==0){                   //update 6 times a second
            onScreen();                    //update the onscreen props and remove offscreen props
        }
        fps++;
        if(fps>=60){                       //reset fps counter for oncreen updates
            fps=0;
        }
        main.slush.update();

    }
    public void onScreen(){
        //cheak for onscreen 6 times a second
        //System.out.println(main.castDirector.getCurrentCast().size());
        for(Prop p: main.propList){
            if ((p.spriteFrame.getTranslateX() > -500) && (p.spriteFrame.getTranslateX() < 500)) {
                if(!p.isOnScreen()){
                    main.castDirector.addCurrentCast(p);
                    p.setOnScreen(true);
                }
            } else {
                p.setOnScreen(false);
                main.castDirector.addToRemovedActors(p);
                //main.castDirector.resetRemovedActors();
            }
        }
        main.castDirector.resetRemovedActors();
    }
    @Override
    public void start() {
        super.start();
    }
    @Override
    public void stop() {
        super.stop();
    }
}