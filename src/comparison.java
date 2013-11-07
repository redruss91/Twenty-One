
import java.util.Random;


/**
 *
 * @author Riley
 */
public class comparison {
    
    @SuppressWarnings("empty-statement")
    Random cards = new Random();
    int number;
    
    int playeroneOne = 10; //creating random number for every time they are called. 
    int playeroneTwo = 1;
    int playeroneHit;
    int playertwoOne = 9;
    int playertwoTwo = 9;  
    int playertwoHit = cards.nextInt(13) + 1;
    
    int punt = cards.nextInt(13) + 1;
    double val = (double)playeroneOne;
}
  



