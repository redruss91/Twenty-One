
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylerussell
 */
public class cards {
    String ace = "1 or 11";
    int two = 2;
    int three = 3;
    int four = 4;
    int five= 5;
    int six = 6;
    int seven = 7;
    int eight = 8;
    int nine = 9;
    int ten = 10;
    int jack = 10;
    int queen = 10;
    int king = 10;
    
    String number;
    
    public static void main(String[] args){
       
        cards myGame = new cards();
        myGame.displayCardValue();
        
       
    }
    
    public void displayCardValue(){
        
        int count = 0;
        
        while (count < 1){
            
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the card to see the point value.\n"
                + "Please type out any numbers. Digits will cause an error.\n");
        this.number = input.next();
        
        
        
        System.out.println("\n");
        
        if ("ace".equals(this.number)){
            System.out.println("An Ace is equal to " + this.ace + " points\n");
            count++;
        } else if ("two".equals(this.number)) {
            System.out.println("A Two is equal to " + this.two + " points\n");
            count++;
        } else if ("three".equals(this.number)){
            System.out.println("A Three is equal to " + this.three + " points\n");
            count++;
        } else if ("four".equals(this.number)){
            System.out.println("A Four is equal to " + this.four + " points\n");
            count++;
        } else if ("five".equals(this.number)){
            System.out.println("A Five is equal to " + this.five + " points\n");
            count++;
        } else if ("six".equals(this.number)){
            System.out.println("A Six is equal to " + this.six + " points\n");
            count++;
        } else if ("seven".equals(this.number)){
            System.out.println("A Seven is equal to " + this.seven + " points\n");
            count++;
        } else if ("eight".equals(this.number)){
            System.out.println("A Eight is equal to " + this.eight + " points\n");
            count++;
        } else if ("nine".equals(this.number)){
            System.out.println("A Nine is equal to " + this.nine + " points\n");
            count++;
        } else if ("ten".equals(this.number)){
            System.out.println("A Ten is equal to " + this.ten + " points\n");
            count++;
        } else if ("jack".equals(this.number)){
            System.out.println("A Jack is equal to " + this.jack + " points\n");
            count++;
        } else if ("queen".equals(this.number)){
            System.out.println("A Queen is equal to " + this.queen + " points");
            count++;
        } else if ("king".equals(this.number)){
            System.out.println("A King is equal to " + this.king + " points\n");
            count++;
        } else System.out.println("Error: Invalid input. Please enter a card\n"
                + "that can be found in a standard deck of 52 cards, typed in\n"
                + "lowercase.\n");
    }
    }
    
}
