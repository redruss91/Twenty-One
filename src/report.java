/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rtbro_000
 */
public class report {
   
    comparison one = new comparison();
    boolean fore;
   //Will also be used later to display cards. 
    
public void find() {
    
    comparison flint = new comparison();
    Twentyone imp = new Twentyone();
    
       for(fore = false; fore != true; ){
           
    if(one.playeroneOne + one.playeroneTwo > 21 && one.playeroneOne == 11)
    {flint.playeroneOne = 1; System.out.println(imp.name + ", you have in your hand an ace");}
        
    else if(one.playeroneOne == 11)
    //name won't show up...?
    {System.out.println(imp.name + ", you have in your hand an ace");}
 
    else if(one.playeroneOne == 1  && one.playeroneOne + one.playeroneTwo + one.playeroneHit <= 21)
    {System.out.println(imp.name + ", you have in your hand an ace"); one.playeroneOne = 11;}
    
    else if(one.playeroneOne >= 2 && one.playeroneOne < 10)
    {System.out.println(imp.name + ", you have in your hand a " + one.playeroneOne);}

    else if(one.playeroneOne == 10)
    {System.out.println(imp.name + ", you have in your hand a face card ");}

    else {System.out.println("error");}
    
        fore = true;
     }
    }



public void findtwo() {
    comparison fire = new comparison();
    
     for(fore = false; fore != true; ){
         
       
    if(one.playeroneOne + one.playeroneTwo > 21 && one.playeroneTwo == 11)
    {fire.playeroneTwo = 1; System.out.println("and an ace.");}
    
    else if(one.playeroneTwo == 11 )
    {System.out.println("and an ace.");}
    
    else if(one.playeroneTwo == 1 && one.playeroneOne + one.playeroneTwo + one.playeroneHit <= 21)
    {System.out.println("and an ace."); one.playeroneTwo = 11;}
    
    else if(one.playeroneTwo >= 2 && one.playeroneTwo < 10)
    {System.out.println("and a " + one.playeroneTwo);}

    else if (one.playeroneTwo == 10)
    {System.out.println("and a face card.");}

    else {System.out.println("error");}
     fore = true;
     }
    }


public void hitter() {
  
     for(fore = false; fore != true; ){
    if(one.playeroneOne + one.playeroneTwo + one.playeroneHit > 21 && one.playeroneHit == 11)
    {one.playeroneTwo = 1; System.out.println("\nYou receive ace.\n");}
    
    else if(one.playeroneHit == 11 )
    {System.out.println("\nYou recieve an ace.\n");}
    
    else if(one.playeroneHit == 1 && one.playeroneOne + one.playeroneTwo + one.playeroneHit <= 21)
    {System.out.println("\nYou receive an ace.\n"); one.playeroneHit = 11;}
    
    else if(one.playeroneHit >= 2 && one.playeroneHit < 10)
    {System.out.println("\nYou recieve a " + one.playeroneHit +"\n");}

    else if (one.playeroneHit == 10)
    {System.out.println("\nYou receive a face card.\n");}

    else {System.out.println("**Error**\n");}
    
    fore = true;
    }
}

public void displayhandone(){
    comparison too = new comparison();
    Orders noob = new Orders();
    
    if (one.playeroneHit + one.playeroneOne + one.playeroneTwo > 21)
    { noob.i=2; System.out.println("BUST!");} //trying to end the game
    
    else if (too.playeroneOne + too.playeroneTwo + too.playeroneHit == 21)
    {System.out.println("21!\n");}

    
    }


public void bustin() {
            comparison comptodo = new comparison();
            Orders otto = new Orders(); //trying to end the game
           
                if ((comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit) == (one.playeroneOne + one.playeroneTwo + one.playeroneHit))
                    {System.out.println("\nTIE!!!");}   
                
                else if(((one.playeroneOne + one.playeroneTwo + one.playeroneHit) > (comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit)) 
                        || (comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit) > 21)
                    
                     {System.out.println("\nP1 WINS!!! With " + (one.playeroneOne + one.playeroneHit + one.playeroneTwo)+" points!");}    
                
                else if(((one.playeroneOne + one.playeroneTwo + one.playeroneHit) < (comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit))
                       || (one.playeroneOne + one.playeroneTwo + one.playeroneHit) > 21)
                    
                    {System.out.println("\nP2 WINS!!!");}  
                
                else {System.out.println("\n**Error**");}
                
                             
              }
}

    
    
    

