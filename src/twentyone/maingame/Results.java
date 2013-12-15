package twentyone.maingame;

/**
 * @author K Russell
 */
public class Results {
     
    public void displayResults() {
 
        System.out.println("\n" + "Player One" + "'s Results\n\n21!: " + this.is21() + " Lost: " 
                + this.isLoser() +"\n");
   
    }
    
            public int isLoser() {   

        for (int i=0; i < 1000; i++) {
                if (TwentyOne.myHand.checkValue() > 21) { 
                    return 1;
                }
                else
                    
        return 0;
        }
        return 1;
            }
            
            
            public int is21() {   
        
        for (int i=0; i < 1000; i++) {
                if (TwentyOne.myHand.checkValue() == 21) { 
                    return 1;
                }
                else
                    
        return 0;
        }
        return 1;
            }
           

}
        


