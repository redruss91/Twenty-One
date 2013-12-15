package twentyone.maingame;

import twentyone.other.Deck;
import twentyone.menus.MainMenuView;
import twentyone.exceptions.ExceptionMenu;

/**
 * @author K Russell
 */
public class MainGame {
    public static Hand myHand = new Hand();
    public static Player myPlayer = new Player();
    public static Deck myDeck = new Deck();
    public static int currentPlayer;

    
    public static void mainGame()  {
        
        try {
            TwentyOne myGame = new TwentyOne();
            System.out.println("\n" + "Welcome to 21.");
            myPlayer.multiPlayer();
            myPlayer.getName();
            MainMenuView myMainMenu = new MainMenuView();      
            myMainMenu.getInput();      
        } catch (ExceptionMenu e) {
                System.out.println("\n\t" + e.getMessage());
        } finally {
                System.out.println("\n\tGame Over");        
        }
}
}
    
