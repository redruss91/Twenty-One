/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Riley
 */
public class cardvaluetwo { //player two's hand
    
    int playertwoOne = (int) (Math.random()*11);
    int playertwoTwo = (int) (Math.random()*11); 
   
    
    
    /**
     *
     */
    public int secondhand() {
     return (playertwoOne + playertwoTwo);
}


public void displayhandtwo(){//tells the player 2 what is in his hand
System.out.println("Player 2, you have in your hand a " + this.playertwoOne + " and a "+ this.playertwoTwo + "."); 
System.out.println("You can choose to hit or stay.");
}  
    
}
