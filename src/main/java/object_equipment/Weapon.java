package object_equipment;

import javagame1.GamePanel;
import object.Object;

import java.awt.*;

public class Weapon extends Object {
    private Rectangle attackArea = new Rectangle(0, 0, 0, 0);
    private int attackValue;

    public Weapon(GamePanel gamePanel) {
        super(gamePanel);
    }

    public Rectangle getAttackArea() {
        return attackArea;
    }

    public void setAttackArea(Rectangle attackArea) {
        this.attackArea = attackArea;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }
}
