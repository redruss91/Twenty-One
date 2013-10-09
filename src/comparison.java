/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Riley
 */
public class comparison {
    cardvalue player = new cardvalue();
    
    cardvaluetwo playertwo = new cardvaluetwo();
    
    @SuppressWarnings("empty-statement")
    
    public static void main(String[] args){
        
        comparison hand = new comparison();
        
        hand.playercomp();
        
     cardvalue onehand = new cardvalue();
        onehand.firsthand();
        onehand.displayhandone();
        
     cardvaluetwo twohand = new cardvaluetwo();
       twohand.secondhand();
       twohand.displayhandtwo();
    }
    
    public void playercomp(){
     if(player.firsthand() > playertwo.secondhand())
        {System.out.println("Player one wins");}
     else if(player.firsthand() == playertwo.secondhand())
        {System.out.println("Tie");}
     else {System.out.println("Player two wins");}
    }
}

