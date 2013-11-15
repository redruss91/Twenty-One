
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
     
     
     Playeronehand reporter = new Playeronehand();
     HelpMenuView forhelp = new HelpMenuView();
     HelpMenuControl exhelp = new HelpMenuControl();
     Deck deck = new Deck();
     
     static int playeroneHit;
     boolean fore = false;
     static int i = 0;
     static boolean s = true;
     String menu;
     String lineup = "\n=============================="
               + "\n   What do you want to do?"
               + "\n=============================="
               + "\n - hit - Gives you another card."
               + "\n - stay - Keep your cards."
               + "\n - help - Opens help menu."
               + "\n - quit - Ends current game."
            + "\n==============================\n";
     
 
     
   public void init(){
       
       Scanner input = new Scanner(System.in);
       String other;
   
        
   while(i< 2){
         
      
        
        
       System.out.println(this.lineup);
       this.menu = input.next(); 
           switch (this.menu) {
               
               case "hit":
                   //for hit
                   playeroneHit = deck.myarray[11][0];
                   hitme();
                  
                   Twentyone.pauseProgram();
                   
                   reporter.find();
                   reporter.findtwo();
                   reporter.findthree();
                   reporter.htwin();
                   bustin();
                   break;
                   
                   
               case "help":
                   //start help sequence
                   exhelp.helptwo();
                   break;
                   
               case "quit":
               case "end":
               case "exit":
                   System.out.println("\nThank you for playing.");
                   i=2;
                   break;
                   
               case "stay":
                 //for hit                                  
                   bustin();
                  break;
                   
               default:
                   System.out.println("Error -- Please enter a valid input.");
                   break;
           }
                    }
   
   
   
   
   
   }
     
     public void bustin(){            
            if((reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit) == (reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit))
                    {System.out.println("\nTIE!!!");}   
            else if((reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit) <= 21){
                
                if((reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit) == 21)
                    {System.out.println("\nP1 WINS!!! With " + (reporter.playeroneOne + Orders.playeroneHit + reporter.playeroneTwo)+" points!");}
                
                else if((reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit) > (reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit))
                    {System.out.println("\nP1 WINS!!! With " + (reporter.playeroneOne + Orders.playeroneHit + reporter.playeroneTwo)+" points!");}
                
                else if((reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit) > 21 )
                    {System.out.println("\nP1 WINS!!! With " + (reporter.playeroneOne + Orders.playeroneHit + reporter.playeroneTwo)+" points!");}
                 }
            
            else if((reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit) <= 21){
                
                if((reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit) == 21)
                    {System.out.println("\nP2 WINS!!! With " + (reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit)+" points!");}
                
                else if((reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit) > (reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit))
                    {System.out.println("\nP2 WINS!!! With " + (reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit)+" points!");}
                
                else if((reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit) > 21 )
                    {System.out.println("\nP2 WINS!!! With " + (reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit)+" points!");}
                }
            
            else {System.out.println("\n**Error**");}
                i = 2; 
                            
              }
     
     
     
     
     public void hitme(){
        while (this.fore != true ){
         
                     if(reporter.playeroneOne + reporter.playeroneTwo > 21 && playeroneHit == 11)
                        {reporter.playeroneTwo = 1; System.out.println("you recieve an ace");}
    
                    else if(playeroneHit == 11 )
                        {System.out.println("\nYou recieve an ace");}
    
                    else if(playeroneHit == 1 && reporter.playeroneOne + reporter.playeroneTwo + playeroneHit <= 21)
                        {System.out.println("\nYou recieve an ace"); reporter.playeroneTwo = 11;}
    
                    else if(playeroneHit >= 2 && playeroneHit <= 10)
                        {System.out.println("\nYou receive a " + playeroneHit);}

                    else if (playeroneHit == 11)
                        {System.out.println("\nYou recieve a jack");}
    
                    else if (playeroneHit == 12)
                         {System.out.println("\nYou recieve a queen");}
    
                    else if (playeroneHit == 13)
                         {System.out.println("\nYou recieve a king");}

                    else {System.out.println("**Error**");}
    
                        fore = true;
                    }  }  
     
}
   

    

