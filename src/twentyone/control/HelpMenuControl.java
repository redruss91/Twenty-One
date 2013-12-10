package twentyone.control;

/**
 * @author Kyle Russell
 */
public class HelpMenuControl {               
    
        public void displayHelpRules() {
        
        System.out.println(
"\n21 RULES\n"+                
"\n1. The objective of the game is to get the highest total without exceeding 21.\n" +
"1. Each Player has their own game against the Dealer.\n" +
"2. If the Player's cards total is higher then 21 it is  a Bust and the Dealer wins even if they Bust too.\n" +
"4. If the Player and the Dealer have the same point value it is a draw.\n" +
"5. Cards of 2 - 10 are worth their face value.\n" +
"6. Jack, Queen and King are worth 10 points each.\n" +
"7. The Ace can be worth 1 or 11 points, depending on what the player has in their hand.\n" +
"8. A hand with an Ace and a 10 or face card is called a Blackjack. It is a winning hand unless the Dealer also has a blackjack.\n" +
"9. To start, the Dealer deals each Player two cards including themselves, the first card will be face up and the other is face down.\n");        
    }

        public void displayHelpInstructions() {
        
        System.out.println(
"\n21 PLAYER INSTRUCTIONS\n" +
"\nThe Player has two options for playing their hand:\n" +
"1. Hit - Get another card.\n" +
"2. Stay - Stay with the current hand.\n" +
"The Player finishes their turn when they decide to Stay or if they Bust.\n" +
"After all Players have played their hand, the Dealer reveals their other card. The Dealer then plays their hand.\n" +
"The Dealer must continue to Hit until they have at least 17.\n");
    
        }

}

