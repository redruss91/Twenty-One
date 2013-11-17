
import java.io.Serializable;
import java.util.Scanner;



/**
 *
 * @author Riley
 */
public class foreach implements Serializable{
    //built by Riley Brown

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int total = 0;
        int myarray[] = new int[7];
        int sum = 0;
        
        
        myarray[0] = 0;
        myarray[1] = 0;
        myarray[2] = 0;
        myarray[3] = 0;
        myarray[4] = 0;
        myarray[5] = 0;
        myarray[6] = 0;
        
        for(int i = 0; i < myarray.length; i++){
        
        System.out.println("\nWhat value do you want for value #" + i + "?");
        int chicken = input.nextInt(); 
        myarray[i] = chicken ;
        
        }
        
        
        for(int x: myarray){
        int find = x+= total;
        System.out.println("\nValue is... " + find);
        sum += x;
        }  
    
     System.out.println("\nSum is = " + sum);
    System.out.println("\nAverage = " + sum/myarray.length);
    }
   
        
    }











