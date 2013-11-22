


/**
 *
 * @author Riley
 */
public class Deck{
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

    

    public void callInnerMethod() {

       Playeronehand inner = new Playeronehand();
       
    }

    
  //
    //
    //
    //
    
    public class Playeronehand extends Deck{
   
  
    
    //P1 Hand -- Riley
    public String handhold = "";
    int playeroneOne = myarray[3][2]; 
    int playeroneTwo = myarray[0][1];
    int playeroneHit = 00;
    
    //P2 Hand --Riley
    int playertwoOne = 9;
    int playertwoTwo = 3;  
    int playertwoHit = 2;
    

    public void hitreturn(){
    Orders orders = new Orders();
    if (orders.fore = true){
    playeroneHit = myarray[6][3];}
    }

}  
     public String suit(){
        return "hearts";
    }
    
    public String suit2(){
        return "spades";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    }



  



