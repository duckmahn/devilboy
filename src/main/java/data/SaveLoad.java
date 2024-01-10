/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javagame1.GamePanel;

/**
 *
 * @author ASUS
 */
public class SaveLoad {
    GamePanel gp;
    
    public SaveLoad(GamePanel gp){
        this.gp = gp;  
    }
    public void save ()
    {
        try{
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("Save.dat")));
                DataStorage ds = new DataStorage();
                ds.level = gp.player.level;
                ds.maxlife = gp.player.maxLife;
                ds.maxMana = gp.player.maxMana;
                ds.strength = gp.player.strength;
                ds.dexterity = gp.player.dexterity;
                ds.exp = gp.player.exp;
                ds.nextLevelExp = gp.player.nextLevelExp;
                ds.coin = gp.player.coins;
                
                oos.writeObject(ds);
                
           
           }
        catch(Exception e)
        {
            System.out.println("Save Exception!");
        }
        
    }
    public void load()
    {
        try {
        ObjectInputStream ois = new ObjectInputStream (new FileInputStream(new File ("Save.dat")));
        DataStorage ds = (DataStorage)ois.readObject();
                gp.player.level = ds.level;            
                gp.player.maxLife = ds.maxlife;
                gp.player.maxMana = ds.maxMana;
                gp.player.strength = ds.strength;
                gp.player.dexterity = ds.dexterity;
                gp.player.exp = ds.exp ;
                gp.player.nextLevelExp = ds.nextLevelExp;
                gp.player.coins = ds.coin;
                
                
        }catch(Exception e)
        {
            System.out.println("load Exception!");
        }
    }
     
    
}
