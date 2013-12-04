package cit260.main;


import cit260.twentyone.views.HelpMenuView;
import java.util.Scanner;

/**
 *
 * Created by Riley Brown
 */

public class Orders{
     
     
     HelpMenuControl forhelp = new HelpMenuControl();
     HelpMenuView exhelp = new HelpMenuView();
     Deck deck = new Deck();
     Deck.Playeronehand reporter = deck.new Playeronehand();
     
     
     
     boolean fore = false;
     private static int i = 0;
     private static boolean s = true;
     private String menu;
     private String lineup=
                   "\n=============================="
                 + "\n   What do you want to do?"
                 + "\n=============================="
                 + "\n - hit - Gives you another card."
                 + "\n - stay - Keep your cards."
                 + "\n - help - Opens help menu."
                 + "\n - quit - Ends current game."
                 + "\n==============================\n";

    
     
  public void init(){
       
       Scanner inFile = Twentyone.getInputFile();
       String other;
   
        
   while(i< 2){
         
      
        
        
       System.out.println(this.lineup);
       this.menu = inFile.next(); 
           switch (this.menu) {
               
               case "hit":
                   //for hit
                   reporter.hitreturn();
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
                 reporter.playeroneHit = Deck.myarray[11][0];                                
                   bustin();
                  break;
                   
               default:
                   System.out.println("Error -- Please enter a valid input.");
                   break;
           }
                    }
   
   
   
   
   
   }
     
  public void bustin(){
         
            if((reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit) == (reporter.playeroneOne + reporter.playeroneTwo + reporter.playeroneHit))
                    {System.out.println("\nTIE!!!");}   
            else if((reporter.playeroneOne + reporter.playeroneTwo + reporter.playeroneHit) <= 21){
                
                if((reporter.playeroneOne + reporter.playeroneTwo + reporter.playeroneHit) == 21)
                    {System.out.println("\nP1 WINS!!! With " + (reporter.playeroneOne + reporter.playeroneHit + reporter.playeroneTwo)+" points!");}
                
                else if((reporter.playeroneOne + reporter.playeroneTwo + reporter.playeroneHit) > (reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit))
                    {System.out.println("\nP1 WINS!!! With " + (reporter.playeroneOne + reporter.playeroneHit + reporter.playeroneTwo)+" points!");}
                
                else if((reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit) > 21 )
                    {System.out.println("\nP1 WINS!!! With " + (reporter.playeroneOne + reporter.playeroneHit + reporter.playeroneTwo)+" points!");}
                 }
            
            else if((reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit) <= 21){
                
                if((reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit) == 21)
                    {System.out.println("\nP2 WINS!!! With " + (reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit)+" points!");}
                
                else if((reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit) > (reporter.playeroneOne + reporter.playeroneTwo + reporter.playeroneHit))
                    {System.out.println("\nP2 WINS!!! With " + (reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit)+" points!");}
                
                else if((reporter.playeroneOne + reporter.playeroneTwo + reporter.playeroneHit) > 21 )
                    {System.out.println("\nP2 WINS!!! With " + (reporter.playertwoOne + reporter.playertwoTwo + reporter.playertwoHit)+" points!");}
                }
            
            else {System.out.println("\n**Error**");}
                i = 2; 
                            
              }
     
  public void hitme(){
         reporter.playeroneHit = Deck.myarray[11][0];
        while (this.fore = false ){
         
                     if(reporter.playeroneOne + reporter.playeroneTwo > 21 && reporter.playeroneHit == 11)
                        {reporter.playeroneTwo = 1; System.out.println("you recieve an ace");}
    
                    else if(reporter.playeroneHit == 11 )
                        {System.out.println("\nYou recieve an ace");}
    
                    else if(reporter.playeroneHit == 1 && reporter.playeroneOne + reporter.playeroneTwo + reporter.playeroneHit <= 21)
                        {System.out.println("\nYou recieve an ace"); reporter.playeroneTwo = 11;}
    
                    else if(reporter.playeroneHit >= 2 && reporter.playeroneHit <= 10)
                        {System.out.println("\nYou receive a " + reporter.playeroneHit);}

                    else if (reporter.playeroneHit == 11)
                        {System.out.println("\nYou recieve a jack");}
    
                    else if (reporter.playeroneHit == 12)
                         {System.out.println("\nYou recieve a queen");}
    
                    else if (reporter.playeroneHit == 13)
                         {System.out.println("\nYou recieve a king");}

                    else {System.out.println("**Error**");}
    
                        fore = true;
                    }  }  
     
  public void find() {
  Deck deck = new Deck();
    boolean fight = false;
    
       while (fight != true ){
          
    if(reporter.playeroneOne + reporter.playeroneTwo > 21 && reporter.playeroneOne == 11)
    {reporter.playeroneOne = 1; reporter.handhold = Twentyone.name + ", you have in your hand an ace of " + deck.suit();}
        
    else if(reporter.playeroneOne == 11)
    {reporter.handhold = Twentyone.name + ", you have in your hand an ace of " + deck.suit();}
 
    else if(reporter.playeroneOne == 1  && reporter.playeroneOne + reporter.playeroneTwo + reporter.playeroneHit <= 21)
    {reporter.handhold = Twentyone.name + ", you have in your hand an ace of " + deck.suit(); reporter.playeroneOne = 11;}
    
    else if(reporter.playeroneOne >= 2 && reporter.playeroneOne <= 10)
    {reporter.handhold = Twentyone.name + ", you have in your hand a " + reporter.playeroneOne +  " of " + deck.suit();}

    else if(reporter.playeroneOne == 11)
    {reporter.handhold = Twentyone.name + ", you have in your hand a jack of " + deck.suit(); reporter.playeroneOne = 10;}
    
     else if(reporter.playeroneOne == 12)
    {reporter.handhold = Twentyone.name + ", you have in your hand a queen of " + deck.suit(); reporter.playeroneOne = 10;}
     
      else if(reporter.playeroneOne == 13)
    {reporter.handhold = Twentyone.name + ", you have in your hand a king of " + deck.suit(); reporter.playeroneOne = 10;}

    else {System.out.println("**Error**");}
    
        fight = true;
     }
    }
          
  public void findtwo() {
   Deck deck = new Deck();
    boolean finn = false;
     while (finn != true ){
                
   if(reporter.playeroneOne + reporter.playeroneTwo > 21 && reporter.playeroneTwo == 11)
    {reporter.playeroneTwo = 1; System.out.println(reporter.handhold += " and an ace of " + deck.suit2());}
    
    else if(reporter.playeroneTwo == 11 )
    {System.out.println(reporter.handhold += " and an ace of " + deck.suit2());}
    
    else if(reporter.playeroneTwo == 1 && reporter.playeroneOne + reporter.playeroneTwo + reporter.playeroneHit <= 21)
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
     finn = true;
     }
}

  public void findthree(){
  
    if(reporter.playeroneHit == 11 || reporter.playeroneHit == 1){
                   System.out.println(" and an ace.");}
    
                    else if(reporter.playeroneHit >= 2 && reporter.playeroneHit <= 10)
                   {System.out.println(" and a " + reporter.playeroneHit);}
                    
                   else if (reporter.playeroneHit == 11)
                   {System.out.println(" and a jack."); reporter.playeroneHit = 10;}
                   
                   else if (reporter.playeroneHit == 12)
                   {System.out.println(" and a queen."); reporter.playeroneHit = 10;}
                   
                   else if (reporter.playeroneHit == 13)
                   {System.out.println(" and a king."); reporter.playeroneHit = 10;}

                   else {System.out.println("**Error**"); reporter.playeroneHit = 10;}
                  
                  



}

  public void htwin(){
      Orders orders = new Orders();
                   if (reporter.playeroneHit + reporter.playeroneOne + reporter.playeroneTwo > 21)
                       { System.out.println("\nBUST!");} //trying to end the game
               
                   else if (reporter.playeroneOne + reporter.playeroneTwo + reporter.playeroneHit == 21)
                       {System.out.println("21!\n");}
}
}
   

    

