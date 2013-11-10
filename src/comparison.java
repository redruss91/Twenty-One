
import java.util.Random;


/**
 *
 * @author Riley
 */
public class comparison {
    //contains deck
    @SuppressWarnings("empty-statement")
    Random cards = new Random();
    int number;
     int myarray[][] = {
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
    int playeroneOne = myarray[3][1]; //creating random number for every time they are called. 
    int playeroneTwo = myarray[8][3];
    int playeroneHit = myarray[2][0];
    int playertwoOne = 9;
    int playertwoTwo = 1;  
    int playertwoHit = 6;
    int i = 0;
    String suit = "";
    String suitt = "";
    
    
    public void suit(){
    for(i=0; i <= 12; i++){
        if(this.myarray[i][0] == this.playeroneOne){ this.suit = "spades";}
        else if(this.myarray[i][1] == this.playeroneOne){ this.suit = "hearts";}
        else if(this.myarray[i][2] == this.playeroneOne){ this.suit = "clubs";}
        else if(this.myarray[i][3] == this.playeroneOne){ this.suit = "diamonds";}
    }
    for(i=0; i <= 12; i++){
        if(this.myarray[i][0] == this.playeroneTwo){ this.suitt = "spades";}
        else if(this.myarray[i][1] == this.playeroneTwo){ this.suitt = "hearts";}
        else if(this.myarray[i][2] == this.playeroneTwo){ this.suitt = "clubs";}
        else if(this.myarray[i][3] == this.playeroneTwo){ this.suitt = "diamonds";}
        
        
        
        
        
        
    }
    }



}
  



