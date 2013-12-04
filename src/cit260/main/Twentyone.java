package cit260.main;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import cit260.twentyone.views.HelpMenuView;
import java.io.Serializable;
import java.util.Scanner;
/**
 *
 * @author rtbro_000
 */
public class Twentyone implements Serializable{
    private static Scanner inFile = new Scanner(System.in);
    String choice;
    static String name = "";
       String telltell = "=============================\n"
            + "\tMAIN MENU\n"
            + "=============================\n\n"
            + " Type:\n"
            + "   start - To begin the game.\n"
            + "   help - For the help menu.\n"
            + "   quit - To end the game.\n"
            + "=============================\n";
    static String instructions = 
          
            "\n**____________________________________________**\n"
            + "    Players have to try to get as close to 21\n"
            + "        as possible without going over.\n"
            + "They can hit (recieve more cards) or stay (keep cards).\n"
            + "**************************************************\n";
    
    public static Scanner getInputFile(){
        return Twentyone.inFile;}
    
    public static void main(String[] args) {
     Twentyone myGame = new Twentyone();
        myGame.getName();
        myGame.displayHelp();
     Twentyone.pauseProgram();
        myGame.intromenu();
     Twentyone.pauseProg();
     Orders begin = new Orders();
        begin.find();
        begin.findtwo(); 
        
     Twentyone.pauseProgram();
              
        begin.init();
       
   
    }
public void intromenu(){
    HelpMenuView exhelp = new HelpMenuView();
    for(int i =0; i < 1; ){   
    Scanner fir = Twentyone.getInputFile();
    System.out.println(telltell);
    this.choice = fir.next();

        if("start".equals(this.choice)){i = 1; 
                    }                
        else if("help".equals(this.choice)){
               exhelp.helptwo();
            }
        else if("quit".equals(this.choice)){
                System.out.println("\nThank you for playing.");
                System.exit(0);
                }
        else{ System.out.println("\n**Error: Please enter a valid option**\n\n");}
        }

}   
    


public void getName() {
    
Scanner fit = Twentyone.getInputFile();
System.out.println("*********************\n"
        + "Player 1, enter your name: \n");
Twentyone.name = fit.next();
}


public void displayHelp(){
System.out.println("\n\t      Welcome " + Twentyone.name + " to 21!!\n");
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
