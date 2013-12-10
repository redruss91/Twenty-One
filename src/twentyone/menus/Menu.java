
package twentyone.menus;  

import java.util.Scanner;
import twentyone.interfaces.DisplayInfo;
import twentyone.interfaces.EnterInfo;
import twentyone.exceptions.ExceptionMenu;

/**
* @author Kyle Russell
*/

public abstract class Menu implements DisplayInfo, EnterInfo{

    private String[][] menuItems = null;

    public Menu() {
    }

    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }

    public String[][] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String[][] menuItems) {
        this.menuItems = menuItems;
    }


    public final void display() {
        System.out.println("\n\t****************************************************************");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < this.menuItems.length; i++) {
            System.out.println("\t " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\n\t****************************************************************");
    }

    private boolean validCommand(String command) {
        String[][] items = this.menuItems;

        for (String[] item : this.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    public String getCommand() {

        try {
            Scanner inFile = new Scanner(System.in);
            String command;
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            String[][] items = menuItems;
            for (String[] item : menuItems) {
                if (item[0].equals(command)) {
                    return command;
                }
            }
            throw new ExceptionMenu("invalid input: " + command);
        }  catch (ExceptionMenu e){
            System.out.println("\nPlease enter a valid option: ");            
            return getCommand();
        }    
    }
    /**
     *
     * @param object
     * @return
     */
    public abstract String getInput() throws ExceptionMenu;
}


