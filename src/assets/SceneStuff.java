package assets;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by Liandri on 26/12/2016.
 */
public class SceneStuff {
    ImageView stuff;
    Image stuffImg;

    public SceneStuff(int x, int y, int type){
        stuffImg = new Image("/resources/pics/platforms/2.png");
        this.stuff = new ImageView(stuffImg);
        this.stuff.setTranslateX(x);
        this.stuff.setTranslateY(y);
        this.stuff.setScaleX(.5);
        this.stuff.setScaleY(.5);
        selectSceneStuff(x, y, type);
    }

    public void selectSceneStuff(int x, int y, int type){
        switch (type){
            case 0:
                Image stuffImg = new Image("/resources/pics/platforms/1.png");
                this.stuff = new ImageView(stuffImg);
                this.stuff.setTranslateX(x);
                this.stuff.setTranslateY(y);
                this.stuff.setScaleX(.5);
                this.stuff.setScaleY(.5);
                break;
            case 1:
                stuffImg = new Image("/resources/pics/platforms/2.png");
                this.stuff = new ImageView(stuffImg);
                this.stuff.setTranslateX(x);
                this.stuff.setTranslateY(y);
                this.stuff.setScaleX(.5);
                this.stuff.setScaleY(.5);
                break;
            case 2:
                stuffImg = new Image("/resources/pics/platforms/3.png");
                this.stuff = new ImageView(stuffImg);
                this.stuff.setTranslateX(x);
                this.stuff.setTranslateY(y);
                this.stuff.setScaleX(.5);
                this.stuff.setScaleY(.5);
                break;
            case 3:
                stuffImg = new Image("/resources/pics/platforms/4.png");
                this.stuff = new ImageView(stuffImg);
                this.stuff.setTranslateX(x);
                this.stuff.setTranslateY(y);
                this.stuff.setScaleX(.5);
                this.stuff.setScaleY(.5);
                break;
            case 4:
                stuffImg = new Image("/resources/pics/platforms/5.png");
                this.stuff = new ImageView(stuffImg);
                this.stuff.setTranslateX(x);
                this.stuff.setTranslateY(y);
                this.stuff.setScaleX(.5);
                this.stuff.setScaleY(.5);
                break;
            case 5:
                stuffImg = new Image("/resources/pics/platforms/6.png");
                this.stuff = new ImageView(stuffImg);
                this.stuff.setTranslateX(x);
                this.stuff.setTranslateY(y);
                this.stuff.setScaleX(.5);
                this.stuff.setScaleY(.5);
                break;
            case 6:
                stuffImg = new Image("/resources/pics/platforms/7.png");
                this.stuff = new ImageView(stuffImg);
                this.stuff.setTranslateX(x);
                this.stuff.setTranslateY(y);
                this.stuff.setScaleX(.5);
                this.stuff.setScaleY(.5);
                break;
            case 7:
                stuffImg = new Image("/resources/pics/platforms/8.png");
                this.stuff = new ImageView(stuffImg);
                this.stuff.setTranslateX(x);
                this.stuff.setTranslateY(y);
                this.stuff.setScaleX(.5);
                this.stuff.setScaleY(.5);
                break;
            case 8:
                stuffImg = new Image("/resources/pics/platforms/9.png");
                this.stuff = new ImageView(stuffImg);
                this.stuff.setTranslateX(x);
                this.stuff.setTranslateY(y);
                this.stuff.setScaleX(.5);
                this.stuff.setScaleY(.5);
                break;
            case 9:
                stuffImg = new Image("/resources/pics/platforms/10.png");
                this.stuff = new ImageView(stuffImg);
                this.stuff.setTranslateX(x);
                this.stuff.setTranslateY(y);
                this.stuff.setScaleX(.5);
                this.stuff.setScaleY(.5);
                break;
            case 10:
                stuffImg = new Image("/resources/pics/platforms/11.png");
                this.stuff = new ImageView(stuffImg);
                this.stuff.setTranslateX(x);
                this.stuff.setTranslateY(y);
                this.stuff.setScaleX(.5);
                this.stuff.setScaleY(.5);
                break;
            case 11:
                stuffImg = new Image("/resources/pics/platforms/12.png");
                this.stuff = new ImageView(stuffImg);
                this.stuff.setTranslateX(x);
                this.stuff.setTranslateY(y);
                this.stuff.setScaleX(.5);
                this.stuff.setScaleY(.5);
                break;
            default:

                break;
        }
    }
    public ImageView getImage(){
        return this.stuff;
    }
}
