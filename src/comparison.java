/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Riley
 */
public class comparison {
    cardvalue player = new cardvalue();
    
    cardvaluetwo playertwo = new cardvaluetwo();
    
    @SuppressWarnings("empty-statement")
    
    public static void main(String[] args){
        
    public void compare(){
     if(player.firsthand() > playertwo.secondhand())
        {System.out.println("Player one wins");}
     else if(player.firsthand() == playertwo.secondhand())
        {System.out.println("Tie");}
     else {System.out.println("Player two wins");}
    }
}
}
