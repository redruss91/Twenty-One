
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
       System.out.println(
               "\n=============================="
               + "\nWhat do you want to do?"
               + "\n- hit - Gives you another card."
               + "\n- stay - Keep your cards."
               + "\n- help - Opens help menu."
               + "\n- quit - Ends current game."
               + "\n==============================");
       
        System.out.println("\n");
        
   for(i=0; i< 2;){
       
       this.menu = input.next(); 
    
      
    if("hit".equals(this.menu)){
    reporter.hitter(); 
    reporter.displayhandone();
    System.out.println("You now have in your hand a " + comptodo.playeroneOne + " and a " + comptodo.playeroneTwo + " and a " + reporter.telltell);
    }    
    else if ("help".equals(this.menu)){
    //start help sequence
        exhelp.helptwo();   
    }
    else if ("quit".equals(this.menu)){
    System.out.println("Thank you for playing");
        i=2; 
    }   
    else if("stay".equals(this.menu)){
      //reporter.telltell
        //stay ends game for player one.
        if((reporter.tellone + reporter.telltwo + reporter.telltell) < 21) {
           
            //put this into a different class
                if ((comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit) == (reporter.tellone + reporter.telltwo + reporter.telltell))
                    {System.out.println("\nTIE!!!");}   
                
                else if((reporter.tellone + reporter.telltwo + reporter.telltell) > (comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit) && (comptodo.playeroneOne + comptodo.playeroneTwo + comptodo.playeroneHit) <= 21)
                     {System.out.println("\nP1 WINS!!! With " + (reporter.tellone + reporter.telltell + reporter.telltwo)+" points!");}    
                
                else if((reporter.tellone + reporter.telltwo + reporter.telltell) < (comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit) && (comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit) <= 21)
                    {System.out.println("\nP2 WINS!!!");}  
                
                else {System.out.println("\n**Error**"); i=2;//game ends//
                }
                }     
       else{System.out.println("Bust!"); this.i=2; }//put here, the same IF as above. 
      }
    
    else{System.out.println("Error");}
                    }
   
   
   
   
   
   }
}
   

    

