
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylerussell
 */
public class Help {
    
    String description = "The game is based on the card game 21.\n" +
            "Players start with 2 cards and draw additional cards to\n" +
            "try to get as close as they can to a score of 21 without going over.\n";
    String goal = "To beat the dealer by getting as close to a score of 21 as\n" + 
            "possible without going over.\n";
    String rules = "1. Each player starts with 2 cards.\n\n"
            + "2. Dealer starts with 2 cards but only the first card is shown to\n"
            + " the players.\n\n"
            + "3. Players take turns trying to get a score as close to 21 as\n"
            + "possible.\n\n"
            + "4. During a turn a player can “hit” – take additional cards until\n"
            + "the total score of the cards is 21\n\n"
            + "5. A player’s turn is over when they “hold” – stop drawing cards\n"
            + "or they “bust” score over 21\n\n"
            + "6. After the players complete their turns the dealer takes his\n"
            + "turn following the same rules as the players.\n\n"
            + "7. If the player “busts” then they lose.\n\n"
            + "8. If the player scores more than the dealer then they win.\n\n"
            + "9. If the player scores the same as the dealer then they tie.\n\n"
            + "10. If the player scores less than the dealer then they lose.\n";
    String menu;
    
    public static void main(String[] args){
        
        Help help1 = new Help();
        help1.help2();
    }
    
    public void help2(){
        
        int count = 0;
        String other;
        Scanner input = new Scanner(System.in);
        while (count < 1){
         while (count < 1){
        System.out.println("Welcome to Help! Type 'description' for a description\n"
                + "of the game. Type 'goal' to find out what the goal of the\n"
                + "game is. Type 'rules' to display the rules of the game\n\n");
        
        this.menu = input.next();
        
        System.out.println("\n");
        
        if ("rules".equals(this.menu)){
            System.out.println(this.rules);
            count++;
        } else if ("goal".equals(this.menu)){
            System.out.println(this.goal);
            count++;
        } else if ("description".equals(this.menu)){
            System.out.println(this.description);
            count++;
        } else 
            System.out.println("Error: Invalid input. Please select one of\n"
                + "the options listed, or try typing in all lowercase.\n");
         }
        
        System.out.println("To return to the hep menu, type 'menu'. To quit this\n"
                + "program, type 'quit'\n");
        other = input.next();
        
        if ("menu".equals(other)){
            count = 0;
            System.out.println("\n");
        }
        }
        
    }
    
}
