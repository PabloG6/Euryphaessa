package tests;


import imageprocess.ImageColors;
import imageprocess.ImageLoader;

import java.awt.image.BufferedImage;

/**
 * Created by Pablo on 8/3/2016.
 */
public class ImageProcessTest {
    public static void main(String[] args) {
        String path = "C:\\Users\\Pablo\\IdeaProjects\\Euryphaessa\\src\\images\\square.png";
        ImageLoader loadImage = new ImageLoader(path);
        BufferedImage bufferedImage = loadImage.getBufferedImage();
        ImageColors imageColors = new ImageColors(bufferedImage);
        imageColors.getRGB();
    }

}
