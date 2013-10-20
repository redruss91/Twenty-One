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




public void displayhandtwo(){ 
    comparison one = new comparison();
    
    
    if (one.playertwoOne + one.playertwoTwo > 21)
    {System.out.println("BUST!");}
    
    else if (one.playertwoOne == 1 || one.playertwoOne == 11  && one.playertwoTwo == 10)
    {System.out.println("21!\n");}
    
    else if (one.playertwoTwo == 1 || one.playertwoTwo == 11  && one.playertwoOne == 10)
    {System.out.println("21!\n");}
    

}



}

    
    
    

