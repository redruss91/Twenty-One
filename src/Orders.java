
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Created by Riley Brown
 */
public class Orders {
    
    
     HelpMenuView forhelp = new HelpMenuView();
     HelpMenuControl exhelp = new HelpMenuControl();
     int i = 0;
     String menu;
     
   public void init(){
        Scanner input = new Scanner(System.in);
         String other;
       System.out.println("\nWhat do you want to do?");
       
        System.out.println("\n");
        
       for(i=0; i< 2;){
       this.menu = input.next(); 
    
      
    if("hit".equals(this.menu)){
    //add another card to the players hand.
        ++i;
    }
    else if("stay".equals(this.menu)){
    //keep current cards. 
        ++i;
    }
    else if ("help".equals(this.menu)){
    //start help sequence
        exhelp.helptwo();
        ++i;
    }
    else if ("quit".equals(this.menu)){
    //exit game?
        ++i;
    }
    else if ("options".equals(this.menu)){
        
    System.out.println("\nYou can type: hit, stay, help, quit.");
    }
    else{System.out.println("Error");}
    
       }
   }
}
    

