package twentyone.menus;

import java.util.Scanner;
import twentyone.control.GameMenuControl;
import twentyone.interfaces.ShowHelp;
import twentyone.game.TwentyOne;

/**
 * @author Kyle Russell
 */
public class GameMenuView extends Menu implements ShowHelp {
    private final static String[][] menuItems = {
    {"D", "Deal"},
    {"H", "Hit"},
    {"S", "Stand"},        
    {"Q", "Quit Game"}        
    };
    public GameMenuView() {
        super (GameMenuView.menuItems);
    }
    
    private GameMenuControl gameMenuControl = new GameMenuControl();
    

@Override            
    public String getInput() {       
        
        
        String gameStatus = "waiting";
        do {

            
            
            String command = getCommand();
            try{
            switch (command) {
                case "D":
                    gameMenuControl.deal();
                    return "PLAYING";
                case "H":
                    if (!gameStatus.equals("waiting")) 
                    System.out.println ("You can't Hit if there is no active game"); 
                    else 
                    gameMenuControl.hit();
                    if (TwentyOne.myHand.checkValue() >= 21) {
                        return "QUIT";
                    }
                    break;
                case "S":
                    gameMenuControl.stand();
                    return "QUIT";
                case "Q": 
                    return "QUIT";
            }
            }
            catch (Exception e){
                    System.out.println ("Please Enter a D, H, S, or Q");
                    }
            
        } while (!gameStatus.equals("QUIT"));  
        
         return gameStatus;
    }

    @Override
    public void HelpMenu() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}