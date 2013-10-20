
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aziekayrussell
 */
public class MainMenuControl {
    
    int menu = 0;
    
    String error = "Error: Invalid input. Please select one of\n"
                + "the options listed.\n";
    String goback = "To return to the help menu, type 'menu'. To quit this\n"
                + "program, type 'quit'\n";
    
    public void descriptionMain(){
        
        System.out.println("Welcome to the game 21! Please select one of the\n"
                + "options below by entering the number next to your selection.");
        
        System.out.println("1. New Game"
                + "2. Help Menu"
                + "3. Quit Game"
                + "");
    }
    
    public void error(){
        
        System.out.println(this.error);
    }
    
    public void goback(){
        
        System.out.println("this.goback");
    }
    
}
