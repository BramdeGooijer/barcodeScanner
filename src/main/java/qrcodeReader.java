import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;

public class qrcodeReader {
    public static void main(String[] args) {
        try {
            // joi
            String path = "D:\\Bram de Gooijer\\HU\\Blok D\\BEP\\barcodeScanner\\src\\main\\java\\IMG_3130.jpg";

            BufferedImage bf = ImageIO.read(new FileInputStream(path));

            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(bf)));

            Result result = new MultiFormatReader().decode(bitmap);

            System.out.println(result.getText());
        } catch (Exception e) {
            System.out.println("something went wrong: " + e.getMessage());
        }
    }
}
