/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ThuyTrang
 */
public class PopUp extends JFrame{
    public PopUp(String message,Carrier a){
    	this.setLocationRelativeTo(null);
        JLabel label = new JLabel(message);
        super.setLayout(new BorderLayout());
        this.setSize(label.getWidth()*9+50,label.getHeight()+125);
        super.add(label,BorderLayout.CENTER);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        a.add(this);
        super.setVisible(true);
    }
    public PopUp(BufferedImage pic,Carrier a){
    	this.setLocation(1200,400);
        //this.setLayout(new BorderLayout());
        super.setSize(pic.getWidth() + 100,pic.getHeight()+100);
        super.add(new JLabel(new ImageIcon(pic)));
        a.add(this);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.setVisible(true);
    }

}
