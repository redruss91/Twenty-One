/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rtbro_000
 */
public class report {
    String first = "none";
    String second = "none";
    
   //Will also be used later to display cards. 
public void find() {
    comparison one = new comparison();
        
        
if(one.playeroneOne == 1 || one.playeroneOne == 11)
    {System.out.println("Player 1, you have in your hand an ace");}
else if(one.playeroneOne > 21)
    { }
else if(one.playeroneOne == 2)
    {System.out.println("Player 1, you have in your hand a 2");}
else if(one.playeroneOne == 3)
    {System.out.println("Player 1, you have in your hand a " + one.playeroneOne);}
else if(one.playeroneOne == 4)
    {System.out.println("Player 1, you have in your hand a " + one.playeroneOne);}
else if(one.playeroneOne == 5)
    {System.out.println("Player 1, you have in your hand a " + one.playeroneOne);}
else if(one.playeroneOne == 6)
    {System.out.println("Player 1, you have in your hand a " + one.playeroneOne);}
else if(one.playeroneOne == 7)
    {System.out.println("Player 1, you have in your hand a " + one.playeroneOne);}
else if(one.playeroneOne == 8)
    {System.out.println("Player 1, you have in your hand an " + one.playeroneOne);}
else if(one.playeroneOne == 9)
    {System.out.println("Player 1, you have in your hand a " + one.playeroneOne);}
else if(one.playeroneOne == 10)
    {System.out.println("Player 1, you have in your hand a face card ");}

}


public void findtwo() {
    comparison one = new comparison();
        
        
if(one.playeroneTwo == 1 || one.playeroneTwo == 11)
    {System.out.println("and an ace.");}
else if(one.playeroneTwo == 2)
    {System.out.println("and a 2.");}
else if(one.playeroneTwo == 3)
    {System.out.println("and a 3.");}
else if(one.playeroneTwo == 4)
    {System.out.println("and a 4.");}
else if(one.playeroneTwo == 5)
    {System.out.println("and a 5.");}
else if(one.playeroneTwo == 6)
    {System.out.println("and a 6.");}
else if(one.playeroneTwo == 7)
    {System.out.println("and a 7.");}
else if(one.playeroneTwo == 8)
    {System.out.println("and an 8.");}
else if(one.playeroneTwo == 9)
    {System.out.println("and a 9.");}
else if (one.playeroneTwo == 10)
    {System.out.println("and a face card.");}

}


public void displayhandone(){ 
System.out.println("You can choose to hit or stay. \n");
}



}

    
    
    

