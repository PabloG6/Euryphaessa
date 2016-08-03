package imageprocess;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


/**
 * Created by Pablo on 8/3/2016.
 */
public class ImageLoader {


    String imagePath;
    public ImageLoader(String imagePath) {
        //path of image
        this.imagePath = imagePath;
    }

    //load the image
    public BufferedImage getBufferedImage(){
        BufferedImage bufferedImage = null;
        try {
             bufferedImage = ImageIO.read(new File(imagePath));
        } catch (IOException ex){
            ex.printStackTrace();
        }

        return bufferedImage;
    }

}
