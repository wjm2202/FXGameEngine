package actors;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.SVGPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Liandri on 8/11/2016.
 */
public abstract class Actor {



    protected static List<Image> imageStates = new ArrayList<>();
    public ImageView spriteFrame;
    private SVGPath spriteBound;
    protected char type;
    protected double iX;
    protected double iY;
    private double pX;
    private double pY;
    private boolean onScreen = false;
    private boolean loaded = false;
    private boolean isAlive;
    private boolean isFixed;
    private boolean isBonus;
    private boolean hasValu;
    private boolean isFlipV;
    protected boolean isFlipH;

    public Actor(String SVGdata, double xLocation, double yLocation, Image... spriteCels) {
        spriteBound = new SVGPath();
        spriteBound.setContent(SVGdata);
        spriteFrame = new ImageView(spriteCels[0]);
        imageStates.addAll(Arrays.asList(spriteCels));
        iX = xLocation;
        iY = yLocation;
        pX = pY = 0; isFixed = true; isAlive = isBonus = hasValu = isFlipV = isFlipH = false;
    }

    public abstract void update();
    public List<Image> getImageStates() {
        return imageStates;
    }
    public void setImageStates(List<Image> imageStates) {
        this.imageStates = imageStates;
    }
    public ImageView getSpriteFrame() {
        return this.spriteFrame;
    }
    public void setSpriteFrame(ImageView spriteFrame) {
        this.spriteFrame = spriteFrame;
    }
    public SVGPath getSpriteBound() {
        return spriteBound;
    }
    public void setSpriteBound(SVGPath spriteBound) {
        this.spriteBound = spriteBound;
    }
    public double getiX() {
        return iX;
    }
    public void setiX(double iX) {
        this.iX = iX;
    }
    public double getiY() {
        return iY;
    }
    public void setiY(double iY) {
        this.iY = iY;
    }
    public double getpX() {
        return pX;
    }
    public void setpX(double pX) {
        this.pX = pX;
    }
    public double getpY() {
        return pY;
    }
    public void setpY(double pY) {
        this.pY = pY;
    }
    public boolean isAlive() {
        return isAlive;
    }
    public void setAlive(boolean alive) {
        isAlive = alive;
    }
    public boolean isFixed() {
        return isFixed;
    }
    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }
    public boolean isBonus() {
        return isBonus;
    }
    public void setBonus(boolean bonus) {
        isBonus = bonus;
    }
    public boolean isHasValu() {
        return hasValu;
    }
    public void setHasValu(boolean hasValu) {
        this.hasValu = hasValu;
    }
    public boolean isFlipV() {
        return isFlipV;
    }
    public void setFlipV(boolean flipV) {
        isFlipV = flipV;
    }
    public boolean isFlipH() {
        return isFlipH;
    }
    public void setFlipH(boolean flipH) {
        isFlipH = flipH;
    }
    public boolean isOnScreen() {
        return onScreen;
    }
    public void setOnScreen(boolean onScreen) {
        this.onScreen = onScreen;
    }
    public boolean isLoaded() {
        return loaded;
    }
    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }
    public char getType() {
        return this.type;
    }
    public void setType(char type) {
        this.type = type;
    }



}
