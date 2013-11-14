/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rtbro_000
 */
public class Playertwohand {
    
    Playeronehand one = new Playeronehand();
    boolean fore;
   //Will also be used later to display cards. 
    
    /**
     *
     * @param name
     */
    public void findtwoOne() {
    boolean dat = false;
    //Deck one = new Deck();
    
    
       while (dat != true ){
           
    if(one.playertwoOne + one.playertwoTwo > 21 && one.playertwoOne == 11)
    {one.playertwoOne = 1; System.out.println(Twentyone.name + ", you have in your hand an ace");}
        
    else if(one.playertwoOne == 11)
    //name won't show up...?
    {System.out.println(Twentyone.name + ", you have in your hand an ace");}
 
    else if(one.playertwoOne == 1  && one.playertwoOne + one.playertwoTwo + one.playertwoHit <= 21)
    {System.out.println(Twentyone.name + ", you have in your hand an ace"); one.playertwoOne = 11;}
    
    else if(one.playertwoOne >= 2 && one.playertwoOne < 10)
    {System.out.println(Twentyone.name + ", you have in your hand a " + one.playertwoOne);}

    else if(one.playertwoOne == 10)
    {System.out.println(Twentyone.name + ", you have in your hand a face card ");}

    else {System.out.println("error");}
    
        dat = true;
     }
    }



public void findtwoTwo() {
   
    boolean taf = false;
     while (taf != true ){
                
    if(one.playertwoOne + one.playertwoTwo > 21 && one.playertwoTwo == 11)
    {one.playertwoTwo = 1; System.out.println("and an ace.");}
    
    else if(one.playertwoTwo == 11 )
    {System.out.println("and an ace.");}
    
    else if(one.playertwoTwo == 1 && one.playertwoOne + one.playertwoTwo + one.playertwoHit <= 21)
    {System.out.println("and an ace."); one.playertwoTwo = 11;}
    
    else if(one.playertwoTwo >= 2 && one.playertwoTwo < 10)
    {System.out.println("and a " + one.playertwoTwo);}

    else if (one.playertwoTwo == 10)
    {System.out.println("and a face card.");}

    else {System.out.println("error");}
     taf = true;
     }
    }


public void hitter() {
  boolean fat = false;
     while (fat != true ){
    if(one.playertwoOne + one.playertwoTwo + one.playertwoHit > 21 && one.playertwoHit == 11)
    {one.playertwoTwo = 1; System.out.println("\nYou receive ace.\n");}
    
    else if(one.playertwoHit == 11 )
    {System.out.println("\nYou recieve an ace.\n");}
    
    else if(one.playertwoHit == 1 && one.playertwoOne + one.playertwoTwo + one.playertwoHit <= 21)
    {System.out.println("\nYou receive an ace.\n"); one.playertwoHit = 11;}
    
    else if(one.playertwoHit >= 2 && one.playertwoHit < 10)
    {System.out.println("\nYou recieve a " + one.playertwoHit +"\n");}

    else if (one.playertwoHit == 10)
    {System.out.println("\nYou receive a face card.\n");}

    else {System.out.println("**Error**\n");}
    
    fat = true;
    }
}

public void displayhandone(){
    //Deck one = new Deck();
    Orders noob = new Orders();
    
    if (one.playertwoHit + one.playertwoOne + one.playertwoTwo > 21)
    { noob.i=2; System.out.println("BUST!");  noob.i = 2;} //trying to end the game
    
    else if (one.playertwoOne + one.playertwoTwo + Orders.playeroneHit == 21)
    {System.out.println("21!\n");}

    
    }


public void bustin() {
            //Deck one = new Deck();
             Orders noob = new Orders();
           
                if ((one.playertwoOne + one.playertwoTwo + one.playertwoHit) == (one.playeroneOne + one.playeroneTwo + Orders.playeroneHit))
                    {System.out.println("\nTIE!!!");}   
                
                else if(((one.playeroneOne + one.playeroneTwo + Orders.playeroneHit) > (one.playertwoOne + one.playertwoTwo + one.playertwoHit)) 
                        || (one.playertwoOne + one.playertwoTwo + one.playertwoHit) > 21  && (one.playeroneOne + one.playeroneTwo + Orders.playeroneHit) <= 21)                    
                     {System.out.println("\nP1 WINS!!! With " + (one.playeroneOne + Orders.playeroneHit + one.playeroneTwo)+" points!");}    
                
                else if(((one.playeroneOne + one.playeroneTwo + Orders.playeroneHit) < (one.playertwoOne + one.playertwoTwo + one.playertwoHit))
                       || (one.playeroneOne + one.playeroneTwo + Orders.playeroneHit) > 21 && (one.playertwoOne + one.playertwoTwo + one.playertwoHit) <= 21)                    
                    {System.out.println("\nP2 WINS!!!");}  
                
                else {System.out.println("\n**Error**");}
                
                             
              }
}

    
    
    

