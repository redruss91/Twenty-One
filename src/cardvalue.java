/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Riley
 */
public class cardvalue {
        
    int playeroneOne = 0;
    int playeroneTwo = 0;//represent the two cards in player One's hand.
    int randNum = (int) (Math.random()*11);
    int randNumtwo = (int) (Math.random()*11);
    
  
    
public int firsthand() {
 this.playeroneOne = randNum;  //call input from different class of player one's hand
 this.playeroneTwo = randNumtwo;
        return (playeroneOne + playeroneTwo);
}


public void displayhandone(){//tells the player 1 what is in his hand
System.out.println("Player 1, you have in your hand a " + this.playeroneOne +" and a "+ this.playeroneTwo +".");
System.out.println("You can choose to hit or stay.");
}


    
    
}
