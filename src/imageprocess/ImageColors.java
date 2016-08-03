package imageprocess;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Pablo on 8/3/2016.
 */
public class ImageColors{
    BufferedImage bufferedImage;

    //constructor to pass bufferedImage;
    public ImageColors(BufferedImage bufferedImage){

        this.bufferedImage = bufferedImage;

    }

    public HashMap<Integer, RGB> getRGB(){
        //get width and height of buffered image;
        HashMap<Integer, RGB> rgbList = new HashMap<>();
        int height = bufferedImage.getHeight();
        int width = bufferedImage.getWidth();
        RGB rgb = new RGB();

        int iteration = height*width;
        int count = 0;
        System.out.println("Will iterate over image "+iteration+" times");
        //use nested for loop to iterate through height and width position;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                count++;
                Color c = new Color(bufferedImage.getRGB(j, i));
                //set red blue and green of rgb, prevent reinstantiation for optimization
                rgb.setR(c.getRed());
                rgb.setG(c.getGreen());
                rgb.setB(c.getBlue());
                System.out.print("Red: "+rgb.getR()+" ");
                System.out.println("Green: "+rgb.getG()+" ");
                System.out.print("Yellow: "+rgb.getB()+" ");


                /// TODO: 8/3/2016 run a bench mark for reinstantiating rgb and setting rgb
                rgbList.put(count, rgb);

            }
        }


       return rgbList;
    }






}
