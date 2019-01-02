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
public class Chance extends CC {

    public Chance() {
        this.cards = new Card[]{new Back3step("src\\gameproject\\input\\back3steps.JPG"),
            new getOutOfJail("src\\gameproject\\input\\getoutjail.jpg"),
            new PayEveryBody("src\\gameproject\\input\\Chance_ElectedChairman.JPG"),
            new ChargeCard("Bank Error",200,"src\\gameproject\\input\\plus200.jpg"), 
            new ChargeCard("Poor Tax",-15,"src\\gameproject\\input\\monopoly-pay-poor-tax.jpg"), 
            new ChargeCard("Loan Mature",150,"src\\gameproject\\input\\plus150.jpg")};
    }
    @Override
    public String toString(){
        return "Chance slot";
    }
    @Override
    public String getName(){
        return toString();
    }
}

