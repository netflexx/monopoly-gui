/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject;
import gameproject.allslot.RailRoad;
import gameproject.allslot.Land;
import gameproject.allslot.Slot;
import sun.reflect.annotation.TypeAnnotation.LocationInfo.Location;
import gameproject.allslot.Jail;
import gameproject.allslot.*;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javafx.application.*;
/**
 *
 * @author ThuyTrang
 */

import GUI.InGame;
public class GameProject{
    static Slot[] slots;
    static LinkedList<Player> a;
    private static Slot[][] Slot;
    private static Hashtable<Player,Integer> check;
    private static int h;
    private static int numOfPlayers;
    private static boolean skipATurn = false;
    private static  int len = 40,turn = 0;
    private static int[] location,totalMoney,totalProperties;
    public static boolean stop = false;
    public static InGame ingame;
    
    public static int abc = 1;
    
//    InGame inGame = new InGame();
    
    
    
    
//    public static void main(String[] args) throws Exception{
    public GameProject() throws Exception {
        // TODO code application logic her
        //new PopUp("hey");
    	ingame = new InGame();
    	
//    	SwingUtilities.invokeLater(ingame.run());
    	
    	
    	
    	
    	
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                    ingame.run();
            }
        });
    	GameProject.hold(100);
    	ingame.Turn.setVisible(true);
//        System.out.print("How many player: ");
//        Scanner u = new Scanner(System.in);
//        if(u.hasNextInt()){
//            GameProject.setNumPlayers(u.nextInt());
//        }
//        u.close();     
        
        ready();
        playTheGame();
    }
    public static int getNumPlayers(){
        // test number of player
        return GameProject.numOfPlayers;

    }
    /*
        ******
    
        1. chuyá»�n cÃ¡i JSlide sáº½ chuyá»�n data vÃ´ setNumPlayer
    
        ******
     */
    public static void setNumPlayers(int num){

        GameProject.numOfPlayers = num;
    }
    /*
        *****
        
        2. sau Ä‘Ã³ gá»�i cÃ¡i nÃ y Ä‘á»ƒ chuáº©n bá»‹ backend
    
        *****
        
    */
    public static void ready() throws Exception{
        a = GameProject.getListPlayer();
        Board.setPlayers(a);
        slots = GameProject.createSlots();
        Board.setSlots(slots); 
        int v = a.size();
        location = new int[v];
        totalMoney = new int[v];
        totalProperties = new int[v];
        for(int i = 0;i < v;i++){
            totalMoney[i] = a.get(i).getPersonAcc().getAmount();
            location[i] = Compare.getAddress(a.get(i).getCurrentPosition());
            totalProperties[i] = a.get(i).getPersonAcc().getProperties().size();
        } 
    }
    private static LinkedList<Player> getListPlayer() {
        // 
       
        LinkedList<Player> listPlayer = new LinkedList<Player>();
        int  i = 0,num = getNumPlayers();
        String[] name = new String[]{"Alpha","Beta","Charlie","Delta","Echo"};
        while(i < num){
            listPlayer.add(new Player(name[i]));
            i++;
        }
        return listPlayer;
    }

    @SuppressWarnings("empty-statement")
    private static Slot[] createSlots() throws Exception{
        Slot[] slots = new Slot[len];
        int index = 0;
        String CurrentContent;

        // The name of the file to open.
        String fileName = "src\\gameproject\\input\\temp.txt";
        //System.out.println(Paths.get(".").toAbsolutePath().normalize().toString());
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);


            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);
            //Instanciate the slot Ä‘á»ƒ báº¯t Ä‘áº§u chÆ¡i
            //pháº£i Ä‘á»•i index 
            while((line = bufferedReader.readLine()) != null && index < len) {
                CurrentContent = line;
                if(CurrentContent.contains("Land")){
                    Integer A = (new Integer(CurrentContent.split(" ")[2]));
                    int a = A.intValue();
                    String b = CurrentContent.split(" ")[1];
                    String f = CurrentContent.split(" ")[3];
                    int r= Integer.parseInt(CurrentContent.split(" ")[2]);
                    slots[index] = (Slot) new Land(b,f,a,r);
                }
                else if(CurrentContent.contains("RailRoad")){
                    slots[index] = (Slot) new RailRoad();
                }
                else if(CurrentContent.equalsIgnoreCase("Chance")){
                    slots[index] = (Slot) new Chance();
                }
                else if(CurrentContent.equalsIgnoreCase("Community")){
                    slots[index] = (Slot) new Community();
                }
                else if(CurrentContent.equalsIgnoreCase("Jail")){
                    slots[index] = (Slot) new Jail();
                }
                else if(CurrentContent.equalsIgnoreCase("GotoJail")){
                    slots[index] = (Slot) new GotoJail();
                }
                else if(CurrentContent.equalsIgnoreCase("Parking")){
                    slots[index] = (Slot) new Parking();
                }
                else if(CurrentContent.equalsIgnoreCase("Start")){
                    slots[index] = (Slot) Start.getStart();
                }
                else if(CurrentContent.contains("Tax")){
                    int a = (new Integer(CurrentContent.split(" ")[1]))
                            .intValue();                    
                    slots[index] = (Slot) new Tax(a);              
                }
                else if(CurrentContent.equalsIgnoreCase("Electric") ||
                        CurrentContent.equalsIgnoreCase("Water")){
                    slots[index] = (Slot) new Utility(CurrentContent);
                }
                else{
                    throw new Exception();
                }
                index++;
            }

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
            ex.printStackTrace();
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            ex.printStackTrace();
        }
        catch(Exception ex){
            int i = (index + 1);
            System.out.println(slots[index] == null);
            System.out.println("COI Láº I INPUT DÃ’NG "+ String.valueOf(i));
            //ex.printStackTrace();
        }
        return slots;
    }
    /*
    ******
    
    3.chÆ¡i trÃ² chÆ¡i
    
    *****
    */
    private static void playTheGame(){
        //index Ä‘á»ƒ ghi láº¡i vá»‹ trÃ­ cá»§a mÃ¬nh trong game
        int index;
        //Player lÃ  linked list mÃ¬nh cÃ³ thá»ƒ iterate
        LinkedList<Player> Players = Board.getPlayers();
        //vÃ²ng láº­p mÃ£i mÃ£i
        index = 0;
        while(true){
            //kiá»ƒm tra cÃ³ ngÆ°á»�i chiáº¿n tháº¯ng báº±ng cÃ¡ch kiá»ƒm tra sá»‘ lÆ°á»£ng pháº§n tá»­ 
            if(Players.size() == 1){
                hasWinner(true);
                break;
            }
            try{
                //
                Player player = Players.get(index);
                if(player.getPersonAcc().getProperties().size() != 0) {
                	////////
                	  Carrier a = new Carrier();
                	  SwingUtilities.invokeLater(new Runnable(){
                          public void run(){
                        	  try {
                        		  new Sold(player, a);
                        	  }
                        	  catch(Exception r) {
                        		  
                        	  }
                          }
                      });
                	  close(15, a);
                	
                }
                //GameProject.upgradeProperties(player);
                //GameProject.soldProperty(player);
                while(true){
                    //a.toDOSomething(player);
                    if(GameProject.skipATurn){
                        skipATurn = false;
                        break;//invoke by the jail slot only
                    }
                    int v = Dice.rollAndGo(player);
                    Dice.sendToJail(player);
                    Slot a = player.getCurrentPosition();
                    a.toDOSomething(player);
                    //int v = (int) (Math.random()*3) + 1;//testing code
                    //player.move(v);//testing
                    if(player.isBankrupted()){
                        Players.remove(player);
                        Board.setPlayers(Players);
                        GameProject.setLocation(player,true);
                        index--;
                        System.out.print("Bye bye ");
                        System.out.println(player.getName());
                        displayMessage("Bye bye "+ String.valueOf(player.getIndex()));
                        break;
                    }
                    System.out.println(player);
                    if(Dice.send || v != 12){
                        Dice.end();
                        break;
                    }
                }
                index++;
                if(index == Players.size()) {
                	index =0;
                	setTurn();
                }
            }
            catch(IndexOutOfBoundsException e){
                //index = 0;
                //setTurn();
//            	System.out.println("AAAAAAAAAAAAAAA");
//            	System.out.println(e.getLocalizedMessage());
            } 
            /*catch (InterruptedException ex) {
                Logger.getLogger(GameProject.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }
    }
    public static void hasWinner(boolean flag){
        //checks for winner and ends the game
        System.out.print("Winner: ");
        System.out.println(a.get(0).getName());
        GameProject.displayMessage("Winner: " + a.get(0).getName());
    }
    /*
    cá»™ng tiá»�n cho hoÃ n thÃ nh 1 vÃ²ng(ko quan trá»�ng)
    */
    public static void complete1Lap(Player player,int v){
        int a,length = len;
        if(check == null){
            check = new Hashtable<>();
            for(Iterator i=Board.getPlayers().iterator();i.hasNext();){
                check.put((Player) i.next(),new Integer(0));
            }
        }
        int b = check.get(player).compareTo(new Integer(length));
        if(!(Dice.send) && (b >= 0)){
            Integer w = new Integer(b + check.get(player).intValue()- length);
            player.getPersonAcc().changeAmount(200);
            check.replace(player, w);
            System.out.println(player.getName() + " gets 200");
            GameProject.displayMessage("Player "+
                String.valueOf(player.getIndex()) + " gets 200");
        }
        else if(!Dice.send){
            if( (a = v+check.get(player).intValue()) >= 0){
                check.replace(player, new Integer(a));
            }  
            else{
                check.replace(player, new Integer(0));
            }
        }
            
    }
    public static void upgradeProperties(Player player){
       //boolean answer = player.ask() ;
       for (Iterator<Property> iterator = player.getPersonAcc().getProperties().iterator()
               ; iterator.hasNext();) {
            Property next = iterator.next();
            if(next instanceof Land /*&& answer*/){
                ((Land) next).upgrade();
            }
        }
    }
    public static void skip(Jail slot){
        GameProject.skipATurn = true;
    }
    public static void soldProperty(Player player){
        for (Iterator<Property> iterator = player.getPersonAcc().getProperties().iterator()
               ; iterator.hasNext();) {
            if(player.sell()){
                Property i = iterator.next();
                i.sell();
            }
        }       
    }
    /*
    *******
    
    4.lÃ m frame cho box
    cÃ³ label = string message
    cÃ³ 2 button yes and no
    vÃ  tá»± Ä‘á»™ng Ä‘Ã³ng sau Ä‘Ã³
    Ä‘á»ƒ Ã½ function close()
    vÃ  hold()
    
    *******
    */
    public static boolean yesNoBox(String message){
        /*System.out.print(message + "\n");
        System.out.print("Y for yes, N for No");
        try (Scanner u = new Scanner(System.in)) {
            if(u.hasNext()){
                if(u.next().equals("N")){
                    u.close();
                    return false;
                }
            }
        }*/
        Carrier a = new Carrier();
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                    new YesNoFrame(message+ " ,closing after 6s",a);
            }
        });
        close(6,a);
        return a.d;
    }
    /*
    
    5.display the message
    
    */
    public static void displayMessage(String message){
        Carrier a = new Carrier();        
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new PopUp(message,a);
            }
        });        
        close(3,a);
    }
    /*
    
    6.display Image
    
    */
    public static void displayImage(BufferedImage pic){
        Carrier a = new Carrier();
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new PopUp(pic,a);
            }
        });      
        close(3,a);
    }
    private static void close(int secs ,Carrier a){
        hold(secs);
        try{
            a.kill();
        }
        catch(NullPointerException ex)
        {
            
        }
    }
    private static void hold(double secs){
        Calendar j = Calendar.getInstance();
        while(Calendar.getInstance().getTimeInMillis()<
                (j.getTimeInMillis() + secs*1000)){
            if(GameProject.stop){
                GameProject.stop = false;
                break;
            }
            /*
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(GameProject.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            
        }
    }
    public static void waiting(){
	while(true){
	    if(GameProject.stop){
	       GameProject.stop = false;
	       System.out.println("Escape");
	       break;
	    }
	}
    }
    int t = 0;
    public static void setLocation(Player player,boolean bankrupted){
        if(!bankrupted){location[(player.getIndex() - 1)] = 
                Compare.getAddress(player.getCurrentPosition());}
        else{
            location[(player.getIndex() - 1)] = -1;
        }
        ///
//        for (int i=0;)
//        System.out.println(location[0] + " "+location[1]+" ");
//        try {
//			ingame.changePositionState(location);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        
        ingame.displayPosition(location);
//        abc++;
        hold(1);
    }
    public static void setTurn(){
        turn++;
        ///
        ingame.changeTurnState(turn+1);
    }
    public static void setMoney(Player player,Bank bank){
        int a = bank.getAmount(),b = player.getIndex()-1;
        totalMoney[b] = a;
        if(a < 0)totalMoney[b] = 0;
        ///
        ingame.changeMoneyState(totalMoney);
    }
    public static void setProperties(Player player,Bank bank){
        int a = player.getIndex() - 1,b = bank.getProperties().size();
        totalProperties[a] = b;
        ////
        JLabel[] house = {ingame.HOUSEP1,ingame.HOUSEP2,ingame.HOUSEP3,ingame.HOUSEP4};
        
        house[a].setText(""+b);
    }
    public static void setPlayerTurn(Player player) {
    	int h = player.getIndex();
    	///
//    	System.out.println();
    }
    public static void setNumDice(int h) {
    	///
    	JLabel[] dienum = {ingame.decoy, ingame.Die1, ingame.Die2,
    			 		   ingame.Die3, ingame.Die4, ingame.Die5, ingame.Die6};
    	
    	System.out.println("DICE HERE  "+h);
    	
    	ingame.rollingDice.setVisible(true);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ingame.rollingDice.setVisible(false);
		
    	dienum[h].setVisible(true);
    	try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	dienum[h].setVisible(false);
    }
}

