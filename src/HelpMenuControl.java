
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
             switch (this.decide) {
                 case "rules":
                     forhelp.rules();
                     count++;
                     break;
                 case "goal":
                     forhelp.goal();
                     count++;
                     break;
                 case "description":
                     forhelp.description();
                     count++;
                     break;
                 default:
                     forhelp.error();
                     break;
             }
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
