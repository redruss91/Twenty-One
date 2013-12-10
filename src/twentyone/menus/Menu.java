
package twentyone.menus;  

import java.util.Scanner;
import twentyone.interfaces.DisplayInfo;
import twentyone.interfaces.EnterInfo;
import twentyone.exceptions.ExceptionMenu;

/**
* @author Kyle Russell
*/

public abstract class Menu implements DisplayInfo, EnterInfo {
    short SuitNumber = 9824;
    byte counter = 0;
    char border;
    private  String[][] menuItems = null;
      

    
//    private MenuControl MenuControl = new MenuControl();
    
    public Menu() {
    }
    public Menu(String[][] menuItems) {
        this();
        this.menuItems = menuItems;
    }
    public void displayMenu(){

            while (++counter < 25){
                    border=(char)SuitNumber;
                    System.out.print(border);
                    if (SuitNumber > 9830) {    
                        SuitNumber = 9824;
                    } else {++SuitNumber;
                    }      
            }                           
            System.out.println("\n\t Menu");
            counter = 0;
            while (++counter < 26){
                    border=(char)SuitNumber;
                    System.out.print("-");
 
            }  
            System.out.println("");

            for (int i = 0; i < menuItems.length; i++) {
            System.out.println("\t" + menuItems[i][0] + " - " + menuItems[i][1]);
        }
            counter = 0;
            while (++counter < 25){
                    border=(char)SuitNumber;
                    System.out.print(border);
                    if (SuitNumber > 9830) {    
                        SuitNumber = 9824;
                    } else {++SuitNumber;
                    }  
            }  
            counter = 0;
            System.out.println("\nEnter your choice: ");
        
    
                    
             
    }
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
}


