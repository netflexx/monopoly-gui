/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject.allslot;

import gameproject.Player;
import java.util.Iterator;

/**
 *
 * @author ThuyTrang
 */
public class StreetRepair extends Card{
    
    public StreetRepair(String link){
        super(link);
    }
    @Override
    public void Instruction(Player player) {
        int sum = 0,a = 0,b = 0;
        for(Iterator<Property> it = player.getPersonAcc().getProperties().iterator();
                it.hasNext();){
            Property i = it.next();
            if(i instanceof Land){
                a = ((Land) i).getHouses();
                b = ((Land) i).getnumHotel();
            }
            if(a < 4){
                sum += a*40;
            }
            else if(b ==1){
                sum += 115;
            }
        }
        player.getPersonAcc().changeAmount(-sum);
        display();
    }
}
