package object_equipment;

import javagame1.GamePanel;
import object.Object;
import util.UtilityTool;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class OBJ_Boots extends Object {

    public OBJ_Boots(GamePanel gamePanel) {
        super(gamePanel);

        setName("Boots");
        setDescription("[" + getName() + "]\nA pair of old boots");

        try {
            BufferedImage image = ImageIO.read(Objects.requireNonNull(getClass().getResourceAsStream("/images/objects/boots.png")));
            setImage1(UtilityTool.scaleImage(image, gamePanel.getTileSize(), gamePanel.getTileSize()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
