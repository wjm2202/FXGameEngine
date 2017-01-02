package sounds;

import javafx.concurrent.Task;
import javafx.scene.media.AudioClip;

import java.net.URL;

import static javafx.scene.media.AudioClip.INDEFINITE;

/**
 * create and play sound effect events for game play
 * Created by Liandri on 2/10/2016.
 */
public class SoundEffects {


    private boolean running = false;

    final  URL clipURL1 = getClass().getResource("/sounds/run.wav");
    final AudioClip clip1 = new AudioClip(clipURL1.toString());

    final  URL clipURL2 = getClass().getResource("/sounds/blast3.wav");
    final AudioClip clip2 = new AudioClip(clipURL2.toString());

    final  URL clipURL3 = getClass().getResource("/sounds/launch.wav");
    final AudioClip clip3 = new AudioClip(clipURL3.toString());

    final  URL clipURL4 = getClass().getResource("/sounds/tankHit.wav");
    final AudioClip clip4 = new AudioClip(clipURL4.toString());

    final  URL clipURL5 = getClass().getResource("/sounds/powerup.wav");
    final AudioClip clip5 = new AudioClip(clipURL5.toString());

    public void run() {
        clip1.play();
    }
    public void playBlast() {
        clip2.play();
    }
    public void playLaunch() {
        clip3.play();
    }
    public void tankHit() {
        clip4.play();
    }
    public void powerUp() {
        clip5.play();
    }
    public boolean isRunning() {
        return running;
    }
    public void setRunning(boolean running) {
        this.running = running;
    }
    public void music(){
        final Task task = new Task() {

            @Override
            protected Object call() throws Exception {
                int s = INDEFINITE;
                AudioClip audio = new AudioClip(getClass().getResource("/sounds/music.wav").toExternalForm());
                audio.setVolume(0.3f);
                audio.setCycleCount(s);
                audio.play();
                return null;
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }

}
