
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
     
     comparison comptodo = new comparison();
     report reporter = new report();
     HelpMenuView forhelp = new HelpMenuView();
     HelpMenuControl exhelp = new HelpMenuControl();
     int i = 0;
     String chicken = "You now have in your hand a " + comptodo.playeroneOne + " and a " + comptodo.playeroneTwo + " and a ";
     String menu;
     String lineup = "\n=============================="
               + "\nWhat do you want to do?"
               + "\n- hit - Gives you another card."
               + "\n- stay - Keep your cards."
               + "\n- help - Opens help menu."
               + "\n- quit - Ends current game."
            + "\n==============================\n";
     
     @SuppressWarnings("empty-statement")
     
   public void init(){
      
       Scanner input = new Scanner(System.in);
       String other;
                 
       
        System.out.println("\n");
        
   while(i< 2){
       System.out.println(this.lineup);
       this.menu = input.next(); 
    
      
    if("hit".equals(this.menu)){
    //for hit
       
    reporter.hitter();
    reporter.find();
    reporter.findtwo();
    if(comptodo.playeroneHit == 11 || comptodo.playeroneHit == 1){
    System.out.println("and an ace.");}
     else if(comptodo.playeroneHit >= 2 && comptodo.playeroneHit <= 10)
    {System.out.println("and a " + comptodo.playeroneTwo);} // + " of " + comptodo.suitt + ".");}
    else if (comptodo.playeroneHit == 11)
    {System.out.println("and a jack.");}
    
    else if (comptodo.playeroneHit == 12)
    {System.out.println("and a queen.");}
    
    else if (comptodo.playeroneHit == 13)
    {System.out.println("and a king.");}

    else {System.out.println("**Error**");}
    
    System.out.println();
    
        if (comptodo.playeroneHit + comptodo.playeroneOne + comptodo.playeroneTwo > 21)
            { this.i=2; System.out.println("BUST!");} //trying to end the game
    
        else if (comptodo.playeroneOne + comptodo.playeroneTwo + comptodo.playeroneHit == 21)
            {System.out.println("21!\n"); reporter.bustin();}

        else{reporter.bustin();}
        
                
        
    }    
    
    else if ("help".equals(this.menu)){
    //start help sequence
        exhelp.helptwo();   
    }
    
    else if ("quit".equals(this.menu) || "end".equals(this.menu) || "exit".equals(this.menu)){
    System.out.println("\nThank you for playing.");
        i=2; 
    }
    
    else if("stay".equals(this.menu)){
      //comptodo.playeroneHit
        //stay ends game for player comptodo.
        if((comptodo.playeroneOne + comptodo.playeroneTwo + comptodo.playeroneHit) < 21) 
            { reporter.bustin(); this.i=2;}
        else
            {System.out.println("Bust!"); this.i=2; reporter.bustin();}
            }
    
    else{System.out.println("Error -- Please enter a valid input.");}
                    }
   
   
   
   
   
   }
}
   

    

