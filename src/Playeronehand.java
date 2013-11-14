/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rtbro_000
 */
public class Playeronehand {
    Deck one = new Deck();
    String handhold = "";
    int playeroneOne = one.myarray[3][1]; 
    int playeroneTwo = one.myarray[8][3];
  
    
    int playertwoOne = 9;
    int playertwoTwo = 1;  
    int playertwoHit = 2;
    int i = 0;
    
   //Will also be used later to display cards. 
    
    /**
     *
     * @param name
     */
    public void find() {
    Twentyone start = new Twentyone();
    Deck lit = new Deck();
    Orders orders = new Orders();
    boolean fore = false;
    
       while (fore != true ){
          
    if(playeroneOne + playeroneTwo > 21 && playeroneOne == 11)
    {playeroneOne = 1; handhold += Twentyone.name + ", you have in your hand an ace" + lit.suit();}
        
    else if(playeroneOne == 11)
    {handhold += Twentyone.name + ", you have in your hand an ace" + lit.suit();}
 
    else if(playeroneOne == 1  && playeroneOne + playeroneTwo + Orders.playeroneHit <= 21)
    {handhold += Twentyone.name + ", you have in your hand an ace" + lit.suit(); playeroneOne = 11;}
    
    else if(playeroneOne >= 2 && playeroneOne <= 10)
    {handhold += Twentyone.name + ", you have in your hand a " + playeroneOne +  " of " + lit.suit();}

    else if(playeroneOne == 11)
    {handhold += Twentyone.name + ", you have in your hand a jack of " + lit.suit();}
    
     else if(playeroneOne == 12)
    {handhold += Twentyone.name + ", you have in your hand a queen of " + lit.suit();}
     
      else if(playeroneOne == 13)
    {handhold += Twentyone.name + ", you have in your hand a king of " + lit.suit();}

    else {System.out.println("**Error**");}
    
        fore = true;
     }
    }



public void findtwo() {
    Deck lif = new Deck();
    Orders orders = new Orders();
    boolean fore = false;
     while (fore != true ){
                
   if(playeroneOne + playeroneTwo > 21 && playeroneTwo == 11)
    {playeroneTwo = 1; System.out.println(handhold += " and an ace of " + lif.suit2());}
    
    else if(playeroneTwo == 11 )
    {System.out.println(handhold += " and an ace of " + lif.suit2());}
    
    else if(playeroneTwo == 1 && playeroneOne + playeroneTwo + Orders.playeroneHit <= 21)
    {System.out.println(handhold += " and an ace of " + lif.suit2()); playeroneTwo = 11;}
    
    else if(playeroneTwo >= 2 && playeroneTwo <= 10)
    {System.out.println(handhold += " and a " + playeroneTwo + " of " + lif.suit2());}

    else if (playeroneTwo == 11)
    {System.out.println(handhold += " and a jack of  " + lif.suit2());}
    
    else if (playeroneTwo == 12)
    {System.out.println(handhold += " and a queen of  " + lif.suit2());}
    
    else if (playeroneTwo == 13)
    {System.out.println(handhold += " and a king of  " + lif.suit2());}

    else {System.out.println("**Error**");}
     fore = true;
     }
    }


public void hitter() {
  
  
    
}





}

    
    
    

