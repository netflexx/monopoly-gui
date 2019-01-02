package gameproject;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.sun.javafx.tk.Toolkit;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThuyTrang
 */
public class YesNoFrame extends JFrame implements ActionListener{
    private JLabel message;
    private JButton yes,no;
    private Carrier d;
//    frame.setLocationRelativeTo(null);
    public YesNoFrame(String message,Carrier d){
        //int a = JOptionPane.showConfirmDialog(this, message,"", JOptionPane.OK_CANCEL_OPTION);
        super.setLayout(new BorderLayout());
//        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        this.setLocation(1300, 500);
        
        this.d = d;
        this.message = new JLabel(message);
        this.message.setFont(new Font("Leelawadee UI", Font.BOLD, 15));
        this.setSize(new Dimension(message.length()*7 + 25 ,this.message.getHeight()+ 125));
        super.add(this.message,BorderLayout.CENTER);
        this.yes = new JButton("YES");
        this.yes.addActionListener(this);
        this.no = new JButton("NO");
        this.no.addActionListener(this);
        JPanel a = new JPanel();
        a.setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.weightx = 0;
        gc.weighty = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        a.add(this.yes,gc);
        gc.weightx = 1;
        gc.weighty = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        a.add(this.no,gc);
        super.add(a,BorderLayout.SOUTH);
        this.d.add(this);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.d.d = e.getSource().equals(this.yes);
        GameProject.stop = true;
    }
    

}
