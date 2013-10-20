
import java.util.Scanner;


/**
 *
 * @author rtbro_000 & Kyle Russell
 */

//Riley created the class and called HelpMenuView.java into this class.
//Kyle Russell created the functions and the If and While Functions, as well
//as the user interaction.

public class HelpMenuControl {
    HelpMenuView forhelp = new HelpMenuView();
    String decide;
    
      public void helptwo(){
      
        int count = 0;
        String other;
        Scanner input = new Scanner(System.in);
        
        while (count < 1){
         while (count < 1){
            forhelp.welcome();
        
        this.decide = input.next();
        
        System.out.println("\n");
        
        if ("rules".equals(this.decide)){
            forhelp.rules();
            count++;
        } else if ("goal".equals(this.decide)){
            forhelp.goal();
            count++;
        } else if ("description".equals(this.decide)){
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
