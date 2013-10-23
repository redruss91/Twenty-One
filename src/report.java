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
    int telltell = one.playeroneHit;
    int tellone = one.playeroneOne;
    int telltwo = one.playeroneTwo;
   //Will also be used later to display cards. 
    
public void find() {
    comparison flint = new comparison();
  
     Twentyone imp = new Twentyone();
       
    if(tellone + telltwo > 21 && tellone == 11)
    {flint.playeroneOne = 1; System.out.println(imp.name + ", you have in your hand an ace");}
        
    else if(tellone == 11)
    //name won't show up...?
    {System.out.println(imp.name + ", you have in your hand an ace");}
 
    else if(tellone == 1  && tellone + telltwo + telltell <= 21)
    {System.out.println(imp.name + ", you have in your hand an ace"); tellone = 11;}
    
    else if(tellone >= 2 && tellone < 10)
    {System.out.println(imp.name + ", you have in your hand a " + tellone);}

    else if(tellone == 10)
    {System.out.println(imp.name + ", you have in your hand a face card ");}

    else {System.out.println("error");}
}


public void findtwo() {
    comparison fire = new comparison();
        
    if(tellone + telltwo > 21 && telltwo == 11)
    {fire.playeroneTwo = 1; System.out.println("and an ace.");}
    
    else if(telltwo == 11 )
    {System.out.println("and an ace.");}
    
    else if(telltwo == 1 && tellone + telltwo + telltell <= 21)
    {System.out.println("and an ace."); telltwo = 11;}
    
    else if(telltwo >= 2 && telltwo < 10)
    {System.out.println("and a " + telltwo);}

    else if (telltwo == 10)
    {System.out.println("and a face card.");}

    else {System.out.println("error");}
    }


public void hitter() {
    comparison fin = new comparison();
        fin.playeroneHit = fin.pick;
    
    if(tellone + telltwo + telltell > 21 && telltell == 11)
    {fin.playeroneTwo = 1; System.out.println("\nYou receive ace.\n");}
    
    else if(telltell == 11 )
    {System.out.println("\nYou recieve an ace.\n");}
    
    else if(telltell == 1 && tellone + telltwo + telltell <= 21)
    {System.out.println("\nYou receive an ace.\n"); telltell = 11;}
    
    else if(this.telltell >= 2 && this.telltell < 10)
    {System.out.println("\nYou recieve a " + this.telltell +"\n");}

    else if (telltell == 10)
    {System.out.println("\nYou receive a face card.\n");}

    else {System.out.println("**Error**\n");}
    }



public void displayhandone(){
    comparison too = new comparison();
    Orders noob = new Orders();
    
    if (telltell + tellone + telltwo > 21)
    { noob.i=2; System.out.println("BUST!");}
    
    else if (too.playeroneOne + too.playeroneTwo + too.playeroneHit == 21)
    {System.out.println("21!\n");}

    
    }


public void bustin() {
            comparison comptodo = new comparison();
            Orders otto = new Orders();
            //put this into a different class
                if ((comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit) == (this.tellone + this.telltwo + this.telltell))
                    {System.out.println("\nTIE!!!");}   
                
                else if(((this.tellone + this.telltwo + this.telltell) > (comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit)) 
                        || (comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit) > 21)
                    
                     {System.out.println("\nP1 WINS!!! With " + (this.tellone + this.telltell + this.telltwo)+" points!");}    
                
                else if(((this.tellone + this.telltwo + this.telltell) < (comptodo.playertwoOne + comptodo.playertwoTwo + comptodo.playertwoHit))
                       && (this.tellone + this.telltwo + this.telltell) > 21)
                    
                    {System.out.println("\nP2 WINS!!!");}  
                
                else {System.out.println("\n**Error**"); otto.i=2;//game ends//}
                
                }}
}

    
    
    

