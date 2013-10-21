/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rtbro_000
 */
public class reporttwo {
        
   //Will also be used later to display cards. 
public void findtwoOne() {
    comparison one = new comparison();
        
if(one.playertwoOne == 11 || one.playertwoOne == 1)
    {System.out.println("Player 2, you have in your hand an ace");}
else if(one.playeroneOne + one.playeroneTwo > 21 && one.playertwoOne == 1)
    {one.playertwoOne = 1; System.out.println("Player 2, you have in your hand an ace");}
else if(one.playertwoOne >= 2 || one.playertwoOne < 10)
    {System.out.println("Player 2, you have in your hand a " + one.playertwoOne);}
else if(one.playertwoOne == 10)
    {System.out.println("Player 2, you have in your hand a face card ");}
else {System.out.println("error");}
}


public void findtwoTwo() {
    comparison one = new comparison();
        
        
if(one.playertwoTwo == 11 || one.playertwoTwo == 1)
    {System.out.println("and an ace.");}

else if(one.playertwoTwo + one.playertwoOne > 21 && one.playertwoTwo == 11)
    {one.playertwoTwo = 1; System.out.println("and an ace.");}

else if(one.playertwoTwo >= 2 || one.playertwoTwo < 10)
    {System.out.println("and a " + one.playertwoTwo);}

else if (one.playertwoTwo == 10)
    {System.out.println("and a face card.");}

else {System.out.println("error");}
}

public void hittertwo() {
    comparison one = new comparison();
        one.playertwoHit = one.pick;
 
    if(one.playertwoHit == 11 )
    {System.out.println("you recieve an ace.");}
    
    else if(one.playertwoHit == 1)
    {System.out.println("you receive an ace."); one.playertwoHit = 11;}
    
    else if(one.playeroneTwo + one.playeroneOne + one.playertwoHit > 21 && one.playertwoHit == 11)
    {one.playeroneTwo = 1; System.out.println("you receive ace.");}

    else if(one.playertwoHit >= 2 && one.playertwoHit < 10)
    {System.out.println("you receive a " + one.playertwoHit);}

    else if (one.playertwoHit == 10)
    {System.out.println("you receive a face card.");}

    else {System.out.println("error");}
    }


public void displayhandtwo(){ 
    comparison one = new comparison();
    
    
    if (one.playertwoOne + one.playertwoTwo + one.playertwoHit > 21)
    {System.out.println("BUST!");}
    
    else if (one.playertwoOne + one.playertwoOne + one.playertwoHit == 21)
    {System.out.println("21!\n");}
    

}



}

    
    
    

