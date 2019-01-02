package GUI;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import com.sun.prism.Image;

import BackEnd.ActivateMusic;
import gameproject.GameProject;
import javafx.scene.transform.Affine;
import sun.audio.*;

import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import javax.swing.event.ChangeListener;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.event.ChangeEvent;


public class FrontMenu {
	private int sliderValue = -10;
	private static JFrame Monopoly;
	
	/**
	 * Launch the application.--
	 */
	public static void main(String[] args) {
//		public void run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrontMenu window = new FrontMenu();
					FrontMenu.Monopoly.setVisible(true);
					Monopoly.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the application.
	 *  
	 * 
	 */
	
	public FrontMenu()   {
		
		initialize();
	}
	
	/**
	 * THEME SONG
	 */
	
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		Icon icon2 = new ImageIcon(getClass().getResource("/resources/button.png"));
		Icon icon3 = new ImageIcon(getClass().getResource("/resources/backspace.jpg"));
		
		Monopoly = new JFrame();
		Monopoly.setResizable(false);
		Monopoly.setIconImage(new ImageIcon(getClass().getResource("/resources/leftcorner.jpg")).getImage());
		Monopoly.setTitle("Monopoly");
		Monopoly.setForeground(Color.YELLOW);
		Monopoly.setBackground(new Color(64, 224, 208));
		Monopoly.getContentPane().setBackground(new Color(255, 255, 204));
		
		ActivateMusic mode1 =new ActivateMusic(1); /* INITIALIZING BACKGROUND MUSIC */
		mode1.run();
//		mode1.run();
		
		Monopoly.getContentPane().setLayout(null);
		
		/* *
		 * PLAY BUTTON 
		 * */
		
		JButton PlayButton = new JButton("");
		PlayButton.setBounds(338, 223, 318, 101);
		PlayButton.setForeground(SystemColor.desktop);
		PlayButton.setIcon(icon2);
		PlayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mode1.close();
				
				Thread t1 = new Thread(() -> {backend1();});
//				System.out.println("aaaa");
				t1.start();
//				ingame1.Start();
				Monopoly.dispose();
			}
		});
		
		/* *
		 * SLIDER  
		 * */
		JSlider Slider1 = new JSlider();
		Slider1.setPaintTrack(false);
		Slider1.setBackground(new Color(0, 0, 0));
		Slider1.setSnapToTicks(true);
		Slider1.setToolTipText("");
		Slider1.setMaximum(50);
		Slider1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				sliderValue = Slider1.getValue()-65;
//				System.out.println(sliderValue);
				mode1.changeVolume(sliderValue);
			}
		});
		
		
		Icon giticon = new ImageIcon(getClass().getResource("/resources/Webp.net-resizeimage (23).png"));
		Icon musicicon = new ImageIcon(getClass().getResource("/resources/SMALL.png"));
		
		JLabel git = new JLabel("");
		git.setForeground(Color.WHITE);
		git.setIcon(giticon);
		git.setBounds(810, -12, 130, 150);
		Monopoly.getContentPane().add(git);
		
		JLabel lblNewLabel = new JLabel("netflexx");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Segoe UI Black", lblNewLabel.getFont().getStyle(), 21));
		lblNewLabel.setBounds(914, 34, 103, 39);
		Monopoly.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(musicicon);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Leelawadee UI", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 468, 60, 38);
		Monopoly.getContentPane().add(lblNewLabel_1);
		Slider1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Slider1.setForeground(new Color(0, 0, 153));
		Slider1.setBounds(52, 467, 40, 39);
		Monopoly.getContentPane().add(Slider1);
		PlayButton.setSelectedIcon(null);
		Monopoly.getContentPane().add(PlayButton);
		
		

		JLabel BackGroundPic = new JLabel("");
		BackGroundPic.setBounds(2, -12, 2000, 587);
		BackGroundPic.setBackground(new Color(255, 250, 250));
		BackGroundPic.setIcon(icon3);
		Monopoly.getContentPane().add(BackGroundPic);
		Monopoly.setBounds(100, 100, 1033, 546);
		Monopoly.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void backend1() {
		try {
			GameProject game1 = new GameProject();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
