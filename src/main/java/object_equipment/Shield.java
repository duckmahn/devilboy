package object_equipment;

import javagame1.GamePanel;
import object.Object;

public class Shield extends Object {
    private int defenseValue;

    public Shield(GamePanel gamePanel) {
        super(gamePanel);
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }
}
