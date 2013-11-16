
import java.io.Serializable;

/**
 *
 * @author Riley
 */
public class Deck implements Serializable{
    //contains deck
   
   
    static int myarray[][] = {
        {1, 1, 1, 1},
        {2, 2, 2, 2},
        {3, 3, 3, 3},
        {4, 4, 4, 4},
        {5, 5, 5, 5},
        {6, 6, 6, 6},
        {7, 7, 7, 7},
        {8, 8, 8, 8},
        {9, 9, 9, 9},
        {10, 10, 10, 10},
        {11, 11, 11, 11},
        {12, 12, 12, 12},
        {13, 13, 13, 13},
                         };

    public Deck() {
    }

    public static int[][] getMyarray() {
        return myarray;
    }

    public static void setMyarray(int[][] myarray) {
        Deck.myarray = myarray;
    }

    public void callInnerMethod() {

       Playeronehand inner = new Playeronehand();
       
    }

    
  //
    //
    //
    //
    
    public String suit(){
        return "hearts";
    }
    
    public class Playeronehand {
    Deck one = new Deck();
        
    public String handhold = "";
    int playeroneOne = Deck.myarray[3][1]; 
    int playeroneTwo = Deck.myarray[8][3];
    
    
    int playertwoOne = 9;
    int playertwoTwo = 3;  
    int playertwoHit = 2;
    


}  
    
    public String suit2(){
        return "spades";
    }
    
    }



  



