/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Riley
 */
public class comparison {
 
    @SuppressWarnings("empty-statement")
    
    int playertwoOne = (int) (Math.random()*11);
    int playertwoTwo = (int) (Math.random()*11);
    int playeroneOne =  (int) (Math.random()*11);
    int playeroneTwo =  (int) (Math.random()*11);
    double mynum = (double)playeroneTwo;
    
    public void playercomp(){

    
       if (this.playertwoOne + this.playertwoTwo == this.playeroneOne + this.playeroneTwo)
       {System.out.println("TIE!!!");}
       else if(this.playeroneOne + this.playeroneTwo > this.playertwoOne + this.playertwoTwo)
       {System.out.println("P1 WINS!!!");}
       else if(this.playeroneOne + this.playeroneTwo < this.playertwoOne + this.playertwoTwo)
       {System.out.println("P2 WINS!!!");}
       else {System.out.println(playeroneOne + "**Error**");}
    }
}

