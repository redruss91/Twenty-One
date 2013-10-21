
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
     report reporter = new report();
     comparison comptodo = new comparison();
     HelpMenuView forhelp = new HelpMenuView();
     HelpMenuControl exhelp = new HelpMenuControl();
     int i = 0;
     String menu;
    
     
     @SuppressWarnings("empty-statement")
     
   public void init(){
       Scanner input = new Scanner(System.in);
       String other;
       System.out.println("\nWhat do you want to do?");
       
        System.out.println("\n");
        
   for(i=0; i< 2;){
       this.menu = input.next(); 
    
      
    if("hit".equals(this.menu)){
        
    reporter.hitter();
    reporter.displayhandone();
    }
    
    else if ("help".equals(this.menu)){
    //start help sequence
        exhelp.helptwo();
        
    }
    else if ("quit".equals(this.menu)){
    //exit game? System.out.println("Thank you for playing");
        i=2;
    }
    else if ("options".equals(this.menu)){
        
    System.out.println("\nYou can type: hit, stay, help, quit.");
    
    }
    
    else if("stay".equals(this.menu)){
     //stay ends game for player one.
        
        
        if (comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit == comptodo.playeroneOne + comptodo.playeroneTwo + comptodo.playeroneHit)
       {System.out.println("\nTIE!!!");}
         
            else if(comptodo.playeroneOne + comptodo.playeroneTwo + comptodo.playeroneHit > comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit)

       {System.out.println("\nP1 WINS!!!");}
     
            else if(comptodo.playeroneOne + comptodo.playeroneTwo + comptodo.playeroneHit < comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit)

       {System.out.println("\nP2 WINS!!!");}
          
            else {System.out.println("\n**Error**");}
        i=2;//game ends
        }
    
    else{System.out.println("Error");}
    
       }
   }
}
    

