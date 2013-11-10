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
    
    /**
     *
     * @param name
     */
    public void find() {
    Twentyone start = new Twentyone();
    comparison one = new comparison();
    boolean fore = false;
    
       while (fore != true ){
          
    if(one.playeroneOne + one.playeroneTwo > 21 && one.playeroneOne == 11)
    {one.playeroneOne = 1; System.out.println(Twentyone.name + ", you have in your hand an ace of " + one.suit);}
        
    else if(one.playeroneOne == 11)
    {System.out.println(Twentyone.name + ", you have in your hand an ace of " + one.suit);}
 
    else if(one.playeroneOne == 1  && one.playeroneOne + one.playeroneTwo + one.playeroneHit <= 21)
    {System.out.println(Twentyone.name + ", you have in your hand an ace of " + one.suit); one.playeroneOne = 11;}
    
    else if(one.playeroneOne >= 2 && one.playeroneOne <= 10)
    {System.out.println(Twentyone.name + ", you have in your hand a " + one.playeroneOne +  " of " + one.suit);}

    else if(one.playeroneOne == 11)
    {System.out.println(Twentyone.name + ", you have in your hand a jack of " + one.suit);}
    
     else if(one.playeroneOne == 12)
    {System.out.println(Twentyone.name + ", you have in your hand a queen of " + one.suit);}
     
      else if(one.playeroneOne == 13)
    {System.out.println(Twentyone.name + ", you have in your hand a king of " + one.suit);}

    else {System.out.println("**Error**");}
    
        fore = true;
     }
    }



public void findtwo() {
    comparison one = new comparison();
    boolean fore = false;
     while (fore != true ){
                
   if(one.playeroneOne + one.playeroneTwo > 21 && one.playeroneTwo == 11)
    {one.playeroneTwo = 1; System.out.println("and an ace of " + one.suitt + ".");}
    
    else if(one.playeroneTwo == 11 )
    {System.out.println("and an ace of " + one.suitt + ".");}
    
    else if(one.playeroneTwo == 1 && one.playeroneOne + one.playeroneTwo + one.playeroneHit <= 21)
    {System.out.println("and an ace of " + one.suitt + "."); one.playeroneTwo = 11;}
    
    else if(one.playeroneTwo >= 2 && one.playeroneTwo <= 10)
    {System.out.println("and a " + one.playeroneTwo + " of " + one.suitt + ".");}

    else if (one.playeroneTwo == 11)
    {System.out.println("and a jack of " + one.suitt + ".");}
    
    else if (one.playeroneTwo == 12)
    {System.out.println("and a queen of " + one.suitt + ".");}
    
    else if (one.playeroneTwo == 13)
    {System.out.println("and a king of " + one.suitt + ".");}

    else {System.out.println("**Error**");}
     fore = true;
     }
    }


public void hitter() {
  boolean fore = false;
  comparison one = new comparison();
     while (fore != true ){
         
    if(one.playeroneOne + one.playeroneTwo + one.playeroneHit > 21 && one.playeroneHit == 11)
    {one.playeroneHit = 1; System.out.println("\nYou receive an ace.\n");}
    
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




public void bustin() {
            comparison one = new comparison();
            
           
                if ((one.playertwoOne + one.playertwoTwo + one.playertwoHit) == (one.playeroneOne + one.playeroneTwo + one.playeroneHit))
                    {System.out.println("\nTIE!!!");}   
                
                else if((one.playeroneOne + one.playeroneTwo + one.playeroneHit) > (one.playertwoOne + one.playertwoTwo + one.playertwoHit)
                        && (one.playeroneOne + one.playeroneTwo + one.playeroneHit) <= 21
                        || (one.playertwoOne + one.playertwoTwo + one.playertwoHit) > 21  )                    
                     {System.out.println("\nP1 WINS!!! With " + (one.playeroneOne + one.playeroneHit + one.playeroneTwo)+" points!");}    
                
                else if((one.playeroneOne + one.playeroneTwo + one.playeroneHit) < (one.playertwoOne + one.playertwoTwo + one.playertwoHit)
                        && (one.playertwoOne + one.playertwoTwo + one.playertwoHit) <= 21
                       || (one.playeroneOne + one.playeroneTwo + one.playeroneHit) > 21)                    
                    {System.out.println("\nP2 WINS!!! With " + (one.playertwoOne + one.playertwoHit + one.playertwoTwo) + " points!");}  
                
                else {System.out.println("\n**Error**");}
                
                             
              }
}

    
    
    

