package GUI;
import BackEnd.*;
import gameproject.GameProject;

import javax.swing.JFrame;
import javax.xml.stream.events.StartDocument;
import javax.swing.*;
import java.awt.*;

import javax.management.timer.TimerMBean;
import javax.net.ssl.SSLException;
import javax.sound.sampled.*;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;
import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac.IntegrityHmacSHA512;
import com.sun.prism.Image;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Message1_1Impl;

import javafx.scene.transform.Affine;
import sun.audio.*;
import sun.awt.RepaintArea;

import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.CORBA.TRANSACTION_MODE;
import javax.swing.Timer;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToolBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JInternalFrame;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.DropMode;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JMenuBar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class InGame implements Runnable {
	public static int jslider;
	public static int slidervalue;
	public String playername;
	private JFrame frame;
	private JTextField nameField;
	Timer delay,timer9;
	public static JLabel HOUSEP1, Turn, playersbox, tron_theme,P1,P2,P3,P4,P1money,P2money,P3money,P4money,P1title,P2title,P3title,P4title,tossDice,bluemarker,Die1,Die2,Die3,Die4,Die5,Die6;
	
	Thread t1,t2,t3;

	InGame window;
	int totalP, gameTurn;
	int[] CurrentPosition = {0,0,0,0};
	int[] PreviousPosition = {0,0,0,0};
	public int a,b,c,d,enew=0,e=10,zero=0;
	Monopoly m1;
//	ActivateMusic mode2;
	                                                                       //BIG								  //BIG	                                            //BIG					
	               //       Go   <-- 0|  1   2   3   4   5   6   7   8   9 |10  11  12  13  14  15  16  17  18  19  20  21  22  23   24   25   26   27   28   29   30       31++                           39
	public static  int[] x_axis  = {960,830,750,670,590,510,420,340,260,180,50, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40,170,252, 334, 416, 498, 580, 662, 744, 826, 960    ,960,960,960,960,960,960,960,960,960};
	public static  int[] y_axis  = {940,940,940,940,940,940,940,940,940,940,940,800,710,620,540,460,380,300,220,140,40, 40, 40,  40,  40,  40,  40,  40,  40,  40, 40,	   147,227,304,384,464,544,634,714,794};
	public int[] marker_axis = {1170,1370,1570,1770};
	public static JLabel rollingDice;
	public JLabel Noti;
	public static JLabel decoy;
	public static JLabel HOUSEP2;
	public static JLabel HOUSEP3;
	public static JLabel HOUSEP4;
	
	/**
	 * Launch the application.
	 * 
	 * 
	 */
//	SwingUtilities.invokeLater(new InGame());
	
	/*public void Run() {
//	public static void main (String[] args) {
		SwingUtilities.invokeLater(new InGame());
	}*/

	/**
	 * Create the application.
	 */
	
//	public InGame() {
//		
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 */
	
//	public void InitMonopoly(Monopoly m1) {
//		this.m1 = m1;
//		System.out.println(m1);
//	
//	}
//	public void setPlayer(int t) {
//		m1.Start();
//	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	 
	@Override
	public void run() {
//	public void initialize() {
	
		
//		
//		ActivateMusic mode2 = new ActivateMusic(2) ;
//		mode2.start();
	
//		m1.RunGame();
//                Jlabel Die1 = new ImageIcon(getClass().getResource("/resources/backspace.jpg"));
//                PlayButton.setIcon(icon2);
//                Icon icon3 = new ImageIcon(getClass().getResource("/resources/backspace.jpg"));
                

////		public void initialize() {
	//	
//			
////			
////			ActivateMusic mode2 = new ActivateMusic(2) ;
////			mode2.start();
	//	
////			m1.RunGame();
////	                Jlabel Die1 = new ImageIcon(getClass().getResource("/resources/backspace.jpg"));
////	                PlayButton.setIcon(icon2);
////	                Icon icon3 = new ImageIcon(getClass().getResource("/resources/backspace.jpg"));
	                Icon die1icon = new ImageIcon(getClass().getResource("/resources/Die1.png"));
	                Icon die2icon = new ImageIcon(getClass().getResource("/resources/Die2.png"));
	                Icon die3icon = new ImageIcon(getClass().getResource("/resources/Die3.png"));
	                Icon die4icon = new ImageIcon(getClass().getResource("/resources/Die4.png"));
	                Icon die5icon = new ImageIcon(getClass().getResource("/resources/Die5.png"));
	                Icon die6icon = new ImageIcon(getClass().getResource("/resources/Die6.png"));
	                
	                Icon caricon = new ImageIcon(getClass().getResource("/resources/Car.png"));
	                Icon dieicon = new ImageIcon(getClass().getResource("/resources/Die.png"));
	                Icon basketballicon = new ImageIcon(getClass().getResource("/resources/Basketball.png"));
	                Icon dollaricon = new ImageIcon(getClass().getResource("/resources/Dollar.png"));
	                Icon markericon = new ImageIcon(getClass().getResource("/resources/Marker.png"));
	                
	                Icon player1icon = new ImageIcon(getClass().getResource("/resources/Player-1.png"));
	                Icon player2icon = new ImageIcon(getClass().getResource("/resources/Player-2.png"));
	                Icon player3icon = new ImageIcon(getClass().getResource("/resources/Player-3.png"));
	                Icon player4icon = new ImageIcon(getClass().getResource("/resources/Player-4.png"));
	                
	                
	                Icon rollingicon = new ImageIcon(getClass().getResource("/resources/Roliing.gif"));
	                Icon rollicon = new ImageIcon(getClass().getResource("/resources/Roll.png"));
	                Icon sunicon = new ImageIcon(getClass().getResource("/resources/Sun.png"));
	                Icon buttonicon = new ImageIcon(getClass().getResource("/resources/button.png"));
	                Icon coinicon = new ImageIcon(getClass().getResource("/resources/coin$.png"));
	                
	                Icon planeplayericon = new ImageIcon(getClass().getResource("/resources/planeplayer.png"));
	                Icon smallballicon = new ImageIcon(getClass().getResource("/resources/smallball.png"));
	                Icon spaceship = new ImageIcon(getClass().getResource("/resources/spaceship.png"));
	                
	                Icon soundSettingicon = new ImageIcon(getClass().getResource("/resources/Music.png"));
	                Icon playerNameicon = new ImageIcon(getClass().getResource("/resources/Your name.png"));
	                Icon PressStarticon = new ImageIcon(getClass().getResource("/resources/START.gif"));
	                Icon playersboxicon = new ImageIcon(getClass().getResource("/resources/Players.png"));
	                Icon tronicon = new ImageIcon(getClass().getResource("/resources/tronbike.png"));
//	                Icon tossDiceicon = new ImageIcon(getClass().getResource("/resources/Roll_1.png"));
	                Icon brokeicon = new ImageIcon(getClass().getResource("/resources/broken-heart.png"));
	                Icon blackthemeicon = new ImageIcon(getClass().getResource("/resources/blackk.jpg"));
	                Icon mapgameicon = new ImageIcon(getClass().getResource("/resources/gamemap.png"));
	               
	                
	                        
			frame = new JFrame();
			frame.setBounds(100, 100, 1920, 1070);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			frame.getContentPane().setLayout(null);
			
			JLabel HOUSES = new JLabel("HOUSES");
			HOUSES.setForeground(Color.WHITE);
			HOUSES.setFont(new Font("Tahoma", Font.BOLD, 18));
			HOUSES.setBounds(1078, 349, 76, 35);
			frame.getContentPane().add(HOUSES);
			HOUSES.setVisible(false);
			
			Noti = new JLabel("");
			Noti.setBackground(Color.PINK);
			Noti.setForeground(Color.WHITE);
			Noti.setHorizontalAlignment(SwingConstants.CENTER);
			Noti.setFont(new Font("Tahoma", Font.BOLD, 60));
			Noti.setBounds(326, 386, 1200, 200);
			frame.getContentPane().add(Noti);
			Noti.setVisible(false);
			
			Turn = new JLabel("TURN 1");
			Turn.setFont(new Font("Tahoma", Font.BOLD, 30));
			Turn.setForeground(Color.WHITE);
			Turn.setBounds(1440, 57, 300, 50);
			frame.getContentPane().add(Turn);
			Turn.setVisible(false);
			
			Die6 = new JLabel("");
			Die6.setIcon(die6icon);
			Die6.setBounds(476, 365, 200, 300);
			frame.getContentPane().add(Die6);
			
			Die5 = new JLabel("");
			Die5.setIcon(die5icon);
			Die5.setBounds(476, 380, 200, 300);
			frame.getContentPane().add(Die5);
			
			Die4 = new JLabel("");
			Die4.setIcon(die4icon);
			Die4.setBounds(477, 402, 200, 300);
			frame.getContentPane().add(Die4);
			
			Die3 = new JLabel("");
			Die3.setIcon(die3icon);
			Die3.setBounds(475, 380, 200, 300);
			frame.getContentPane().add(Die3);
			
			Die2 = new JLabel("");
			Die2.setIcon(die2icon);
			Die2.setBounds(475, 409, 200, 300);
			frame.getContentPane().add(Die2);
			
			Die1 = new JLabel("");
			Die1.setIcon(die1icon);
			Die1.setBounds(478, 441, 200, 200);
			frame.getContentPane().add(Die1);
			
			Die1.setVisible(false);
			Die2.setVisible(false);
			Die3.setVisible(false);
			Die4.setVisible(false);
			Die5.setVisible(false);
			Die6.setVisible(false);
			
			
			
			rollingDice = new JLabel("");
			rollingDice.setIcon(rollingicon);
			rollingDice.setBounds(205, 250, 532, 500);
			frame.getContentPane().add(rollingDice);
			rollingDice.setVisible(false);
			
		
			JLabel soundSetting = new JLabel("");
			soundSetting.setIcon(soundSettingicon);
			soundSetting.setBounds(1459, 915, 70, 70);
			frame.getContentPane().add(soundSetting);
			
			JSlider changvolume = new JSlider();
////			mode2.changeVolume(-49);
			changvolume.setMaximum(50);
			changvolume.setSnapToTicks(true);
			changvolume.setBackground(Color.BLACK);
			changvolume.setPaintTrack(false);
			changvolume.setBounds(1528, 940, 56, 26);
			frame.getContentPane().add(changvolume);
			
			
			
			
			P1 = new JLabel("");
			frame.getContentPane().add(P1);
			P1.setIcon(sunicon);
			P1.setBounds(961, 940, 55, 50);
			
			P2 = new JLabel("");
			P2.setIcon(caricon);
			P2.setBounds(961, 940, 70, 50);
			frame.getContentPane().add(P2);
			
			P3 = new JLabel("");
			P3.setIcon(smallballicon);
			P3.setBounds(961, 940, 70, 70);
			frame.getContentPane().add(P3);
			
			P4 = new JLabel("");
			P4.setIcon(spaceship);
			P4.setBounds(960, 940, 70, 70);
			frame.getContentPane().add(P4);
			
			JLabel playerName = new JLabel("");
			playerName.setVisible(false);
			playerName.setEnabled(false);
			playerName.setBounds(1228, 217, 180, 50);
			playerName.setIcon(playerNameicon);
			frame.getContentPane().add(playerName);
			
			jslider = 2;
			JSlider Num_slider = new JSlider();
			Num_slider.setPaintTrack(false);
			Num_slider.setPaintTicks(true);
			Num_slider.setBounds(1440, 168, 119, 24);
			Num_slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					jslider = Num_slider.getValue();
////					System.out.println(slidernum);
				}
			});
			
			Num_slider.setFont(new Font("Tahoma", Font.BOLD, 12));
			Num_slider.setSnapToTicks(true);
			Num_slider.setForeground(Color.WHITE);
			Num_slider.setBackground(Color.BLACK);
			Num_slider.setMajorTickSpacing(1);
			Num_slider.setMaximum(4);
			Num_slider.setMinimum(1);
			Num_slider.setValue(1);
			frame.getContentPane().add(Num_slider);
			
			nameField = new JTextField(30);
			nameField.setEnabled(false);
			nameField.setBounds(1440, 228, 119, 29);
			nameField.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent arg0) {
					playername = nameField.getText();
				}
			});
			
			
			
			JLabel PressStart = new JLabel("");
			PressStart.setBounds(1271, 324, 501, 60);
			
			
			PressStart.setIcon(PressStarticon);
			frame.getContentPane().add(PressStart);
			
			nameField.setForeground(new Color(255, 255, 255));
			nameField.setFont(new Font("Tahoma", Font.BOLD, 14));
			nameField.setBackground(new Color(0, 0, 0));
			frame.getContentPane().add(nameField);
			nameField.setColumns(10);
			
			tron_theme = new JLabel("");
			tron_theme.setBounds(914, 77, 1000, 1000);
			
			playersbox = new JLabel("");
			playersbox.setBounds(1554, 140, 218, 73);
			playersbox.setIcon(playersboxicon);
			playersbox.setForeground(new Color(102, 255, 0));
			playersbox.setFont(new Font("Tahoma", Font.BOLD, 15));
			playersbox.setBackground(new Color(0, 204, 153));
			playersbox.setHorizontalAlignment(SwingConstants.CENTER);
			frame.getContentPane().add(playersbox);
			
			JLabel board = new JLabel("");
			board.setBounds(0, -37, 1068, 1068);
			board.setIcon(mapgameicon);
			frame.getContentPane().add(board);
			
			
			tron_theme.setBackground(new Color(102, 102, 102));
			tron_theme.setForeground(new Color(51, 51, 51));
			tron_theme.setIcon(tronicon);
			frame.getContentPane().add(tron_theme);
			
			
			
			bluemarker = new JLabel("");
			bluemarker.setIcon(markericon);
			bluemarker.setBounds(1170, 92, 56, 94);
			frame.getContentPane().add(bluemarker);
			bluemarker.setVisible(false);
			
			JLabel dollarsign = new JLabel("");
			dollarsign.setIcon(dollaricon);
			dollarsign.setBounds(1094, 277, 46, 40);
			frame.getContentPane().add(dollarsign);
			
			JLabel Die = new JLabel("");
			Die.setIcon(dieicon);
			Die.setBounds(1340, 486, 120, 100);
			frame.getContentPane().add(Die);
			Die.setVisible(false);
			
			HOUSEP4 = new JLabel("0");
			HOUSEP4.setForeground(Color.WHITE);
			HOUSEP4.setFont(new Font("Tahoma", Font.BOLD, 19));
			HOUSEP4.setBounds(1800, 353, 46, 22);
			frame.getContentPane().add(HOUSEP4);
			HOUSEP4.setVisible(true);
			
			
			HOUSEP3 = new JLabel("0");
			HOUSEP3.setForeground(Color.WHITE);
			HOUSEP3.setFont(new Font("Tahoma", Font.BOLD, 19));
			HOUSEP3.setBounds(1600, 353, 46, 22);
			frame.getContentPane().add(HOUSEP3);
			HOUSEP3.setVisible(true);
			
			HOUSEP2 = new JLabel("0");
			HOUSEP2.setForeground(Color.WHITE);
			HOUSEP2.setFont(new Font("Tahoma", Font.BOLD, 19));
			HOUSEP2.setBounds(1400, 353, 46, 22);
			frame.getContentPane().add(HOUSEP2);
			HOUSEP2.setVisible(true);
			
			HOUSEP1 = new JLabel("0");
			HOUSEP1.setFont(new Font("Tahoma", Font.BOLD, 19));
			HOUSEP1.setForeground(Color.WHITE);
			HOUSEP1.setBounds(1200, 353, 46, 22);
			frame.getContentPane().add(HOUSEP1);
			HOUSEP1.setVisible(true);
			
			P1money = new JLabel("1500");
			P1money.setHorizontalAlignment(SwingConstants.CENTER);
			P1money.setForeground(Color.WHITE);
			P1money.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
			P1money.setBackground(Color.BLACK);
			P1money.setBounds(1150, 277, 100, 40);
			frame.getContentPane().add(P1money);
			
			P2money = new JLabel("1500");
			P2money.setForeground(Color.WHITE);
			P2money.setHorizontalAlignment(SwingConstants.CENTER);
			P2money.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
			P2money.setBackground(Color.BLACK);
			P2money.setBounds(1350, 277, 100, 40);
			frame.getContentPane().add(P2money);
			
			P3money = new JLabel("1500");
			P3money.setHorizontalAlignment(SwingConstants.CENTER);
			P3money.setForeground(Color.WHITE);
			P3money.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 19));
			P3money.setBackground(Color.BLACK);
			P3money.setBounds(1550, 277, 100, 40);
			frame.getContentPane().add(P3money);
			
			P4money = new JLabel("1500");
			P4money.setHorizontalAlignment(SwingConstants.CENTER);
			P4money.setForeground(Color.WHITE);
			P4money.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
			P4money.setBackground(Color.BLACK);
			P4money.setBounds(1750, 277, 100, 40);
			frame.getContentPane().add(P4money);
			
			JLabel P3title = new JLabel("");
			P3title.setIcon(player3icon);
			P3title.setBounds(1540, 196, 120, 70);
			frame.getContentPane().add(P3title);
			
			JLabel P2title = new JLabel("");
			P2title.setIcon(player2icon);
			P2title.setBounds(1340, 196, 120, 70);
			frame.getContentPane().add(P2title);
			
			P1title = new JLabel("");
			P1title.setIcon(player1icon);
			P1title.setBounds(1140, 196, 120, 70);
			frame.getContentPane().add(P1title);
			
			JLabel P4title = new JLabel("");
			P4title.setIcon(player4icon);
			P4title.setBounds(1740, 196, 127, 70);
			frame.getContentPane().add(P4title);
			
//			JLabel tossDice = new JLabel("");
//			tossDice.setIcon(tossDiceicon);
//			tossDice.setBounds(1450, 486, 180, 100);
//			frame.getContentPane().add(tossDice);
			
			JLabel broke = new JLabel("");
			broke.setIcon(brokeicon);
			broke.setBounds(1340, 229, 120, 142);
			frame.getContentPane().add(broke);
			
			JLabel blacktheme = new JLabel("");
			blacktheme.setIcon(blackthemeicon);
			blacktheme.setBounds(0, -422, 1900, 1900);
			frame.getContentPane().add(blacktheme);
			
			decoy = new JLabel("New label");
			decoy.setBounds(0, 0, 46, 14);
			frame.getContentPane().add(decoy);
			
			m1 = new Monopoly();
			nameField.setVisible(false);
			
			
			
			changvolume.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					int b = changvolume.getValue();	
					
				}
			});
			
				broke.setVisible(false);
				
				PressStart.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					
					HOUSES.setVisible(true);
					
					if (jslider >=2){
						{
					System.out.println("Test");
					Num_slider.setVisible(false);
					playersbox.setVisible(false);
					PressStart.setVisible(false);
					playerName.setVisible(false);
					nameField.setVisible(false);
					tron_theme.setVisible(false);
//					System.out.println("WOT "+jslider+ " " + playername);
					totalP = jslider;
					GameProject.setNumPlayers(jslider);
					GameProject.stop = true;
//					System.out.println(GameProject.stop);
					m1.getJ(jslider);
					
					
//					try {
//						m1.rungame();
//						a = m1.maxSteps;
//						
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
					
					
					
					}
					if (jslider==2) {
						
						HOUSEP3.setVisible(false);
						HOUSEP4.setVisible(false);
						P3.setVisible(false);
						P3money.setVisible(false);
						P3title.setVisible(false);
						P4.setVisible(false);
						P4money.setVisible(false);
						P4title.setVisible(false);		
					}
					if (jslider==3) {
						
						HOUSEP4.setVisible(false);
						
						P4.setVisible(false);
						P4money.setVisible(false);
						P4title.setVisible(false);		
					}
					
					
									
					
					Thread t1 = new Thread(() -> {try {
						backEnd();	
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}});
					
					
	//
					
						/***        ***/
						/***        ***/
						/*** NOTICE ***/
						/***        ***/
						/***        ***/
					
					
//					t1.start(); /////********** RUN BACKEND ***************\\\\\\\
					
					
					
				} else {
						JOptionPane.showConfirmDialog(null, "Invalid name or players","!!!",JOptionPane.OK_CANCEL_OPTION);
					}
					
				}
				
				
			});
					
		}
		
		
		
		/**
		 * @wbp.parser.entryPoint
		 */
//		BACKEND RUNNING
		
		public void backEnd() throws InterruptedException {
			
			int i=1,xSubtract,ySubtract,empty=0;
			int t[] = new int[5] ,monei,die,moneyvar;
			int one =1;
			int[] xPreviousPos = new int[5], yPreviousPos= new int[5];
			int a= m1.maxSteps;
			String pName= m1.name1;
			JLabel[] dienum = {decoy,Die1,Die2,Die3,Die4,Die5,Die6};
			
			dienum[0].setVisible(false);
			int dieArray[][] = m1.die_array;
			int monezi[][] = m1.money_array;
			int pos[][] = m1.location_array;
			int z1;
			int timeDelay = 2;
			int[] xCurrentPos= new int[5],yCurrentPos= new int[5];
			rollingDice.setVisible(false);
			JLabel[] playerPool = {P1,P2,P3,P4};
			JLabel[] moneyPlayerPool = {P1money,P2money,P3money,P4money};
			
//			System.out.println(Arrays.deepToString(dieArray));
		
			for (int zeko=1;zeko<=a;zeko++) {
				
				
				
				for (int tf=0;tf<totalP;tf++) {
			
				Turn.setText("TURN "+zeko );
				System.out.println("TURN "+zeko );
				
				
				die = dieArray[zero][one];
				
				System.out.println("Die is "+die );
//				if (die ==0) {zero++; continue;}
//				if (die <=0 || die == null) continue;
				xPreviousPos[zero] = x_axis[t[zero]];
				yPreviousPos[zero] = y_axis[t[zero]];
//				System.out.println("\n"+"Player "+(zero+1) +" has PrevPos "+"("+xPreviousPos[zero]+")");
				
				t[zero] = pos[zero][one];
				
				
//				System.out.println(monezi[0][z]+"\n");
				bluemarker.setVisible(true);
				bluemarker.setLocation(marker_axis[zero],92);
//				Thread.sleep(100);
//				Thread.sleep(300);
				rollingDice.setVisible(true);
				Thread.sleep(200);
				rollingDice.setVisible(false);
				Thread.sleep(16);
				dienum[die].setVisible(true);
				Thread.sleep(1000);
				dienum[die].setVisible(false);
				
				
				xCurrentPos[zero] = x_axis[t[zero]];
				yCurrentPos[zero] = y_axis[t[zero]];
			
				
				xSubtract = xCurrentPos[zero] - xPreviousPos[zero];
				ySubtract = yCurrentPos[zero] - yPreviousPos[zero];
			
				if (t[zero]<=10) {
				
					for ( empty=0;empty<Math.abs(xSubtract);empty++) {
					Thread.sleep(timeDelay);
					playerPool[zero].setLocation(xPreviousPos[zero]--,940);
					}
				
				} 
				
				else if(t[zero]<=20) {
					for ( empty=0;empty<Math.abs(ySubtract);empty++) {
						Thread.sleep(timeDelay);
						playerPool[zero].setLocation(40,yPreviousPos[zero]--);
						}
				}
				
				else if(t[zero]<=30) {
					for ( empty=0;empty<Math.abs(xSubtract);empty++) {
						Thread.sleep(timeDelay);
						playerPool[zero].setLocation(xPreviousPos[zero]++,40);
						}
				}
				else {
					for ( empty=0;empty<Math.abs(ySubtract);empty++) {
						Thread.sleep(timeDelay);
						playerPool[zero].setLocation(960,yPreviousPos[zero]++);
						}
				}
				int ka = zero+1;
				if (ka>=totalP) ka = 1;
				Thread.sleep(100);
				moneyPlayerPool[zero].setText(String.valueOf(monezi[zero][zeko]));
				
				zero++;
				if (zero >=totalP) {zero=0;one++;}
				System.out.println("Zero is "+zero);
			
			}
			}
			for (int ik = 1 ;ik<7;ik++) {
				dienum[ik].setVisible(false);
			}
			
			Noti.setText(pName);
			Noti.setVisible(true);
			
			
			System.out.println(pName);
	        for (int iv=0;iv<totalP;iv++) {
	        	for (int tv=1;tv<=a;tv++) {
	        		System.out.println(monezi[iv][tv]);
	        	}
	        	System.out.println("\n\n");
	        }
				 
		}	  
	
	
	/***
	 * 
	 * 
	 * PVP
	 * 
	 *
	 ***/
	
//	JLabel[] moneyPlayerPool = {P1money,P2money,P3money,P4money};
	
	public void changeMoneyState(int money[]) {
		
		JLabel[] moneyPlayerPool = {P1money,P2money,P3money,P4money};
		for (int i=0; i<totalP; i++) {
			moneyPlayerPool[i].setText(String.valueOf(money[i]));
		}
	}
	
//	Thread t21 = new Thread();
	
//	public void changePositionState(int position[]) throws InterruptedException {
//		Thread t2 = new Thread(() -> {displayPosition(position);});
//		t2.start();

//	}
	
//	@SuppressWarnings("deprecation")
	
	
	
	public void displayPosition(int position[]) {
//		
		JLabel[] playerPool = {P1,P2,P3,P4};
//		int timeDelay = 100;
		
//		playerPool[0].setLocation(x_axis[position],y_axis[position]);
		
		
		
		for(int i=0;i<totalP;i++) {
			if(position[i] == -1)
				continue;
//			System.out.println("ARRAY INFO  " + position[i]);
			playerPool[i].setLocation(x_axis[position[i]],y_axis[position[i]]);
		}
	}
	
	
	
//	public void displayPosition(int position[]) throws InterruptedException {
//		int[] xCurrentPos= new int[5],yCurrentPos= new int[5];
//		int xSubtract,ySubtract,empty=0;
//		int t[] = new int[5];
//		int[] xPreviousPos = new int[5], yPreviousPos= new int[5];
//		JLabel[] playerPool = {P1,P2,P3,P4};
//		int timeDelay = 100;
//		
//		
//		for (int zero = 0; zero <= totalP; zero++) {
//		
//			
//		xPreviousPos[zero] = PreviousPosition[zero];	
//		yPreviousPos[zero] = PreviousPosition[zero];
//		
//		PreviousPosition[zero] = position[zero];
//		
//		xCurrentPos[zero] = x_axis[position[zero]];
//		yCurrentPos[zero] = y_axis[position[zero]];
//		
//		
//		
//		xSubtract = xCurrentPos[zero] - xPreviousPos[zero];
//		ySubtract = yCurrentPos[zero] - yPreviousPos[zero];
//	
//		if (position[zero]<=10) {
//		
//			for ( empty=0;empty<Math.abs(xSubtract);empty++) {
//			Thread.sleep(timeDelay);
//			playerPool[zero].setLocation(xPreviousPos[zero]--,940);
//			}
//		
//		} 
//		
//		else if(position[zero]<=20) {
//			for ( empty=0;empty<Math.abs(ySubtract);empty++) {
//				Thread.sleep(timeDelay);
//				playerPool[zero].setLocation(40,yPreviousPos[zero]--);
//				}
//		}
//		
//		else if(position[zero]<=30) {
//			for ( empty=0;empty<Math.abs(xSubtract);empty++) {
//				Thread.sleep(timeDelay);
//				playerPool[zero].setLocation(xPreviousPos[zero]++,40);
//				}
//		}
//		else {
//			for ( empty=0;empty<Math.abs(ySubtract);empty++) {
//				Thread.sleep(timeDelay);
//				playerPool[zero].setLocation(960,yPreviousPos[zero]++);
//				}
//		}
//		}
//		
//	}
	
	public void changeTurnState(int turn) {
		Turn.setText("TURN "+turn);
	}
	
	public void changePropertyState(int properties[]) {
		for (int i=0; i<=totalP;i++) {
			System.out.println(properties[i]);
		}
		
	}
	
	public void rollDice(int die)  {
		
		
	}
}
