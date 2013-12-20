/*
* This will be the Main Menu for the game.
* 
* 11/16/13 -WM
* 
* Assigned to WMitchell.
*/

package twentyone.menus;  

import java.util.Scanner;

import twentyone.maingame.Game;
import twentyone.maingame.TwentyOne;
import twentyone.exceptions.ExceptionMenu;

/**
* @author Kyle Russell
*/
public class MainMenuView extends Menu {
    
    private final static String[][] menuItems = {
        {"1", "Start Game"},
        {"2", "Help"},        
        {"3", "Exit"}        
    };
 
    public MainMenuView() {
        super (MainMenuView.menuItems);
        
    } 
    @Override
    public String getInput() throws ExceptionMenu {       
        
        String gameStatus = Game.PLAYING;
        do {
            this.display();
            String command = this.getCommand();
        try {
            switch (command) {
                case "1":
                    GameMenuView myGameMenu = new GameMenuView();
                    myGameMenu.display();
                    myGameMenu.getInput();
                    break;
                case "2":
                    HelpMenuFrame myHelpMenu = new HelpMenuFrame();
                    myHelpMenu.helpFrame();
                    

                    break;
                case "3":

                    return "QUIT";
                default: throw  new ExceptionMenu("invalid input: " + command);
            } 
        } catch (ExceptionMenu tex) {
                System.out.println("\n\t" + tex.getMessage());
}
        } 
        while (!gameStatus.equals("QUIT"));
        TwentyOne.currentPlayer ++;
        return "QUIT";
    }
                    
             
    }
