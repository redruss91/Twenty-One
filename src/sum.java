
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aziekayrussell
 */
public class sum {
    
    public static void main(String[] args){
    
         Scanner input = new Scanner(System.in);
         
          int nums[] = new int[10];
        
        System.out.println("Please enter 10 numbers below.");
        
        int i;
        
        int handTotal = 0;
        int total;
        
        for(i = 0; i < nums.length; i++){
            System.out.println("\nEnter a number: \n");
            nums[i] = input.nextInt();
        }
            double sum = 0;
            double average;
        for (int e : nums)
            sum += e;
       
        average = sum / 10;
        
        System.out.println("The sum of the numbers that you entered was: " + sum + ".\n"
                + "The average of the numbers that you entered was: " + average + ".\n");
        
    }
}
