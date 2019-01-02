/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject;

import javax.swing.JFrame;

/**
 *
 * @author ThuyTrang
 */
public class Carrier {
    public boolean d = true;
    private JFrame frame;
    public void add(JFrame frame){
        this.frame = frame;
    }
    public void kill(){
        this.frame.dispose();
    }
}
