/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author rtbro_000
 */
public class Twentyone {

   String name;
    String instructions = 
            "                  WELCOME TO 21\n"
            + "____________________________________________\n"
            + "Players have to try to get as close to 21\n"
            + "as possible without going over.\n"
            + "They can hit (recieve more cards) or stay (keep cards).";
    
    public static void main(String[] args) {
     Twentyone myGame = new Twentyone();
        myGame.getName();
        myGame.displayHelp();
        
     cardvalue onehand = new cardvalue();
        onehand.firsthand();
        onehand.displayhandone();
        
     cardvaluetwo twohand = new cardvaluetwo();
       twohand.secondhand();
       twohand.displayhandtwo();
        
     comparison compare = new comparison();
        compare.playercomp();
        
        
    }

public void getName() {
Scanner input = new Scanner(System.in);
System.out.println("Player 1, enter your name: ");
this.name = input.next();
}


public void displayHelp(){
System.out.println("\nWelcome " + this.name + " to 21\n");
System.out.println(this.instructions);

}





}