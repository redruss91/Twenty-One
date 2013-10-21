/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rtbro_000
 */
public class report {
   int fine = 0;
      double myDoubleNum = (double)fine;
    
   //Will also be used later to display cards. 
public void find() {
    comparison one = new comparison();
     Twentyone imp = new Twentyone();
        
if(one.playeroneOne == 11)
    {System.out.println(imp.name + ", you have in your hand an ace");}
 
    else if(one.playeroneOne == 1)
    {System.out.println(imp.name + ", you have in your hand an ace"); one.playeroneOne = 11;}
    
    
    else if(one.playeroneOne + one.playeroneTwo > 21 && one.playeroneOne == 1)
    {one.playeroneOne = 1 ; System.out.println(imp.name + ", you have in your hand an ace");}

    else if(one.playeroneOne >= 2 && one.playeroneOne < 10)
    {System.out.println(imp.name + ", you have in your hand a " + one.playeroneOne);}

    else if(one.playeroneOne == 10)
    {System.out.println(imp.name + ", you have in your hand a face card ");}

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


public void hitter() {
    comparison one = new comparison();
        one.playeroneHit = one.pick;
 
    if(one.playeroneHit == 11 )
    {System.out.println("you recieve an ace.\n");}
    
    else if(one.playeroneHit == 1)
    {System.out.println("you receive an ace.\n"); one.playeroneHit = 11;}
    
    else if(one.playeroneTwo + one.playeroneOne + one.playeroneHit > 21 && one.playeroneHit == 11)
    {one.playeroneTwo = 1; System.out.println("you receive ace.\n");}

    else if(one.playeroneHit >= 2 && one.playeroneHit < 10)
    {System.out.println("you recieve a " + one.playeroneHit +"\n");}

    else if (one.playeroneHit == 10)
    {System.out.println("you receive a face card.\n");}

    else {System.out.println("**Error**\n");}
    }



public void displayhandone(){
    comparison one = new comparison();
    
    if (one.playeroneOne + one.playeroneTwo + one.playeroneHit > 21)
    {System.out.println("BUST!");}
    
    else if (one.playeroneOne + one.playeroneTwo + one.playeroneHit == 21)
    {System.out.println("21!\n");}
 
     
    
    
    }





}

    
    
    

