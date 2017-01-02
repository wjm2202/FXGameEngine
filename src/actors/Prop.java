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

    }
}


