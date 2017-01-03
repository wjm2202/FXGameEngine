package actors;

import assets.LoadImgAssets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import main.Main;
import java.util.ArrayList;
import static main.Main.HEIGHT;
import static main.Main.WIDTH;

/**
 * Created by Liandri on 8/11/2016.
 */
public class Slush extends Hero {

    protected Main slush;
    protected LoadImgAssets img = new LoadImgAssets();
    protected ArrayList<Image> idle = img.getIdle();
    protected ArrayList<Image> attack = img.getAttack();
    protected ArrayList<Image> dead = img.getDead();
    protected ArrayList<Image> jump = img.getJump();
    protected ArrayList<Image> jumpAttack = img.getJumpAttack();
    protected ArrayList<Image> run = img.getRun();
    protected ArrayList<Image> walk = img.getWalk();
    protected ArrayList<Image> sword = img.getSword();
    protected static final double SPRITE_PIXELS_X = 53;
    protected static final double SPRITE_PIXELS_Y = 64;
    protected static final double rightBoundary  =   WIDTH/2  - SPRITE_PIXELS_X/2;
    protected static final double leftBoundary   = -(WIDTH/2  - SPRITE_PIXELS_X/2);
    protected static final double bottomBoundary =   HEIGHT/2 - SPRITE_PIXELS_Y/2;
    protected static final double topBoundary    = -(HEIGHT/2 - SPRITE_PIXELS_Y/2);
    protected int spriteCurr=0;
    protected int counter=0;
    protected int jumpheight=40;
    protected int jumpCounter =0;
    protected int fallFactor = 2;
    protected int jumpFactor = -4;
    protected StackPane root;
    protected boolean collison = false;
    protected double HEIGHTPX = 60;
    protected double WIDTHPX = 53;
    protected int attackDelay = 30;
    protected int attackCounter = 0;
    protected boolean attacking = false;
    protected boolean reset = true;


    public Slush(Main islush, String SVGData, double xLocation, double yLocation, Image... spriteCels){
        super(SVGData, xLocation,yLocation, spriteCels);
        this.slush=islush;
    }
    @Override
    public void update() {
        movement();
        setXYLocation();
        setBoundries();
        setImageState();
        setDirection();
        moveSlush(iX,iY);
        checkCollision();
    }
    public void checkCollision(){                                 //collision testing and handling
        boolean hasCollided = false;
       // System.out.println("slush top left "+slush.slush.spriteFrame.getTranslateY()+HEIGHTPX);

        for(int i = 0;i<Main.castDirector.getCurrentCast().size();i++){
            Actor o = Main.castDirector.getCurrentCast().get(i);
            if(collide(o)){
                if((o.getType()>='A')&&(o.getType()<='M')){         //collided with object type
                    if((o.getType()=='F')||(o.getType()=='G')){
                        //System.out.println("Mushroom found");
                        slush.propList.remove(o);
                        slush.castDirector.addToRemovedActors(o);
                        slush.getRoot().getChildren().remove(o);
                        hasCollided = true;
                    }else if ((o.getType()=='E')||(o.getType()=='J')){
                        hasCollided = carryOutCollisionGround(o);
                    }
                }else if((o.getType()=='q')||(o.getType()=='r')){   //collided with water type
                    iY += fallFactor;
                }else if((o.getType()>='a')&&(o.getType()<='p')){   //collided with ground type
                    hasCollided  = carryOutCollisionGround(o);
                }else if ((o.getType()>='1')&&(o.getType()<='9')){   //collided with enemy type
                    //enemy interaction here
                    //
                }
            }
        }
        if(!hasCollided){
            iY += fallFactor;
        }
    }
    public boolean carryOutCollisionGround(Actor object){   //if collsion is found this is what is done per prop
        boolean landed = false;
        char prop = object.getType();
       // System.out.println("collision with "+ prop);
        //System.out.println("slush top left "+slush.slush.spriteFrame.getTranslateY());
        switch(prop){
            case 'a':
                //left grass top ground
                landed = doFallStop(object);
                break;
            case 'b':
                //center grass top ground
                landed = doFallStop(object);
                break;
            case 'c':
                //right grass top ground
                landed = doFallStop(object);
                break;
            case 'd':
                landed = doFallStop(object);
                break;
            case 'e':
                landed = doFallStop(object);
                break;
            case 'f':
                landed = doFallStop(object);
                break;
            case 'g':
                landed = doFallStop(object);
                break;
            case 'h':
                landed = doFallStop(object);
                break;
            case 'i':
                landed = doFallStop(object);
                break;
            case 'j':
                landed = doFallStop(object);
                break;
            case 'k':
                landed = doFallStop(object);
                break;
            case 'l':
                landed = doFallStop(object);
                break;
            case 'm':
                landed = doFallStop(object);
                break;
            case 'n':
                landed = doFallStop(object);
                break;
            case 'o':
                landed = doFallStop(object);
                break;
            case 'p':
                landed = doFallStop(object);
                break;
            case 'q':
                slush.setFalling(false);
                collison = true;
                landed = false;
                break;
            case 'r':
                slush.setFalling(false);
                collison = true;
                landed = false;
                break;
            case 'A':

                break;
            case 'B':

                break;
            case 'C':

                break;
            case 'D':

                break;
            case 'E':
                landed = doFallStop(object);
                break;
            case 'F':

                break;
            case 'G':

                break;
            case 'H':

                break;
            case 'I':
                System.out.println("END OF LEVEL REACHED!!!!!!!!!");
                break;
            case 'J':
                landed = doFallStop(object);
                break;
            case 'K':

                break;
            case 'L':

                break;
            case 'M':                                 //last object so far

                break;
            case 'N':

                break;
            case 'O':

                break;
            case 'P':

                break;
            case 'Q':

                break;
            case 'R':

                break;
            case '1':                     //reserved for future collisions

                break;
            case '2':

                break;
            case '3':

                break;
            case '4':

                break;
            case '5':

                break;
            case '6':

                break;
            case '7':

                break;
            case '8':

                break;
            case '9':

                break;
            default:                          // no collision
                System.out.println("default hit in carryout collison in slush");
                slush.setFalling(true);
                collison = false;
                break;
        }
        return landed;
    }
    @Override
    public boolean collide(Actor object) {
        boolean collisionDetect = false;
        if(slush.slush.spriteFrame.getBoundsInParent().intersects(object.getSpriteFrame().getBoundsInParent())){
            collisionDetect = true;
        }
        return collisionDetect;
    }
    public boolean doFallStop(Actor o){                               //if slush has landed correctly
        boolean highEnoughToLand = false;
        if((o.spriteFrame.getTranslateY()<=slush.slush.spriteFrame.getTranslateY()+(HEIGHTPX-10))){  //if slush is higher than object
            if(!(o.spriteFrame.getTranslateY() < slush.slush.spriteFrame.getTranslateY()+HEIGHTPX-10)){   //but not lower than its top
                slush.setFalling(false);
                collison = true;
                highEnoughToLand = true;
            }
        }
        return highEnoughToLand;
    }
    public void movement(){
      if((counter>=60)||(spriteCurr>=9)){
            counter=0;
            spriteCurr=0;
            if(slush.isJump()){
                slush.setJump();
            }
            if(slush.isAttack()){
                slush.setAttack();
                reset = true;
            }
        }
        counter+=1;
        if((counter%5)==0){
            spriteCurr++;
        }
        if(slush.isJumping()){
            iY += jumpFactor;
            jumpCounter++;
            if(jumpCounter==jumpheight){
                jumpCounter = 0;
                slush.setJumping(false);
                slush.setJump();
                slush.setFalling(true);
            }
        }
        if(slush.isAttack()){
            if(reset){
                reset = false;
                throwSword();
            }
        }


    }
    public void setDirection(){
        if(isFlipH){                                   //facing left
            super.getSpriteFrame().setScaleX(-1);
        }else{                                        //facing right
            super.getSpriteFrame().setScaleX(1);
        }
    }
    public void setXYLocation(){
        if(slush.isRight()) {iX += vX;}
        if(slush.isLeft())  {iX -= vX;}
        if(slush.isDown())  {}
        if(slush.isUp())    {}
    }
    private void setBoundries(){
        if (iX >= rightBoundary)  { iX=rightBoundary;  }
        if (iX <= leftBoundary)   { iX=leftBoundary;   }
        if (iY >= bottomBoundary) { iY=bottomBoundary; }
        if (iY <= topBoundary)    { iY=topBoundary;    }
    }
    private void setImageState(){
        if(!slush.isRight() &&                                                           //idle
                !slush.isLeft()  &&
                !slush.isDown()  &&
                !slush.isUp()    &&
                !slush.isAttack() &&
                !slush.isJump()  ) {
            Actor.imageStates = idle;
            super.getSpriteFrame().setImage(imageStates.get(spriteCurr));
        }else if(slush.isRight() &&                                                    //right jumping attack
                !slush.isLeft()  &&
                !slush.isDown()  &&
                !slush.isUp()    &&
                slush.isAttack() &&
                slush.isJump()  ) {
            Actor.imageStates = jumpAttack;
            super.getSpriteFrame().setImage(imageStates.get(spriteCurr));
        }else if(!slush.isRight() &&                                                  //left jumping attack
                slush.isLeft()  &&
                !slush.isDown()  &&
                !slush.isUp()    &&
                slush.isAttack() &&
                slush.isJump()  ) {
            Actor.imageStates = jumpAttack;
            super.getSpriteFrame().setImage(imageStates.get(spriteCurr));
        }else if(!slush.isRight() &&                                                  //standing jumping attack
                !slush.isLeft()  &&
                !slush.isDown()  &&
                !slush.isUp()    &&
                slush.isAttack() &&
                slush.isJump()  ) {
            Actor.imageStates = jumpAttack;
            super.getSpriteFrame().setImage(imageStates.get(spriteCurr));
        }else if(slush.isRight() &&                                                  //right jumping
                !slush.isLeft()  &&
                !slush.isDown()  &&
                !slush.isUp()    &&
                !slush.isAttack() &&
                slush.isJump()  ) {
            Actor.imageStates = jump;
            super.getSpriteFrame().setImage(imageStates.get(spriteCurr));
        }else if(!slush.isRight() &&                                                  //left jumping
                slush.isLeft()  &&
                !slush.isDown()  &&
                !slush.isUp()    &&
                !slush.isAttack() &&
                slush.isJump()  ) {
            Actor.imageStates = jump;
            super.getSpriteFrame().setImage(imageStates.get(spriteCurr));
        }else if(slush.isRight() &&                                                  //right walking
                !slush.isLeft()  &&
                !slush.isDown()  &&
                !slush.isUp()    &&
                !slush.isAttack() &&
                !slush.isJump()  ) {
            Actor.imageStates = walk;
            super.getSpriteFrame().setImage(imageStates.get(spriteCurr));
        }else if(!slush.isRight() &&                                                  //left walking
                slush.isLeft()  &&
                !slush.isDown()  &&
                !slush.isUp()    &&
                !slush.isAttack() &&
                !slush.isJump()  ) {
            Actor.imageStates = walk;
            super.getSpriteFrame().setImage(imageStates.get(spriteCurr));
        }else if(!slush.isRight() &&                                                  //standing jump
                slush.isJump() &&
                !slush.isLeft()  &&
                !slush.isDown()  &&
                !slush.isUp()    &&
                !slush.isAttack()){
            Actor.imageStates = jump;
            super.getSpriteFrame().setImage(imageStates.get(spriteCurr));
        }else if( !slush.isRight() &&                                                //standing attack
                !slush.isLeft()  &&
                !slush.isDown()  &&
                !slush.isUp()    &&
                slush.isAttack() &&
                !slush.isJump()) {
            Actor.imageStates = attack;
            super.getSpriteFrame().setImage(imageStates.get(spriteCurr));
        }else if(slush.isDown()) {                                                   //lay down
            Actor.imageStates = dead;
            super.getSpriteFrame().setImage(imageStates.get(spriteCurr));
        }else if ((slush.isLeft()&&(slush.isRun()))){                                //run left
            Actor.imageStates = run;
            super.getSpriteFrame().setImage(imageStates.get(spriteCurr));
        }else if ((slush.isRight()&&(slush.isRun()))){                               //run right
            Actor.imageStates = run;
            super.getSpriteFrame().setImage(imageStates.get(spriteCurr));
        }
    }
    private void moveSlush(double x, double y){
        if(slush.isRight()){
            super.getSpriteFrame().setTranslateX(super.getSpriteFrame().getTranslateX()+ (vX));
        }else if(slush.isLeft()){
            super.getSpriteFrame().setTranslateX(super.getSpriteFrame().getTranslateX()- (vX));
        }
        super.getSpriteFrame().setTranslateY(iY);
        root = slush.getRoot();
        for(int i =0;i<slush.getRoot().getChildren().size();i++){
            if((slush.isLeft())){
                if(!((root.getChildren().get(i)instanceof HBox)||(root.getChildren().get(i)instanceof Button))){
                    //slush.propList.get(i).spriteFrame.setTranslateX(slush.propList.get(i).spriteFrame.getTranslateX()+ (vX));
                    slush.getRoot().getChildren().get(i).setTranslateX(slush.getRoot().getChildren().get(i).getTranslateX()+ (vX));
                }

            }else if ((slush.isRight())){
                if(!((root.getChildren().get(i)instanceof HBox)||(root.getChildren().get(i)instanceof Button))) {
                    //slush.propList.get(i).spriteFrame.setTranslateX(slush.propList.get(i).spriteFrame.getTranslateX()- (vX));
                    slush.getRoot().getChildren().get(i).setTranslateX(slush.getRoot().getChildren().get(i).getTranslateX() - (vX));
                }
            }
        }
    }
    private void throwSword() {
        if(isFlipH){                       //facing left
            //System.out.println("throw "+slush.isUp());
            if ((slush.isUp()) && (slush.isLeft())) {
                Prop currProp = new Prop("M150 0 L75 200 L225 200 Z", slush.slush.spriteFrame.getTranslateX(), slush.slush.spriteFrame.getTranslateY(), sword.get(7));
                currProp.getSpriteFrame().setTranslateX((currProp.getSpriteFrame().getTranslateX()) - 25);
                currProp.getSpriteFrame().setTranslateY((currProp.getSpriteFrame().getTranslateY()) - 10);
                currProp.setType('7');
                slush.propList.add(currProp);
                slush.getRoot().getChildren().add(currProp.getSpriteFrame());
            }else if((slush.isLeft())&&(slush.isDown())){
                Prop currProp = new Prop("M150 0 L75 200 L225 200 Z", slush.slush.spriteFrame.getTranslateX(),slush.slush.spriteFrame.getTranslateY() ,sword.get(5));
                currProp.getSpriteFrame().setTranslateX((currProp.getSpriteFrame().getTranslateX())-25);
                currProp.getSpriteFrame().setTranslateY((currProp.getSpriteFrame().getTranslateY())+20);
                currProp.setType('5');
                slush.propList.add(currProp);
                slush.getRoot().getChildren().add(currProp.getSpriteFrame());
            }else if(slush.isUp()) {
                Prop currProp = new Prop("M150 0 L75 200 L225 200 Z", slush.slush.spriteFrame.getTranslateX(), slush.slush.spriteFrame.getTranslateY(), sword.get(0));
                currProp.getSpriteFrame().setTranslateX((currProp.getSpriteFrame().getTranslateX()) );
                currProp.getSpriteFrame().setTranslateY((currProp.getSpriteFrame().getTranslateY()) - 10);
                currProp.setType('0');
                slush.propList.add(currProp);
                slush.getRoot().getChildren().add(currProp.getSpriteFrame());
            }else{
                Prop currProp = new Prop("M150 0 L75 200 L225 200 Z", slush.slush.spriteFrame.getTranslateX(), slush.slush.spriteFrame.getTranslateY(), sword.get(6));
                currProp.getSpriteFrame().setTranslateX((currProp.getSpriteFrame().getTranslateX()) - 25);
                currProp.getSpriteFrame().setTranslateY((currProp.getSpriteFrame().getTranslateY()) + 10);
                currProp.setType('6');
                slush.propList.add(currProp);
                slush.getRoot().getChildren().add(currProp.getSpriteFrame());

            }
        }else{                             //facing right
            //System.out.println("throw right"+slush.isUp());
            if((slush.isUp())&&(slush.isRight())){
                Prop currProp = new Prop("M150 0 L75 200 L225 200 Z", slush.slush.spriteFrame.getTranslateX(), slush.slush.spriteFrame.getTranslateY(), sword.get(1));
                currProp.getSpriteFrame().setTranslateX((currProp.getSpriteFrame().getTranslateX()) + 25);
                currProp.getSpriteFrame().setTranslateY((currProp.getSpriteFrame().getTranslateY()) - 10);
                currProp.setType('1');
                slush.propList.add(currProp);
                slush.getRoot().getChildren().add(currProp.getSpriteFrame());
            }else if((slush.isRight())&&(slush.isDown())){
                Prop currProp = new Prop("M150 0 L75 200 L225 200 Z", slush.slush.spriteFrame.getTranslateX(),slush.slush.spriteFrame.getTranslateY() ,sword.get(3));
                currProp.getSpriteFrame().setTranslateX((currProp.getSpriteFrame().getTranslateX())+25);
                currProp.getSpriteFrame().setTranslateY((currProp.getSpriteFrame().getTranslateY())+20);
                currProp.setType('3');
                slush.propList.add(currProp);
                slush.getRoot().getChildren().add(currProp.getSpriteFrame());
            }else if(slush.isUp()) {
                Prop currProp = new Prop("M150 0 L75 200 L225 200 Z", slush.slush.spriteFrame.getTranslateX(), slush.slush.spriteFrame.getTranslateY(), sword.get(0));
                currProp.getSpriteFrame().setTranslateX((currProp.getSpriteFrame().getTranslateX()));
                currProp.getSpriteFrame().setTranslateY((currProp.getSpriteFrame().getTranslateY()) - 10);
                currProp.setType('0');
                slush.propList.add(currProp);
                slush.getRoot().getChildren().add(currProp.getSpriteFrame());
            }else{
                Prop currProp = new Prop("M150 0 L75 200 L225 200 Z", slush.slush.spriteFrame.getTranslateX(), slush.slush.spriteFrame.getTranslateY(), sword.get(2));
                currProp.getSpriteFrame().setTranslateX((currProp.getSpriteFrame().getTranslateX()) + 25);
                currProp.getSpriteFrame().setTranslateY((currProp.getSpriteFrame().getTranslateY()) + 10);
                currProp.setType('2');
                slush.propList.add(currProp);
                slush.getRoot().getChildren().add(currProp.getSpriteFrame());
            }
        }
    }
    public void setSpriteCurr(int spriteCurr) {this.spriteCurr = spriteCurr;}
    public void setCounter(int counter) {this.counter = counter;}



}
