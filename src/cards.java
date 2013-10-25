
import java.util.ArrayList;
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
        
        boolean valid = false;
        OUTER:
        while (!valid) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the card to see the point value.\n"
                    + "Please type out any numbers. Digits will cause an error.\n");
            this.number = input.next();
            
            
            ArrayList<String> cards = new ArrayList<>();
            cards.add("ace");
            cards.add("two");
            cards.add("three");
            cards.add("four");
            cards.add("five");
            cards.add("six");
            cards.add("seven");
            cards.add("eight");
            cards.add("nine");
            cards.add("ten");
            cards.add("jack");
            cards.add("queen");
            cards.add("king");
            
            if (!cards.contains(this.number)){
                System.out.println("Error: Invalid input. Please enter a card\n"
                        + "that can be found in a standard deck of 52 cards, typed in\n"
                        + "lowercase.\n");
                continue;
            }
            
            
            System.out.println("\n");
            
            switch (this.number) {
                case "ace":
                    System.out.println("An Ace is equal to " + this.ace + " points\n");
                    break OUTER;
                case "two":
                    System.out.println("A Two is equal to " + this.two + " points\n");
                    break OUTER;
                case "three":
                    System.out.println("A Three is equal to " + this.three + " points\n");
                    break OUTER;
                case "four":
                    System.out.println("A Four is equal to " + this.four + " points\n");
                    break OUTER;
                case "five":
                    System.out.println("A Five is equal to " + this.five + " points\n");
                    break OUTER;
                case "six":
                    System.out.println("A Six is equal to " + this.six + " points\n");
                    break OUTER;
                case "seven":
                    System.out.println("A Seven is equal to " + this.seven + " points\n");
                    break OUTER;
                case "eight":
                    System.out.println("A Eight is equal to " + this.eight + " points\n");
                    break OUTER;
                case "nine":
                    System.out.println("A Nine is equal to " + this.nine + " points\n");
                    break OUTER;
                case "ten":
                    System.out.println("A Ten is equal to " + this.ten + " points\n");
                    break OUTER;
                case "jack":
                    System.out.println("A Jack is equal to " + this.jack + " points\n");
                    break OUTER;
                case "queen":
                    System.out.println("A Queen is equal to " + this.queen + " points");
                    break OUTER;
                default:
                    System.out.println("A King is equal to " + this.king + " points\n");
                    break OUTER;
            }
        }
    }
    
    public void demonstration(){
        
        Scanner input = new Scanner(System.in);
        int count = 0;
        
        while (count < 1){
        
        System.out.println("Let's do a demonstration real quick. Let us assume\n"
                + "that you are dealt an 8 and a King. As shown before, these two"
                + "card values have values of " + this.eight + " points and "
                + this.king + " points respectively.");
        
        double handTotal = (int) this.eight+this.king;
        
        System.out.println("In this case, the total amount of points you have in\n"
                + "your hand is " + handTotal + " points. At this point you can\n"
                + "choose to \"stay\", or keep the cards you have, or you can choose\n"
                + "to \"hit\", or take an additional card. Would you like to repeat\n"
                + "this description? Type \"Y\" for yes, or \"N\" for no.\n");
        
        String logic = input.next();
        
        if ("Y".equals(logic)){
            count = 0;
        }
        else if ("N".equals(logic)){
            count = 1;
        }
        else System.out.println("Error: Please enter a valid response: \"Y\" for yes\n"
                + "or \"N\" for no\n");
        }
        
        
        
    }
    
}
