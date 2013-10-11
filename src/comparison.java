
import java.util.Random;


/**
 *
 * @author Riley
 */
public class comparison {
    
    @SuppressWarnings("empty-statement")
    int maxvalue = 10;
    Random random = new Random();
    int pick = random.nextInt(maxvalue) + 1;
    
    int playeroneOne = random.nextInt(maxvalue) + 1; //creating random number for every time they are called. 
    int playeroneTwo = random.nextInt(maxvalue) + 1;
    int playertwoOne = random.nextInt(maxvalue) + 1;
    int playertwoTwo = random.nextInt(maxvalue) + 1;  
     
       
   
   
 
    

public void playercomp(){
             
     if (this.playertwoOne + this.playertwoTwo == this.playeroneOne + this.playeroneTwo)
       {System.out.println("TIE!!!");}
       
       else if(this.playeroneOne + this.playeroneTwo > this.playertwoOne + this.playertwoTwo)
       {System.out.println("P1 WINS!!!");}
       
       else if(this.playeroneOne + this.playeroneTwo < this.playertwoOne + this.playertwoTwo)
       {System.out.println("P2 WINS!!!");}
       
      else {System.out.println(this.playeroneOne + "**Error**");}
    
      
    
    }
 }
        

    




