package twentyone.game;

import java.util.Scanner;
import twentyone.exceptions.ExceptionPlayer;

/**
 * @author K Russell
 */
public class Player {
    static String[] playerName = new String[0];
    public int numberofPlayers = 0; 
    int kbdInput;
    String stringInput;
    static Scanner input = new Scanner(System.in);
    static String nameInput;
        
        
    public void getName() {
        for (int i=0; i < playerName.length; i++){ 
            int pnum =i+1;
            System.out.println("\nPlayer " + pnum + " Enter your name: ");
            nameInput = Player.input.next();
            playerName[i] = nameInput;
            System.out.println("\nWelcome " + playerName[i] + "\n");
        }
    }           

    public void multiPlayer() {
        while(numberofPlayers == 0) {
            
            System.out.println("\nNumber of Players (1 or 2): ");
            stringInput = Player.input.next();
            try {
                kbdInput = Integer.parseInt(stringInput);
            } catch(NumberFormatException e) {
                kbdInput = 0;
            }

            try {
                if (kbdInput == 1){
                    numberofPlayers = 1;
                    playerName = new String[1];

                } else if (kbdInput == 2){
                    numberofPlayers = 2;
                    playerName = new String[2];

                } else {
                    throw  new ExceptionPlayer("invalid input");
                }
            } catch (ExceptionPlayer tex) {
                System.out.println("\n\t" + tex.getMessage());
            }
    
        }

    }
    public String currentPlayer(int current) {
        return playerName[current];
        
    }
}

