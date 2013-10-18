
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rtbro_000 & Kyle Russell
 */
public class HelpMenuControl {
    HelpMenuView forhelp = new HelpMenuView();
    
    
      public void helptwo(){
        
        int count = 0;
        String other;
        Scanner input = new Scanner(System.in);
        while (count < 1){
         while (count < 1){
        forhelp.welcome();
        
        forhelp.menu = input.next();
        
        System.out.println("\n");
        
        if ("rules".equals(forhelp.menu)){
            forhelp.rules();
            count++;
        } else if ("goal".equals(forhelp.menu)){
            forhelp.goal();
            count++;
        } else if ("description".equals(forhelp.menu)){
            forhelp.description();
            count++;
        } else 
            forhelp.error();
         }
        
        forhelp.goback();
        other = input.next();
        
        if ("menu".equals(other)){
            count = 0;
            System.out.println("\n");
        }
        }
        
    }
}
