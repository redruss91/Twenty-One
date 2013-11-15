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
    int playertwoTwo = 3;  
    int playertwoHit = 2;
    
    
  
    public void find() {
  
    boolean fore = false;
    
       while (fore != true ){
          
    if(playeroneOne + playeroneTwo > 21 && playeroneOne == 11)
    {playeroneOne = 1; handhold += Twentyone.name + ", you have in your hand an ace of " + one.suit();}
        
    else if(playeroneOne == 11)
    {handhold += Twentyone.name + ", you have in your hand an ace of " + one.suit();}
 
    else if(playeroneOne == 1  && playeroneOne + playeroneTwo + Orders.playeroneHit <= 21)
    {handhold += Twentyone.name + ", you have in your hand an ace of " + one.suit(); playeroneOne = 11;}
    
    else if(playeroneOne >= 2 && playeroneOne <= 10)
    {handhold += Twentyone.name + ", you have in your hand a " + playeroneOne +  " of " + one.suit();}

    else if(playeroneOne == 11)
    {handhold += Twentyone.name + ", you have in your hand a jack of " + one.suit(); playeroneOne = 10;}
    
     else if(playeroneOne == 12)
    {handhold += Twentyone.name + ", you have in your hand a queen of " + one.suit(); playeroneOne = 10;}
     
      else if(playeroneOne == 13)
    {handhold += Twentyone.name + ", you have in your hand a king of " + one.suit(); playeroneOne = 10;}

    else {System.out.println("**Error**");}
    
        fore = true;
     }
    }



public void findtwo() {
   
    boolean fore = false;
     while (fore != true ){
                
   if(playeroneOne + playeroneTwo > 21 && playeroneTwo == 11)
    {playeroneTwo = 1; System.out.println(handhold += " and an ace of " + one.suit2());}
    
    else if(playeroneTwo == 11 )
    {System.out.println(handhold += " and an ace of " + one.suit2());}
    
    else if(playeroneTwo == 1 && playeroneOne + playeroneTwo + Orders.playeroneHit <= 21)
    {System.out.println(handhold += " and an ace of " + one.suit2()); playeroneTwo = 11;}
    
    else if(playeroneTwo >= 2 && playeroneTwo <= 10)
    {System.out.println(handhold += " and a " + playeroneTwo + " of " + one.suit2());}

    else if (playeroneTwo == 11)
    {System.out.println(handhold += " and a jack of  " + one.suit2());  playeroneTwo = 10;}
    
    else if (playeroneTwo == 12)
    {System.out.println(handhold += " and a queen of  " + one.suit2());  playeroneTwo = 10;}
    
    else if (playeroneTwo == 13)
    {System.out.println(handhold += " and a king of  " + one.suit2());  playeroneTwo = 10;}

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
                   if (Orders.playeroneHit + playeroneOne + playeroneTwo > 21)
                       { System.out.println("\nBUST!");} //trying to end the game
               
                   else if (playeroneOne + playeroneTwo + Orders.playeroneHit == 21)
                       {System.out.println("21!\n");}
}
}




    
    
    

