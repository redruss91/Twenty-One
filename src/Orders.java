
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
     
     int playeroneHit = 0;
     Playeronehand reporter = new Playeronehand();
     HelpMenuView forhelp = new HelpMenuView();
     HelpMenuControl exhelp = new HelpMenuControl();
     Deck deck = new Deck();
     Playeronehand onehand = new Playeronehand();
     
     int i = 0;
     boolean s = true;
     String chicken = "You now have in your hand a " + deck.playeroneOne + " and a " + deck.playeroneTwo + " and a ";
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
                   
                   //value not staying assigned...
                   playeroneHit = deck.myarray[11][0];
                  
                   while (fore != true ){
         
                    if(deck.playeroneOne + deck.playeroneTwo + playeroneHit > 21 && playeroneHit == 11)
                         {playeroneHit = 1; System.out.println(onehand.handhold + "\nYou receive an ace.\n");}
    
                    else if(playeroneHit == 11 )
                        {System.out.println(onehand.handhold + "\nYou recieve an ace.\n");}
    
                    else if(playeroneHit == 1 && deck.playeroneOne + deck.playeroneTwo + playeroneHit <= 21)
                        {System.out.println(onehand.handhold + "\nYou receive an ace.\n"); playeroneHit = 11;}
    
                    else if(playeroneHit >= 2 && playeroneHit < 10)
                        {System.out.println(onehand.handhold + "\nYou recieve a " + playeroneHit +"\n");}

                    else if (playeroneHit == 10)
                        {System.out.println(onehand.handhold + "\nYou receive a face card.\n");}

                    else {System.out.println("**Error**\n");}
    
                        fore = true;
                    }
                   reporter.find();
                   reporter.findtwo();
                   if(this.playeroneHit == 11 || this.playeroneHit == 1){
                   System.out.println(onehand.handhold += "and an ace.");}
                    else if(this.playeroneHit >= 2 && this.playeroneHit <= 10)
                   {System.out.println(onehand.handhold += "and a " + this.playeroneHit);}
                   else if (this.playeroneHit == 11)
                   {System.out.println(onehand.handhold += "and a jack.");}
                   
                   else if (this.playeroneHit == 12)
                   {System.out.println(onehand.handhold += "and a queen.");}
                   
                   else if (this.playeroneHit == 13)
                   {System.out.println(onehand.handhold += "and a king.");}

                   else {System.out.println("**Error**");}
               
                   if (this.playeroneHit + deck.playeroneOne + deck.playeroneTwo > 21)
                       { this.i=2; System.out.println("BUST!"); reporter.bustin(); this.s= false;} //trying to end the game
               
                   else if (deck.playeroneOne + deck.playeroneTwo + this.playeroneHit == 21)
                       {System.out.println("21!\n"); reporter.bustin(); this.s= false;}
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
                   //stay ends game for player deck.
                   if((deck.playeroneOne + deck.playeroneTwo + this.playeroneHit) < 21) 
                       { reporter.bustin(); this.i=2;}
                   else
                       {System.out.println("Bust!"); this.i=2; reporter.bustin();}
                   break;
               default:
                   System.out.println("Error -- Please enter a valid input.");
                   break;
           }
                    }
   
   
   
   
   
   }
}
   

    

