
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
     
     static int playeroneHit = 0;
     Playeronehand reporter = new Playeronehand();
     HelpMenuView forhelp = new HelpMenuView();
     HelpMenuControl exhelp = new HelpMenuControl();
     Deck deck = new Deck();
     Playeronehand onehand = new Playeronehand();
     
     int i = 0;
     boolean s = true;
     String chicken = "You now have in your hand a " + reporter.playeroneOne + " and a " + reporter.playeroneTwo + " and a ";
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
         boolean fore = false;
      
        
        
       System.out.println(this.lineup);
       this.menu = input.next(); 
           switch (this.menu) {
               
               case "hit":
                   //for hit
                   
                   playeroneHit = deck.myarray[11][0];
                  
                   while (fore != true ){
         
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
                    }
                   Twentyone.pauseProgram();
                  onehand.find();
                  onehand.findtwo();
                   if(Orders.playeroneHit == 11 || Orders.playeroneHit == 1){
                   System.out.println(" and an ace.");}
                    else if(Orders.playeroneHit >= 2 && Orders.playeroneHit <= 10)
                   {System.out.println(" and a " + Orders.playeroneHit);}
                   else if (Orders.playeroneHit == 11)
                   {System.out.println(" and a jack.");}
                   
                   else if (Orders.playeroneHit == 12)
                   {System.out.println(" and a queen.");}
                   
                   else if (Orders.playeroneHit == 13)
                   {System.out.println(" and a king.");}

                   else {System.out.println("**Error**");}
                  
                   if (Orders.playeroneHit + reporter.playeroneOne + reporter.playeroneTwo > 21)
                       { this.i=2; System.out.println("\nBUST!"); bustin(); this.s= false;} //trying to end the game
               
                   else if (reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit == 21)
                       {System.out.println("21!\n"); bustin(); this.s= false;}
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
                   //this.playeroneHit
                   //stay ends game for player reporter.
                   if((reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit) < 21) 
                       { bustin(); this.i=2;}
                   else
                       {System.out.println("Bust!"); this.i=2; bustin();}
                   break;
               default:
                   System.out.println("Error -- Please enter a valid input.");
                   break;
           }
                    }
   
   
   
   
   
   }
     
     public void bustin() {
            
            if ((reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit) == (reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit))
                    {System.out.println("\nTIE!!!");}   
            else if ((reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit) <= 21){
                
                if ((reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit) == 21)
                {System.out.println("\nP1 WINS!!! With " + (reporter.playeroneOne + Orders.playeroneHit + reporter.playeroneTwo)+" points!");}
                
                else if ((reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit) > (reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit))
                {System.out.println("\nP1 WINS!!! With " + (reporter.playeroneOne + Orders.playeroneHit + reporter.playeroneTwo)+" points!");}
                
                else if ((reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit) > 21 )
                {System.out.println("\nP1 WINS!!! With " + (reporter.playeroneOne + Orders.playeroneHit + reporter.playeroneTwo)+" points!");}
                 }
            
            else if ((reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit) < 21){
                
                if ((reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit) == 21)
                {System.out.println("\nP2 WINS!!! With " + (reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit)+" points!");}
                
                else if ((reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit) > (reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit))
                {System.out.println("\nP2 WINS!!! With " + (reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit)+" points!");}
                
                else if ((reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit) > 21 )
                {System.out.println("\nP2 WINS!!! With " + (reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit)+" points!");}
                }
            
            else {System.out.println("\n**Error**");}
            
            
                             
              }
     
     
}
   

    

