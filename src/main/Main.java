package main;

import actors.CastingDirector;
import actors.Prop;
import actors.Slush;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import levels.LevelGenerator;
import logic.GamePlayLoop;
import sounds.SoundEffects;

import java.util.ArrayList;

public class Main extends Application {

    public static final double WIDTH = 1000, HEIGHT = 600;
    private boolean up;
    private boolean down;
    private boolean left;
    private boolean right;
    private boolean attack;
    private boolean jump;
    private boolean run;
    private boolean running = true;
    private boolean jumping = false;
    private boolean falling = true;
    private boolean start = true;
    private StackPane root;
    private HBox buttonContainer;
    public Slush slush;
    private Image BG, sa0, sa1, sa2, sa3, sa4, sa5, sa6, sa7, sa8, sa9;
    public static CastingDirector castDirector;
    private Scene scene;
    private Image splashScreen, instructionLayer, legalLayer, scoresLayer;
    private BackgroundImage myBI;
    private ImageView splashScreenBackplate, splashScreenTextArea;
    private Button gameButton, helpButton, scoreButton, legalButton;
    private Insets buttonContainerPadding;
    private GamePlayLoop gamePlayLoop;
    private LevelGenerator lvlGen = new LevelGenerator();
    public ArrayList<Prop> propList = new ArrayList<>();
    public static SoundEffects sounds = new SoundEffects();
    private int lvl =1;

    @Override
    public void init(){
        //initailize stuff here

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX Game Engine");
        root = new StackPane();
        scene = new Scene(root, WIDTH, HEIGHT, Color.WHITE);
        primaryStage.setScene(scene);
        //primaryStage.setResizable(false);
        primaryStage.show();
        createSceneEventHandling();
        loadImageAssets();
        createGameActors();
       // addGameActorNodes();
        createCastingDirection();
        createSplashScreenNodes();
        addNodesToStackPane();
        createStartGameLoop();
        //startLoop();
    }

    public static void main(String[] args) {
        launch(args);
    }
    private void createSceneEventHandling() {
        scene.setOnKeyPressed((KeyEvent event) -> {
            switch (event.getCode()) {
                case UP:
                    if(!up){
                        up = true;
                        slush.setCounter(0);
                        slush.setSpriteCurr(0);
                    }
                    break;
                case DOWN:
                    down = true;
                    break;
                case LEFT:
                    left = true;
                    slush.setFlipH(false);
                    break;
                case RIGHT:
                    right = true;
                    slush.setFlipH(true);
                    break;
                case W:
                    //up = true;
                    break;
                case S:
                    down = true;
                    break;
                case A:
                    left = true;
                    slush.setFlipH(true);
                    run=true;
                    break;
                case D:
                    right = true;
                    slush.setFlipH(false);
                    run = true;
                    break;
                case K:
                    if(!attack){
                        attack = true;
                        slush.setCounter(0);
                        slush.setSpriteCurr(0);
                        sounds.playLaunch();
                    }
                    break;
                case J:
                    if(!jump){
                        jump = true;
                        jumping = true;
                        slush.setCounter(0);
                        slush.setSpriteCurr(0);
                        sounds.powerUp();
                    }
                    break;
                case N:
                    run = true;
                    break;
            }
        });
        scene.setOnKeyReleased((KeyEvent event) -> {
            switch (event.getCode()) {
                case UP:
                    up = false;
                    break;
                case DOWN:
                    down = false;
                    break;
                case LEFT:
                    left = false;
                    break;
                case RIGHT:
                    right = false;
                    break;
                case W:
                    up = false;
                    break;
                case S:
                    down = false;
                    break;
                case A:
                    left = false;
                    run = false;
                    break;
                case D:
                    right = false;
                    run = false;
                    break;
                case N:
                    run = false;
                    break;
            }
        });
    }
    private void loadImageAssets() {
        splashScreen = new Image("/resources/pics/space.jpg", WIDTH, HEIGHT, true, false, true);
        instructionLayer = new Image("/resources/pics/Tittle.png", WIDTH, HEIGHT, true, false, true);
        legalLayer = new Image("/resources/pics/legal.png", WIDTH, HEIGHT, true, false, true);
        scoresLayer = new Image("/resources/pics/score.png", WIDTH, HEIGHT, true, false, true);
        BG = new Image("/resources/pics/BG.png", WIDTH, HEIGHT, true, false, true);
        sa0 = new Image("/resources/pics/attack/attack1.png");
        sa1 = new Image("/resources/pics/attack/attack2.png");
        sa2 = new Image("/resources/pics/attack/attack3.png");
        sa3 = new Image("/resources/pics/attack/attack4.png");
        sa4 = new Image("/resources/pics/attack/attack5.png");
        sa5 = new Image("/resources/pics/attack/attack6.png");
        sa6 = new Image("/resources/pics/attack/attack7.png");
        sa7 = new Image("/resources/pics/attack/attack8.png");
        sa8 = new Image("/resources/pics/attack/attack9.png");
        sa9 = new Image("/resources/pics/attack/attack10.png");
        myBI= new BackgroundImage(BG,BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

    }
    private void createGameActors() {
        slush = new Slush(this, "M150 0 L75 500 L225 200 Z", 0, 0, sa0, sa1, sa2, sa3, sa4, sa5, sa6, sa7, sa8, sa9);
        //propList = lvlGen.getPropsForLevel(lvl);
    }
    private void addGameActorNodes() {

    }
    private void createCastingDirection() {
        castDirector = new CastingDirector();
        //castDirector.addCurrentCast(slush);
    }
    private void createSplashScreenNodes() {

        root.setBackground(new Background(myBI));
        buttonContainer = new HBox(12);
        buttonContainer.setAlignment(Pos.BOTTOM_LEFT);
        buttonContainerPadding = new Insets(0, 0, 10, 16);
        buttonContainer.setPadding(buttonContainerPadding);
        gameButton = new Button();
        gameButton.setText("PLAY GAME");
        gameButton.setOnAction((ActionEvent) -> {
            splashScreenBackplate.setVisible(false);
            splashScreenTextArea.setVisible(false);
            startLoop();
            sounds.music();
        });
        gameButton.setLayoutX(0.0);
        helpButton = new Button();
        helpButton.setText("INSTRUCTIONS");
        helpButton.setOnAction((ActionEvent) -> {
            splashScreenBackplate.setVisible(true);
            splashScreenTextArea.setVisible(true);
            splashScreenTextArea.setImage(instructionLayer);
        });
        scoreButton = new Button();
        scoreButton.setText("HIGH SCORES");
        scoreButton.setOnAction((ActionEvent) -> {
            splashScreenBackplate.setVisible(true);
            splashScreenTextArea.setVisible(true);
            splashScreenTextArea.setImage(scoresLayer);
        });
        legalButton = new Button();
        legalButton.setText("LEGAL & CREDITS");
        legalButton.setOnAction((ActionEvent) -> {
            splashScreenBackplate.setVisible(true);
            splashScreenTextArea.setVisible(true);
            splashScreenTextArea.setImage(legalLayer);
        });
        buttonContainer.getChildren().addAll(gameButton, helpButton, scoreButton, legalButton);
        splashScreenBackplate = new ImageView();
        splashScreenBackplate.setImage(splashScreen);
        splashScreenTextArea = new ImageView();
        splashScreenTextArea.setImage(instructionLayer);

    }
    private void addNodesToStackPane() {
        root.getChildren().add(splashScreenBackplate);
        root.getChildren().add(splashScreenTextArea);
        root.getChildren().add(buttonContainer);

    }
    private void createStartGameLoop() {
        gamePlayLoop = new GamePlayLoop(this);
    }
    public void startLoop(){
        gamePlayLoop.stop();
        System.out.println(WIDTH/4);
        if(start){
            propList = lvlGen.getPropsForLevel(lvl);
            for(Prop p : propList){
                root.getChildren().add(p.spriteFrame);
            }
            root.getChildren().add(slush.spriteFrame);
            gamePlayLoop.start();
        }
    }
    public boolean isUp() {
        return up;
    }
    public void setUp(boolean up) {
        this.up = up;
    }
    public boolean isDown() {
        return down;
    }
    public boolean isLeft() {
        return left;
    }
    public boolean isRight() {
        return right;
    }
    public boolean isAttack() {return attack;}
    public boolean isJump() {return jump;}
    public boolean isRun() {return run;}
    public void setJump(){this.jump=false;}
    public void setAttack(){this.attack=false;}
    public StackPane getRoot(){return this.root;}
    public boolean isFalling() {
        return falling;
    }
    public void setFalling(boolean falling) {
        this.falling = falling;
    }
    public boolean isJumping() {
        return jumping;
    }
    public void setJumping(boolean jumping) {
        this.jumping = jumping;
    }



}