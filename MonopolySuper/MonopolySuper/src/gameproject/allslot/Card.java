/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject.allslot;

import gameproject.GameProject;
import gameproject.Player;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author ThuyTrang
 */
public abstract class Card {
    protected String link;
    BufferedImage k;

    /**
     *
     * @param link
     */
    public Card(String link) {
        this.link = link;
    }

    public abstract void Instruction(Player player); 
    protected void display(){
        try {
            k = ImageIO.read(new File(link));
        } 
        catch (IOException ex) {
        }
        GameProject.displayImage(k);
        k = null;
    }
}
