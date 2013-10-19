
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aziekayrussell
 */
public class MainMenuControl {
    
    MainMenuView MainMenu = new MainMenuView();
    mainGame Game = new mainGame();
    HelpMenuControl help = new HelpMenuControl();
    HelpMenuView helpTwo = new HelpMenuView();
    
    public void mainMenu(){
        
        int count = 0;
        String other;
        Scanner input = new Scanner(System.in);
        while (count < 1){
         while (count < 1){
             
             MainMenu.descriptionMain();
             
             MainMenu.menu = input.nextInt();
             
              System.out.println("\n");
        
        if (1 == MainMenu.menu){
            Game.game();
            count++;
        } else if (2 == MainMenu.menu){
            help.helptwo();
            count++;
        } else if (3 == MainMenu.menu){
            count++;
        } else 
            MainMenu.error();
         }
        
        MainMenu.goback();
        other = input.next();
        
        if ("menu".equals(other)){
            count = 0;
            System.out.println("\n");
        }
             
             
         }
        }
    }
    

