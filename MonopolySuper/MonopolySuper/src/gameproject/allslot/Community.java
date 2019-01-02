/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject.allslot;

import gameproject.Player;

/**
 *
 * @author ThuyTrang
 */
public class Community extends CC {
    
    public Community(){
        this.cards = new Card[]{new ChargeCard("Bank Error",200,"src\\gameproject\\input\\plus200.jpg"),
            new ChargeCard("X-mas Fund",1000,"src\\gameproject\\input\\Chance_XmasFund.JPG"),
            new StreetRepair("src\\gameproject\\input\\Street repair.jpg"),
            new GotoGo("src\\gameproject\\input\\gotogo.jpg")};
    }
    @Override
    public String toString(){
        return "Community chess";
    }
    @Override 
    public String getName(){
        return toString();
    }
}

