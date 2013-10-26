
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
    int ace1 = 11;
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
        myGame.demonstration();
        
       
    }
    
    public void displayCardValue(){
        
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
        
        boolean valid = false;
        OUTER:
        while (!valid) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the card to see the point value.\n"
                    + "Please type out any numbers. Digits will cause an error.\n");
            this.number = input.next();
            
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
        
        boolean valid = false;
        
        
        while (!valid){
    
        System.out.println("Welcome to the demonstration! As you know, in 21 you"
                + " are dealt two random cards. ");
        
        int i = 0;
        
        String[] card = new String[2];
        
        int handTotal = 0;
        
        for(i = 0; i < card.length; i++){
            System.out.println("\nEnter a card: \n");
            card[i] = input.next();
            
            if (!cards.contains(card[i])){
                System.out.println("Error: Invalid input. Please enter a card\n"
                        + "that can be found in a standard deck of 52 cards, typed in\n"
                        + "lowercase.\n");
                i--;
                continue;
            }
            switch (card[i]) {
                case "ace":
                    handTotal += this.ace1;
                    break;
                case "two":
                    handTotal += this.two;
                    break;
                case "three":
                    handTotal += this.three;
                    break;
                case "four":
                    handTotal += this.four;
                    break;
                case "five":
                    handTotal += this.five;
                    break;
                case "six":
                    handTotal += this.six;
                    break;
                case "seven":
                    handTotal += this.seven;
                    break;
                case "eight":
                    handTotal += this.eight;
                    break;
                case "nine":
                    handTotal += this.nine;
                    break;
                case "ten":
                    handTotal += this.ten;
                    break;
                case "jack":
                    handTotal += this.jack;
                    break;
                case "queen":
                    handTotal += this.queen;
                    break;
                case "king":
                    handTotal += this.king;
                    break;
            }
        }
        
        System.out.println("\nIn this case, the total amount of points you have in\n"
                + "your hand based off of what you input is " + handTotal + " points.\n"
                + " At this point you canchoose to \"stay\", or keep the cards\n"
                + "you have, or you can choose to \"hit\", or take an additional\n"
                + "card. Would you like to repeat this description? Type \"Y\" for yes,\n"
                + "or \"N\" for no.\n");
        
        String logic = input.next();
        
        if ("Y".equals(logic)){
            continue;
        }
        else if ("N".equals(logic)){
            break;
        }
        else System.out.println("Error: Please enter a valid response: \"Y\" for yes\n"
                + "or \"N\" for no\n");
        }
        
        
        
    }
    
}
