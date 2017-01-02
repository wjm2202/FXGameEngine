package assets;

import javafx.scene.image.Image;

import java.util.ArrayList;

/**
 * Created by Liandri on 10/11/2016.
 */
public class LoadImgAssets {

//Slush
    protected ArrayList<Image> attack = new ArrayList<>();
    protected ArrayList<Image> dead = new ArrayList<>();
    protected ArrayList<Image> idle = new ArrayList<>();
    protected ArrayList<Image> jump = new ArrayList<>();
    protected ArrayList<Image> jumpAttack = new ArrayList<>();
    protected ArrayList<Image> run = new ArrayList<>();
    protected ArrayList<Image> walk = new ArrayList<>();
//platforms
    protected ArrayList<Image> platforms = new ArrayList<>();


    public LoadImgAssets(){
        loadSlushImgs();
    }

    public void loadSlushImgs(){
        attack.add(new Image("/resources/pics/attack/attack1.png"));attack.add(new Image("/resources/pics/attack/attack2.png"));attack.add(new Image("/resources/pics/attack/attack3.png"));
        attack.add(new Image("/resources/pics/attack/attack4.png"));attack.add(new Image("/resources/pics/attack/attack5.png"));attack.add(new Image("/resources/pics/attack/attack6.png"));
        attack.add(new Image("/resources/pics/attack/attack7.png"));attack.add(new Image("/resources/pics/attack/attack8.png"));attack.add(new Image("/resources/pics/attack/attack9.png"));
        attack.add(new Image("/resources/pics/attack/attack10.png"));

        dead.add(new Image("/resources/pics/dead/Dead1.png"));dead.add(new Image("/resources/pics/dead/Dead2.png"));dead.add(new Image("/resources/pics/dead/Dead3.png"));
        dead.add(new Image("/resources/pics/dead/Dead4.png"));dead.add(new Image("/resources/pics/dead/Dead5.png"));dead.add(new Image("/resources/pics/dead/Dead6.png"));
        dead.add(new Image("/resources/pics/dead/Dead7.png"));dead.add(new Image("/resources/pics/dead/Dead8.png"));dead.add(new Image("/resources/pics/dead/Dead9.png"));
        dead.add(new Image("/resources/pics/dead/Dead10.png"));

        idle.add(new Image("/resources/pics/idle/idle1.png"));idle.add(new Image("/resources/pics/idle/idle2.png"));idle.add(new Image("/resources/pics/idle/idle3.png"));
        idle.add(new Image("/resources/pics/idle/idle4.png"));idle.add(new Image("/resources/pics/idle/idle5.png"));idle.add(new Image("/resources/pics/idle/idle6.png"));
        idle.add(new Image("/resources/pics/idle/idle7.png"));idle.add(new Image("/resources/pics/idle/idle8.png"));idle.add(new Image("/resources/pics/idle/idle9.png"));
        idle.add(new Image("/resources/pics/idle/idle10.png"));

        jump.add(new Image("/resources/pics/jump/jump1.png"));jump.add(new Image("/resources/pics/jump/jump2.png"));jump.add(new Image("/resources/pics/jump/jump3.png"));
        jump.add(new Image("/resources/pics/jump/jump4.png"));jump.add(new Image("/resources/pics/jump/jump5.png"));jump.add(new Image("/resources/pics/jump/jump6.png"));
        jump.add(new Image("/resources/pics/jump/jump7.png"));jump.add(new Image("/resources/pics/jump/jump8.png"));jump.add(new Image("/resources/pics/jump/jump9.png"));
        jump.add(new Image("/resources/pics/jump/jump10.png"));

        jumpAttack.add(new Image("/resources/pics/jumpattack/jumpattack1.png"));jumpAttack.add(new Image("/resources/pics/jumpattack/jumpattack2.png"));
        jumpAttack.add(new Image("/resources/pics/jumpattack/jumpattack3.png"));jumpAttack.add(new Image("/resources/pics/jumpattack/jumpattack4.png"));
        jumpAttack.add( new Image("/resources/pics/jumpattack/jumpattack5.png"));jumpAttack.add(new Image("/resources/pics/jumpattack/jumpattack6.png"));
        jumpAttack.add(new Image("/resources/pics/jumpattack/jumpattack7.png"));jumpAttack.add(new Image("/resources/pics/jumpattack/jumpattack8.png"));
        jumpAttack.add(new Image("/resources/pics/jumpattack/jumpattack9.png"));jumpAttack.add(new Image("/resources/pics/jumpattack/jumpattack10.png"));

        run.add(new Image("/resources/pics/run/run1.png"));run.add(new Image("/resources/pics/run/run2.png"));run.add(new Image("/resources/pics/run/run3.png"));
        run.add(new Image("/resources/pics/run/run4.png"));run.add(new Image("/resources/pics/run/run5.png"));run.add(new Image("/resources/pics/run/run6.png"));
        run.add(new Image("/resources/pics/run/run7.png"));run.add(new Image("/resources/pics/run/run8.png"));run.add(new Image("/resources/pics/run/run9.png"));
        run.add(new Image("/resources/pics/run/run10.png"));

        walk.add(new Image("/resources/pics/walk/walk1.png"));walk.add(new Image("/resources/pics/walk/walk2.png"));walk.add(new Image("/resources/pics/walk/walk3.png"));
        walk.add(new Image("/resources/pics/walk/walk4.png"));walk.add(new Image("/resources/pics/walk/walk5.png"));walk.add(new Image("/resources/pics/walk/walk6.png"));
        walk.add(new Image("/resources/pics/walk/walk7.png"));walk.add(new Image("/resources/pics/walk/walk8.png"));walk.add(new Image("/resources/pics/walk/walk9.png"));
        walk.add(new Image("/resources/pics/walk/walk10.png"));

    }

    public ArrayList<Image> getPlatforms(){return platforms;}

    public ArrayList<Image> getAttack() {
        return attack;
    }

    public void setAttack(ArrayList<Image> attack) {
        this.attack = attack;
    }

    public ArrayList<Image> getDead() {
        return dead;
    }

    public void setDead(ArrayList<Image> dead) {
        this.dead = dead;
    }

    public ArrayList<Image> getIdle() {
        return idle;
    }

    public void setIdle(ArrayList<Image> idle) {
        this.idle = idle;
    }

    public ArrayList<Image> getJump() {
        return jump;
    }

    public void setJump(ArrayList<Image> jump) {
        this.jump = jump;
    }

    public ArrayList<Image> getJumpAttack() {
        return jumpAttack;
    }

    public void setJumpAttack(ArrayList<Image> jumpAttack) {
        this.jumpAttack = jumpAttack;
    }

    public ArrayList<Image> getRun() {
        return run;
    }

    public void setRun(ArrayList<Image> run) {
        this.run = run;
    }

    public ArrayList<Image> getWalk() {
        return walk;
    }

    public void setWalk(ArrayList<Image> walk) {
        this.walk = walk;
    }
}
