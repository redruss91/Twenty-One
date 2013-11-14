/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rtbro_000
 */
public class reporttwo {
    
    Deck one = new Deck();
    boolean fore;
   //Will also be used later to display cards. 
    
    /**
     *
     * @param name
     */
    public void findtwoOne() {
    boolean dat = false;
    Deck flint = new Deck();
    
    
       while (dat != true ){
           
    if(one.playertwoOne + one.playertwoTwo > 21 && one.playertwoOne == 11)
    {flint.playertwoOne = 1; System.out.println(Twentyone.name + ", you have in your hand an ace");}
        
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
    Deck fire = new Deck();
    boolean taf = false;
     while (taf != true ){
                
    if(one.playertwoOne + one.playertwoTwo > 21 && one.playertwoTwo == 11)
    {fire.playertwoTwo = 1; System.out.println("and an ace.");}
    
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
    Deck too = new Deck();
    Orders noob = new Orders();
    
    if (one.playertwoHit + one.playertwoOne + one.playertwoTwo > 21)
    { noob.i=2; System.out.println("BUST!");  noob.i = 2;} //trying to end the game
    
    else if (too.playertwoOne + too.playertwoTwo + noob.playeroneHit == 21)
    {System.out.println("21!\n");}

    
    }


public void bustin() {
            Deck comptodo = new Deck();
             Orders noob = new Orders();
           
                if ((comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit) == (one.playeroneOne + one.playeroneTwo + noob.playeroneHit))
                    {System.out.println("\nTIE!!!");}   
                
                else if(((one.playeroneOne + one.playeroneTwo + noob.playeroneHit) > (comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit)) 
                        || (comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit) > 21  && (one.playeroneOne + one.playeroneTwo + noob.playeroneHit) <= 21)                    
                     {System.out.println("\nP1 WINS!!! With " + (one.playeroneOne + noob.playeroneHit + one.playeroneTwo)+" points!");}    
                
                else if(((one.playeroneOne + one.playeroneTwo + noob.playeroneHit) < (comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit))
                       || (one.playeroneOne + one.playeroneTwo + noob.playeroneHit) > 21 && (comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit) <= 21)                    
                    {System.out.println("\nP2 WINS!!!");}  
                
                else {System.out.println("\n**Error**");}
                
                             
              }
}

    
    
    

