/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject;

import gameproject.allslot.Property;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 *
 * @author ThuyTrang
 */
public class Sold extends JFrame{
	
    ArrayList<Property> a ;
    boolean[] mortgage,sell;
    Player player;
    public Sold(Player player,Carrier y){
//    	JComponent jframe = null;
		this.setSize(600,400);
    	this.setLocation(1200,400);
        this.player = player;
        a = player.getPersonAcc().getProperties();
        y.add(this);
        if(a.size() != 0){
            mortgage = new boolean[a.size()];
            sell = mortgage.clone();
            int s = 0;
            ArrayList<Panel> b = new ArrayList();
            for(Property i:a){
                mortgage[s] = false;
                sell[s] = false;
                if(i.isMortgage()) mortgage[s] = true;
                b.add(new Panel(i,mortgage,sell));
                super.add(b.get(s));
                s++;
            }
            JPanel e = new JPanel();
            JButton okBtn = new JButton("OK"),okUp = new JButton("OK AND\n"
                                                            + "UPGRADE");
            okBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                action();
                GameProject.stop = true;
                }
            });
            okUp.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    action();
                    GameProject.stop = true;
                    GameProject.upgradeProperties(player);
                }
            });
            e.setLayout(new GridBagLayout());
            GridBagConstraints gc = new GridBagConstraints();
        
            gc.gridx = 0;
            gc.gridy = 0;
            gc.anchor = GridBagConstraints.LINE_START;
            e.add(okBtn,gc);
        
            gc.gridx = 1;
            gc.anchor = GridBagConstraints.LINE_END;
            e.add(okUp,gc);
            Panel.reSetNum(); 
            super.add(e);
            super.setLayout(new BoxLayout (this.getContentPane(), BoxLayout.Y_AXIS)); 
            super.setVisible(true);
        }
        
    }
    public void action(){
        int s = 0;
        ArrayList<Property> arrayList = (ArrayList) a.clone();
        for(Property i: arrayList){
            if(sell[s]) player.getPersonAcc().buyOrSell(i,false);
            if(!i.isMortgage()&& mortgage[s]) i.setMortaged();
            if(i.isMortgage() && !mortgage[s]) i.deMortagage();
            s++;
        }
    }
}
class Panel extends JPanel{
    private static int num = 0;
    private int index;
    public Panel(Property property,boolean[] m,boolean[] s){
        index = num;
        System.out.println(index);
        System.out.println(m.length);
        num++;
        super.setSize(400,10);
        boolean prev1 = m[index], prev2 = s[index];
        super.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        super.add(new JLabel(property.getName()),gc);
        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.CENTER;
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        JMenuItem nothing = new JMenuItem("Nothing");
        JMenuItem sell = new JMenuItem("Sell");
        String a = "Mortgage";
        if(property.isMortgage()) a = "Unmortgage";
        JMenuItem mortgage = new JMenuItem(a);
        nothing.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                m[index] = prev1;
                s[index] = prev2;
            }
        });
        sell.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                m[index] = prev1;
                s[index] = true;
            }
            
        });
        mortgage.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                m[index] = !prev1;
                s[index] = false;
            }   
        });
        
        menu.add(nothing);
        menu.add(sell);
        menu.add(mortgage);
        bar.add(menu);
        super.add(bar,gc);
    }
    public static void reSetNum(){
        num = 0;
    }
}