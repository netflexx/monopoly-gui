/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject;

/**
 *
 * @author ThuyTrang
 */
import gameproject.allslot.Compare;
import gameproject.allslot.RailRoad;
import gameproject.allslot.Land;
import gameproject.allslot.Property;
import gameproject.allslot.Slot;
import gameproject.allslot.Start;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Player {

    private static int numPlayers = 0;

    private Player nextPlayer;

    private Slot currentPosition = Start.getStart();

    private final Bank personalBank = new Bank(this);

    private final int index; 
    
    private final String name;
    
    public int h;
    
    public Player(String name) {
        index = ++numPlayers;
        this.name = name;
    }

    public int numOfPlayers() {
        return numPlayers;
    }
    public String getName(){
        return this.name;
    }
    /*
        check the player if he has lose and delete him
    */
    public boolean isBankrupted() {
        if(!personalBank.canPlay()){
            personalBank.free();
            return true;
        }
        return false;
    }
    /*
    move the player
    */
    public void move(int steps){
        
       Slot[] a = Board.getSlots();
       int b = Compare.getAddress(currentPosition);
       int r ;
       //try{
       r = steps + b;
       if((b + steps) >= a.length){
           r = (b + steps - a.length);
       }
       else if( r< 0){
           r = a.length + r;
        }
       h = steps;
       /*if(steps >= a.length){
           throw new Exception(String.valueOf(steps) + 
                   " "+String.valueOf(a.length) + " " + String.valueOf(Board.getSlots().length));
       }*/
       currentPosition = a[r];
       GameProject.setLocation(this, false);
       GameProject.complete1Lap(this, steps);
       //}
       /*catch(IndexOutOfBoundsException e){
          System.out.println(r);
          System.out.println(steps);
          System.out.println(a.length);
          e.printStackTrace();
          return null;
       }*/
    }

    public void move(Slot nextSlot) {
        int a,b,c;
        a = Compare.getAddress(currentPosition);
        b = Compare.getAddress(nextSlot);
        c = b-a;
        if(c <0) c = -c;
        this.move(c);
    }
    public boolean ask(){
        //need gui và sẽ hỏi player về nên upgrade hay ko?
        return boxGui("Player " + String.valueOf(this.index)
                +" do you want to upgrade your stuff?");
    }
    public Bank getPersonAcc() {
        return personalBank;
    }

    public void changePersonAcc() {
    }
    public Slot getCurrentPosition(){
        return currentPosition;
    }
    public void setCurrentPosition(Slot slot){
        this.currentPosition = slot;
    }
    public int getIndex(){
        return this.index;
    }
    public boolean buy(Property property){
        return boxGui("Player "+ String.valueOf(index)+" do you want to buy this slot");
    }
    /*
    *****
    
    
    
    *****
    */
    private boolean boxGui(String word){
        return GameProject.yesNoBox(word);
    }
    @Override
    public String toString(){
        try{
            return "Player: " + this.name + ", id: " + String.valueOf(index)+
                    " "+ personalBank.toString() + " ,current position "
                    + this.currentPosition.getName();
        }
        catch(NullPointerException r){
            try {
                Thread.sleep(1000);
                System.out.println("\n" + this.name + " " + String.valueOf(personalBank.hasMoney()));
                return "ERRROR";
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            return "";
    }
    public boolean sell(){
        return boxGui("Do you want to sell this slot");
    }
}

