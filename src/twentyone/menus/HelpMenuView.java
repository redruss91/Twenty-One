/*
 * This will display the Help Menu. 
 * 
 */
package twentyone.menus;

import java.util.Scanner;
import twentyone.control.HelpMenuControl;

/**
 * @author WMitchell
 * @author RFord
 */
public class HelpMenuView extends Menu {
    
        private final static String[][] menuItems = {
        {"R", "Rules"},
        {"I", "Instructions"},        
        {"Q", "Quit Help"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        super (HelpMenuView.menuItems);
        
    } 
    @Override
    // display the help menu and get the end users input selection
    public String getInput() {       
        
        String gameStatus = "playing";
        do {
            this.displayMenu();
            
            String command = this.getCommand();
            switch (command) {
                case "R":
                    this.helpMenuControl.displayHelpRules();
                    break;
                case "I":
                    this.helpMenuControl.displayHelpInstructions();
                    break; 
                case "Q": 
                    return "QUIT";
            }
        } while (!gameStatus.equals("QUIT"));  
        
         return gameStatus;
    }
}