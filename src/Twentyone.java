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
          
            "\n**____________________________________________**\n"
            + "Players have to try to get as close to 21\n"
            + "as possible without going over.\n"
            + "They can hit (recieve more cards) or stay (keep cards).\n"
            + "**************************************************\n";
    
    public static void main(String[] args) {
     Twentyone myGame = new Twentyone();
        myGame.getName();
        myGame.displayHelp();
        Twentyone.pauseProg();
     //Just so I knew that they would work.
     //HelpMenuControl help = new HelpMenuControl();
     //help.helptwo();     
     //HelpMenuView helpview = new HelpMenuView();
      
     report tell = new report();
        tell.find();
        tell.findtwo();
        
               
      //reporttwo telltwo = new reporttwo();
        //telltwo.findtwoOne();
        //telltwo.findtwoTwo();
        //telltwo.displayhandtwo();
        Twentyone.pauseProgram();
     Orders begin = new Orders();
        begin.init();
       
        //something different to give final output...
        //comparison compare = new comparison();
        //compare.playercomp();
        
    }

public void getName() {
Scanner input = new Scanner(System.in);
System.out.println("Player 1, enter your name: ");
this.name = input.next();
}


public void displayHelp(){
System.out.println("\n\t      Welcome " + this.name + " to 21!!\n");
System.out.println(this.instructions);

}

 public static void pauseProgram(){
System.out.println("\nPlease press Enter\n");
Scanner keyboard = new Scanner(System.in);
keyboard.nextLine();
}
 
 public static void pauseProg(){
System.out.println("\nPress enter to get your cards.\n");
Scanner keyboard = new Scanner(System.in);
keyboard.nextLine();
}




}
