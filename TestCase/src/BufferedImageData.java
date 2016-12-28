import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BufferedImageData {
    private BufferedImage image;
    public static void main(String[] args){
        
    }
    private void readImage() {
        String filePath = "image/";
        String fileName = "Lenna.png";
        try {
            image = ImageIO.read(new File(filePath +fileName));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

