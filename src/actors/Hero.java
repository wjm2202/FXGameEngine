package actors;

import javafx.scene.image.Image;

/**
 * Created by Liandri on 8/11/2016.
 */
public abstract class Hero extends Actor{

    protected double vX, vY, lifeSpan, damage, offsetX, offsetY;

    protected float boundScale, boundRot, friction, gravity, bounce;

    public Hero(String SVGdata, double xLocation, double yLocation, Image... spriteCels) {
        super(SVGdata, xLocation, yLocation, spriteCels);
        lifeSpan = 1000;
        vX = vY = damage = offsetX = offsetY = 5;
        boundScale = boundRot = friction = gravity = bounce = 0;
    }

    public abstract void update();

    public boolean collide(Actor object){
        return false;
    }

    public double getvX() {
        return vX;
    }

    public void setvX(double vX) {
        this.vX = vX;
    }

    public double getvY() {
        return vY;
    }

    public void setvY(double vY) {
        this.vY = vY;
    }

    public double getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(double lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(double offsetX) {
        this.offsetX = offsetX;
    }

    public double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(double offsetY) {
        this.offsetY = offsetY;
    }

    public double getBoundScale() {
        return boundScale;
    }
    public double getBoundRot() {
        return boundRot;
    }

    public double getFriction() {
        return friction;
    }

    public double getGravity() {
        return gravity;
    }

    public double getBounce() {
        return bounce;
    }

    public void setBoundScale(float boundScale) {
        this.boundScale = boundScale;
    }

    public void setBoundRot(float boundRot) {
        this.boundRot = boundRot;
    }

    public void setFriction(float friction) {
        this.friction = friction;
    }

    public void setGravity(float gravity) {
        this.gravity = gravity;
    }

    public void setBounce(float bounce) {
        this.bounce = bounce;
    }

}
