/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rtbro_000
 */
public class Playeronehand {
    String handhold = "";
    
    
   //Will also be used later to display cards. 
    
    /**
     *
     * @param name
     */
    public void find() {
    Twentyone start = new Twentyone();
    Deck one = new Deck();
    Orders orders = new Orders();
    boolean fore = false;
    
       while (fore != true ){
          
    if(one.playeroneOne + one.playeroneTwo > 21 && one.playeroneOne == 11)
    {one.playeroneOne = 1; handhold += Twentyone.name + ", you have in your hand an ace" + one.suit();}
        
    else if(one.playeroneOne == 11)
    {handhold += Twentyone.name + ", you have in your hand an ace" + one.suit();}
 
    else if(one.playeroneOne == 1  && one.playeroneOne + one.playeroneTwo + orders.playeroneHit <= 21)
    {handhold += Twentyone.name + ", you have in your hand an ace" + one.suit(); one.playeroneOne = 11;}
    
    else if(one.playeroneOne >= 2 && one.playeroneOne <= 10)
    {handhold += Twentyone.name + ", you have in your hand a " + one.playeroneOne +  " of " + one.suit();}

    else if(one.playeroneOne == 11)
    {handhold += Twentyone.name + ", you have in your hand a jack of " + one.suit();}
    
     else if(one.playeroneOne == 12)
    {handhold += Twentyone.name + ", you have in your hand a queen of " + one.suit();}
     
      else if(one.playeroneOne == 13)
    {handhold += Twentyone.name + ", you have in your hand a king of " + one.suit();}

    else {System.out.println("**Error**");}
    
        fore = true;
     }
    }



public void findtwo() {
    Deck one = new Deck();
    Orders orders = new Orders();
    boolean fore = false;
     while (fore != true ){
                
   if(one.playeroneOne + one.playeroneTwo > 21 && one.playeroneTwo == 11)
    {one.playeroneTwo = 1; System.out.println(handhold += " and an ace of " + one.suit2());}
    
    else if(one.playeroneTwo == 11 )
    {System.out.println(handhold += " and an ace of " + one.suit2());}
    
    else if(one.playeroneTwo == 1 && one.playeroneOne + one.playeroneTwo + orders.playeroneHit <= 21)
    {System.out.println(handhold += " and an ace of " + one.suit2()); one.playeroneTwo = 11;}
    
    else if(one.playeroneTwo >= 2 && one.playeroneTwo <= 10)
    {System.out.println(handhold += " and a " + one.playeroneTwo + " of " + one.suit2());}

    else if (one.playeroneTwo == 11)
    {System.out.println(handhold += " and a jack of  " + one.suit2());}
    
    else if (one.playeroneTwo == 12)
    {System.out.println(handhold += " and a queen of  " + one.suit2());}
    
    else if (one.playeroneTwo == 13)
    {System.out.println(handhold += " and a king of  " + one.suit2());}

    else {System.out.println("**Error**");}
     fore = true;
     }
    }


public void hitter() {
  
  
    
}




public void bustin() {
            Deck one = new Deck();
            Orders orders = new Orders();
           
            if ((one.playertwoOne + one.playertwoTwo + one.playertwoHit) == (one.playeroneOne + one.playeroneTwo + orders.playeroneHit))
                    {System.out.println("\nTIE!!!");}   
            else if ((one.playeroneOne + one.playeroneTwo + orders.playeroneHit) <= 21){
                
                if ((one.playeroneOne + one.playeroneTwo + orders.playeroneHit) == 21)
                {System.out.println("\nP1 WINS!!! With " + (one.playeroneOne + orders.playeroneHit + one.playeroneTwo)+" points!");}
                
                else if ((one.playeroneOne + one.playeroneTwo + orders.playeroneHit) > (one.playertwoOne + one.playertwoTwo + one.playertwoHit))
                {System.out.println("\nP1 WINS!!! With " + (one.playeroneOne + orders.playeroneHit + one.playeroneTwo)+" points!");}
                
                else if ((one.playertwoOne + one.playertwoTwo + one.playertwoHit) > 21 )
                {System.out.println("\nP1 WINS!!! With " + (one.playeroneOne + orders.playeroneHit + one.playeroneTwo)+" points!");}
                 }
            
            else if ((one.playertwoOne + one.playertwoTwo + one.playertwoHit) < 21){
                
                if ((one.playertwoOne + one.playertwoTwo + one.playertwoHit) == 21)
                {System.out.println("\nP2 WINS!!! With " + (one.playertwoOne + one.playertwoTwo + one.playertwoHit)+" points!");}
                
                else if ((one.playertwoOne + one.playertwoTwo + one.playertwoHit) > (one.playeroneOne + one.playeroneTwo + orders.playeroneHit))
                {System.out.println("\nP2 WINS!!! With " + (one.playertwoOne + one.playertwoTwo + one.playertwoHit)+" points!");}
                
                else if ((one.playeroneOne + one.playeroneTwo + orders.playeroneHit) > 21 )
                {System.out.println("\nP2 WINS!!! With " + (one.playertwoOne + one.playertwoTwo + one.playertwoHit)+" points!");}
                }
            
            else {System.out.println("\n**Error**");}
            
            
                             
              }
}

    
    
    

