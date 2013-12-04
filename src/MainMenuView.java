
import java.io.Serializable;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aziekayrussell
 */
public class MainMenuView implements Serializable {
    
    MainMenuControl MainMenu = new MainMenuControl();
    mainGame Game = new mainGame();
    HelpMenuView help = new HelpMenuView();
    HelpMenuControl helpTwo = new HelpMenuControl();
    
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
    