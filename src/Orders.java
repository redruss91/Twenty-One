

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Created by Riley Brown
 */
public class Orders{
     
     
     Playeronehand reporter = new Playeronehand();
     HelpMenuView forhelp = new HelpMenuView();
     HelpMenuControl exhelp = new HelpMenuControl();
     Deck deck = new Deck();
     
     static int playeroneHit;
     boolean fore = false;
     static int i = 0;
     static boolean s = true;
     String menu;
     String lineup="\n=============================="
                 + "\n   What do you want to do?"
                 + "\n=============================="
                 + "\n - hit - Gives you another card."
                 + "\n - stay - Keep your cards."
                 + "\n - help - Opens help menu."
                 + "\n - quit - Ends current game."
                 + "\n==============================\n";

    public Orders() {
    }
     
 
     
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
                   
                   find();
                   findtwo();
                   findthree();
                   htwin();
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
      public void find() {
  
    boolean fore = false;
    
       while (fore != true ){
          
    if(reporter.playeroneOne + reporter.playeroneTwo > 21 && reporter.playeroneOne == 11)
    {reporter.playeroneOne = 1; reporter.handhold += Twentyone.name + ", you have in your hand an ace of " + deck.suit();}
        
    else if(reporter.playeroneOne == 11)
    {reporter.handhold += Twentyone.name + ", you have in your hand an ace of " + deck.suit();}
 
    else if(reporter.playeroneOne == 1  && reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit <= 21)
    {reporter.handhold += Twentyone.name + ", you have in your hand an ace of " + deck.suit(); reporter.playeroneOne = 11;}
    
    else if(reporter.playeroneOne >= 2 && reporter.playeroneOne <= 10)
    {reporter.handhold += Twentyone.name + ", you have in your hand a " + reporter.playeroneOne +  " of " + deck.suit();}

    else if(reporter.playeroneOne == 11)
    {reporter.handhold += Twentyone.name + ", you have in your hand a jack of " + deck.suit(); reporter.playeroneOne = 10;}
    
     else if(reporter.playeroneOne == 12)
    {reporter.handhold += Twentyone.name + ", you have in your hand a queen of " + deck.suit(); reporter.playeroneOne = 10;}
     
      else if(reporter.playeroneOne == 13)
    {reporter.handhold += Twentyone.name + ", you have in your hand a king of " + deck.suit(); reporter.playeroneOne = 10;}

    else {System.out.println("**Error**");}
    
        fore = true;
     }
    }
      public void findtwo() {
   
    boolean fore = false;
     while (fore != true ){
                
   if(reporter.playeroneOne + reporter.playeroneTwo > 21 && reporter.playeroneTwo == 11)
    {reporter.playeroneTwo = 1; System.out.println(reporter.handhold += " and an ace of " + deck.suit2());}
    
    else if(reporter.playeroneTwo == 11 )
    {System.out.println(reporter.handhold += " and an ace of " + deck.suit2());}
    
    else if(reporter.playeroneTwo == 1 && reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit <= 21)
    {System.out.println(reporter.handhold += " and an ace of " + deck.suit2()); reporter.playeroneTwo = 11;}
    
    else if(reporter.playeroneTwo >= 2 && reporter.playeroneTwo <= 10)
    {System.out.println(reporter.handhold += " and a " + reporter.playeroneTwo + " of " + deck.suit2());}

    else if (reporter.playeroneTwo == 11)
    {System.out.println(reporter.handhold += " and a jack of  " + deck.suit2());  reporter.playeroneTwo = 10;}
    
    else if (reporter.playeroneTwo == 12)
    {System.out.println(reporter.handhold += " and a queen of  " + deck.suit2());  reporter.playeroneTwo = 10;}
    
    else if (reporter.playeroneTwo == 13)
    {System.out.println(reporter.handhold += " and a king of  " + deck.suit2());  reporter.playeroneTwo = 10;}

    else {System.out.println("**Error**");}
     fore = true;
     }
}

public void findthree(){
  
    if(Orders.playeroneHit == 11 || Orders.playeroneHit == 1){
                   System.out.println(" and an ace.");}
    
                    else if(Orders.playeroneHit >= 2 && Orders.playeroneHit <= 10)
                   {System.out.println(" and a " + Orders.playeroneHit);}
                    
                   else if (Orders.playeroneHit == 11)
                   {System.out.println(" and a jack."); Orders.playeroneHit = 10;}
                   
                   else if (Orders.playeroneHit == 12)
                   {System.out.println(" and a queen."); Orders.playeroneHit = 10;}
                   
                   else if (Orders.playeroneHit == 13)
                   {System.out.println(" and a king."); Orders.playeroneHit = 10;}

                   else {System.out.println("**Error**"); Orders.playeroneHit = 10;}
                  
                  



}
public void htwin(){
      Orders orders = new Orders();
                   if (Orders.playeroneHit + reporter.playeroneOne + reporter.playeroneTwo > 21)
                       { System.out.println("\nBUST!");} //trying to end the game
               
                   else if (reporter.playeroneOne + reporter.playeroneTwo + Orders.playeroneHit == 21)
                       {System.out.println("21!\n");}
}
}
   

    

