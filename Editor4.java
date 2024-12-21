import java.awt.Color;


public class Editor4 {
    public static void main(String[] args) {
        String fileName = args[0];
        int num = Integer.parseInt(args[1]);
        Color[][] sImage = Runigram.read(fileName);
        Color[][] tImage = Runigram.read(fileName);
        Runigram.setCanvas(sImage);
        tImage = Runigram.grayScaled(tImage);
        Runigram.morph(sImage, tImage, num);
    }
}  

