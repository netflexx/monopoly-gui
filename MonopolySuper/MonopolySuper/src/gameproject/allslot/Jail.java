/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject.allslot;

/**
 *
 * @author ThuyTrang
 */
import gameproject.Board;
import gameproject.Player;
import gameproject.CanArrest;
import gameproject.Dice;
import gameproject.GameProject;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jail implements Slot {

    private LinkedList<Player> inJail = new LinkedList<>();

    public void receivePrisoner(CanArrest sender){
        Player i = sender.getPrisoner();
        if(i != null && !inJail.contains(i)){
            if(sender instanceof Dice) 
                GameProject.displayMessage("Player "+ String.valueOf(i.getIndex())
                + " UNLUCKY ROLL NOW YOU ARE IN JAIL");
            else if(sender instanceof GotoJail)
                GameProject.displayMessage("Player "+ String.valueOf(i.getIndex())
                + " GOES TO JAIL");
            else
                GameProject.displayMessage("Player "+ String.valueOf(i.getIndex())
                + "NOW YOU ARE IN JAIL");
            inJail.add(i);
        }
    }
    @Override
    public void toDOSomething(Player player) {
        if(inJail.contains(player)){
            int a = Dice.roll();
            System.out.print("Jail: ");
            inJail.remove(player);
            if(player.getPersonAcc().gotCard()){
                System.out.println(player.getName() +  " has cards");
            }
            else if(a == 12){
                GameProject.skip(this);
                System.out.println(player.getName() + " luckly roll");
            }
            else{
                player.getPersonAcc().changeAmount(-50);
                System.out.println(player.getName() + " losts 50");
                GameProject.skip(this);
            }

        }
    }
    @Override
    public String getName(){
        return "Jail slot";
    }
    @Override 
    public String toString(){
        String a = "";
        for(Iterator i = inJail.iterator();i.hasNext();){
            Player e = (Player) i.next();
            a = e.getName() + " ";
        }
        return  "Player in Jail: " + a;
    }
}

