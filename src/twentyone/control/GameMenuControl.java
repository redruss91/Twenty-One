package twentyone.control;

import twentyone.menus.GameMenuView;
import twentyone.other.Dealer;
import twentyone.maingame.TwentyOne;

import static twentyone.maingame.TwentyOne.myDeck;

/**
 *
 * @author Kyle Russell
 * @author Kevin
 */
public class GameMenuControl {
    
    public void hit(){
        TwentyOne.myHand.addCard();
        TwentyOne.myHand.displayHand();
        System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue() + "\n");
        if (TwentyOne.myHand.checkValue() > 21) {
            System.out.println("You have Busted");
            
        } else if (TwentyOne.myHand.checkValue() == 21) {
            System.out.println("21! You win!");
        } 
    }
             
    
    public void stay(){
        System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue() + "\n");
    }

    public void deal() {

                    myDeck.initDeck();
                    myDeck.shuffleDeck();
                    for (int i = 0; i< 1; i++ ){
                    System.out.println("Player's Turn");
                    TwentyOne.myHand.initHand();
                    TwentyOne.myHand.displayHand();
                            
                        int check = TwentyOne.myHand.checkValue();
                        if (check == 21) {
                        System.out.println("21 you win!");
                        } 

            
                    System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue() + "\n");
                    GameMenuView myGameMenuView = new GameMenuView();
                    myGameMenuView.display();
                    myGameMenuView.getInput();
                    }
                    Dealer myDealer = new Dealer();        
    }
}
