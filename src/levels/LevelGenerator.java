package levels;

import actors.Prop;
import assets.LoadPlatforms;
import main.Main;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Liandri on 19/12/2016.
 */
public class LevelGenerator {

    InputStream ist = null;
    private double left = -((Main.WIDTH/2));
    private double top = -((Main.HEIGHT/2)-60);
    private double xLoc = left;
    private double yLoc = top;
    private double objOffset = 13;
    private int spaceX = 52;
    private int spaceY = 52;
    private ArrayList<Prop> props = new ArrayList<>();
    private Prop currProp;
    public LoadPlatforms img = new LoadPlatforms();


    public ArrayList<Prop>  getPropsForLevel(int i){
        try{
            String fileLoc = "levelTxtFiles/" + i + ".txt";
            ist = new FileInputStream(fileLoc);
        }catch(Exception fnf){
            System.out.println("File not found for level "+ i);
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(ist));

        String line;

        try{
            while((line = in.readLine()) != null){

                for (int j = 0; j <= line.length()-1; j++) {
                    char  c = line.charAt(j);
                    // OPERATIONS
                    //int test = Character.getNumericValue(c);
                    //System.out.print(test);
                    switch(c){
                        case 'a':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(0));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('a');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("a");
                            break;
                        case 'b':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(1));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('b');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("b");
                            break;
                        case 'c':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(2));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('c');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("c");
                            break;
                        case 'd':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(3));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('d');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("d");
                            break;
                        case 'e':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(4));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('e');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("e");
                            break;
                        case 'f':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(5));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('f');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("f");
                            break;
                        case 'g':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(6));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('g');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("g");
                            break;
                        case 'h':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(7));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('h');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("h");
                            break;
                        case 'i':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(8));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('i');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("i");
                            break;
                        case 'j':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(9));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('j');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("j");
                        case 'k':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(10));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('k');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("k");
                            break;
                        case 'l':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(11));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('l');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("l");
                            break;
                        case 'm':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(12));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc-8);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('m');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("m");
                            break;
                        case 'n':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(13));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc-8);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('n');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("n");
                            break;
                        case 'o':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(14));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc-8);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('o');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("o");
                            break;
                        case 'p':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(15));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('p');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("p");
                            break;
                        case 'q':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(16));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('q');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("q");
                            break;
                        case 'r':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getPlatform(17));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('r');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("r");
                            break;
                        case 'A':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getObjects(0));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc+objOffset);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('A');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("A");
                            break;
                        case 'B':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getObjects(1));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc+objOffset);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('B');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("B");
                            break;
                        case 'C':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getObjects(2));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc+objOffset+5);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('C');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("C");
                            break;
                        case 'D':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getObjects(3));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc+objOffset+5);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('D');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("D");
                            break;
                        case 'E':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getObjects(4));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc+objOffset-15);
                            currProp.getSpriteFrame().setScaleX(.7);
                            currProp.getSpriteFrame().setScaleY(.7);
                            currProp.setType('E');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("E");
                            break;
                        case 'F':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getObjects(5));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc+objOffset+3);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('F');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("F");
                            break;
                        case 'G':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getObjects(6));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc+objOffset+3);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('G');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("G");
                            break;
                        case 'H':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getObjects(7));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc+objOffset);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('H');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("H");
                            break;
                        case 'I':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getObjects(8));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc+objOffset);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('I');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("I");
                            break;
                        case 'J':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getObjects(9));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc+objOffset+5);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('J');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("J");
                        case 'K':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getObjects(10));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc+objOffset+5);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('K');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("K");
                            break;
                        case 'L':
                            currProp = new Prop("M150 0 L75 200 L225 200 Z", 0, 0,img.getObjects(11));
                            currProp.getSpriteFrame().setTranslateX(xLoc);
                            currProp.getSpriteFrame().setTranslateY(yLoc+objOffset-47);
                            currProp.getSpriteFrame().setScaleX(.4);
                            currProp.getSpriteFrame().setScaleY(.4);
                            currProp.setType('L');
                            props.add(currProp);
                            xLoc += spaceX;
                            System.out.print("L");
                            break;
                        default:
                            xLoc += spaceX;
                            System.out.print(" ");
                            break;
                    }
                }
                yLoc += spaceY;
                xLoc = left;
                System.out.println();
            }
         }catch (IOException ioexcep){
            System.out.println("File not found error!! "+ i + "/n"+ioexcep);
         }
        return props;
    }

}
