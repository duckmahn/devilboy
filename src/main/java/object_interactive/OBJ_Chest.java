package object_interactive;

import javagame1.GamePanel;
import object.Object;
import util.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class OBJ_Chest extends Object {

    public OBJ_Chest(GamePanel gamePanel) {
        super(gamePanel);
        setName("Chest");

        try {
            BufferedImage image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/images/objects/chest.png")));
            setImage1(UtilityTool.scaleImage(image, gamePanel.getTileSize(), gamePanel.getTileSize()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
