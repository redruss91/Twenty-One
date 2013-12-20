package twentyone.maingame;

import twentyone.other.Deck;
import twentyone.menus.MainMenuView;
import twentyone.exceptions.ExceptionMenu;
import twentyone.frames.MainFrame;

/**
 * @author K Russell
 */
public class TwentyOne {
    public static Hand myHand = new Hand();
    public static Player myPlayer = new Player();
    public static Deck myDeck = new Deck();
    public static int currentPlayer;

    
    public static void main(String[] args)  {
        
         MainFrame form = new MainFrame();
        form.setVisible(true);
      
}
}
    
