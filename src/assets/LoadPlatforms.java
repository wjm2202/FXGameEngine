package assets;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

/**
 * Created by Liandri on 28/12/2016.
 */
public class LoadPlatforms {

    private ArrayList<Image> platforms = new ArrayList<>();
    private ArrayList<Image> objects = new ArrayList<>();

    public LoadPlatforms(){
        LoadPlatformsToArray();
        LoadObjectToArray();
    }

    public void LoadPlatformsToArray(){
        for(int i =1; i<=18;i++){
            platforms.add(new Image("/resources/pics/platforms/"+i+".png"));
        }
    }
    public void LoadObjectToArray(){
        for(int i =1; i<=12;i++){
            objects.add(new Image("/resources/pics/objects/"+i+".png"));
        }
    }
    public Image getPlatform(int i){
        return this.platforms.get(i);
    }
    public Image getObjects(int i){
        return this.objects.get(i);
    }
}
