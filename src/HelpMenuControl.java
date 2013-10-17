
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rtbro_000
 */
public class HelpMenuControl {
    HelpMenuView forhelp = new HelpMenuView();
    
    
      public void helptwo(){
        
        int count = 0;
        String other;
        Scanner input = new Scanner(System.in);
        while (count < 1){
         while (count < 1){
        System.out.println(forhelp.welcome);
        
        forhelp.menu = input.next();
        
        System.out.println("\n");
        
        if ("rules".equals(forhelp.menu)){
            System.out.println(forhelp.rules);
            count++;
        } else if ("goal".equals(forhelp.menu)){
            System.out.println(forhelp.goal);
            count++;
        } else if ("description".equals(forhelp.menu)){
            System.out.println(forhelp.description);
            count++;
        } else 
            System.out.println("");
         }
        
        System.out.println("");
        other = input.next();
        
        if ("menu".equals(other)){
            count = 0;
            System.out.println("\n");
        }
        }
        
    }
}
