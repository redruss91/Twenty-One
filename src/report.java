/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rtbro_000
 */
public class report {
 
       
    
   //Will also be used later to display cards. 
public void find() {
    comparison one = new comparison();
        
        
if(one.playeroneOne == 11)
    {System.out.println("Player 1, you have in your hand an ace");}

 
    else if(one.playeroneOne == 1)
    {System.out.println("and an ace."); one.playeroneOne = 11;}
    
    
    else if(one.playeroneOne + one.playeroneTwo > 21 && one.playeroneOne == 1)
    {one.playeroneOne = 1 ; System.out.println("Player 1, you have in your hand an ace");}

    else if(one.playeroneOne >= 2 && one.playeroneOne < 10)
    {System.out.println("Player 1, you have in your hand a " + one.playeroneOne);}

    else if(one.playeroneOne == 10)
    {System.out.println("Player 1, you have in your hand a face card ");}

    else {System.out.println("error");}
}


public void findtwo() {
    comparison one = new comparison();
        
    if(one.playeroneTwo == 11 )
    {System.out.println("and an ace.");}
    
    else if(one.playeroneTwo == 1)
    {System.out.println("and an ace."); one.playeroneTwo = 11;}
    
    else if(one.playeroneTwo + one.playeroneOne > 21 && one.playeroneTwo == 11)
    {one.playeroneTwo = 1; System.out.println("and an ace.");}

    else if(one.playeroneTwo >= 2 && one.playeroneTwo < 10)
    {System.out.println("and a " + one.playeroneTwo);}

    else if (one.playeroneTwo == 10)
    {System.out.println("and a face card.");}

    else {System.out.println("error");}
    }


public void displayhandone(){
    comparison one = new comparison();
    
    if (one.playeroneOne + one.playeroneTwo > 21)
    {System.out.println("BUST!");}
    
    else if (one.playeroneOne == 1 || one.playeroneOne == 11  && one.playeroneTwo == 10)
    {System.out.println("21!\n");}
    
    else if (one.playeroneTwo == 1 || one.playeroneTwo == 11  && one.playeroneOne == 10)
    {System.out.println("21!\n");}
    
    else {
    System.out.println("\n You can choose to hit or stay. \n\n");}

    
    
    
    }





}

    
    
    

