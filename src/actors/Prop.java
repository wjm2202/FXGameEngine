package actors;

import javafx.scene.image.Image;

/**
 * Created by Liandri on 19/12/2016.
 */
public class Prop extends Actor{

    public Prop(String SVGdata, double xLocation, double yLocation, Image... spriteCels){
        super(SVGdata, xLocation, yLocation, spriteCels);
        spriteFrame.setTranslateX(xLocation);
        spriteFrame.setTranslateY(yLocation);

    }

    @Override
    public void update() {
        char type = this.getType();
        //System.out.println(" in prop update char value = "+type);
        switch(type){
            case '0':
                this.getSpriteFrame().setTranslateY(this.getSpriteFrame().getTranslateY()-10);
                break;
            case '1':
                this.getSpriteFrame().setTranslateX(this.getSpriteFrame().getTranslateX()+8);
                this.getSpriteFrame().setTranslateY(this.getSpriteFrame().getTranslateY()-8);
                break;
            case '2':
                this.getSpriteFrame().setTranslateX(this.getSpriteFrame().getTranslateX()+10);
                //System.out.println("sword right");
                break;
            case '3':
                this.getSpriteFrame().setTranslateX(this.getSpriteFrame().getTranslateX()+8);
                this.getSpriteFrame().setTranslateY(this.getSpriteFrame().getTranslateY()+8);
                break;
            case '4':
                this.getSpriteFrame().setTranslateY(this.getSpriteFrame().getTranslateY()+10);
                break;
            case '5':
                this.getSpriteFrame().setTranslateX(this.getSpriteFrame().getTranslateX()-8);
                this.getSpriteFrame().setTranslateY(this.getSpriteFrame().getTranslateY()+8);
                break;
            case '6':
                this.getSpriteFrame().setTranslateX(this.getSpriteFrame().getTranslateX()-10);
                //System.out.println("sword left");
                break;
            case '7':
                this.getSpriteFrame().setTranslateX(this.getSpriteFrame().getTranslateX()-8);
                this.getSpriteFrame().setTranslateY(this.getSpriteFrame().getTranslateY()-8);
                break;
        }

    }
}


