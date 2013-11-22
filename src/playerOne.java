
/**
 *
 * @author Riley
 */

//(Deck.[cardsdealt] = the card dealt
//cardsinhand[numcardsinhand] = card number put to P1 hand

public class playerOne {
    Main main = new Main();
    int totalValue = 0;
    static int cardsinhand[];
    int numcardsinhand = 0;
    boolean bust;
   

public int hand(int card){
   while(main.cardsdealt < 3 ){
cardsinhand[numcardsinhand] = card;
     numcardsinhand++;
   
   }
   return cardsinhand[cardsinhand.length];
}    
    
    
public void addCard(int Cards){
cardsinhand[numcardsinhand] = Cards;
numcardsinhand++;
}


}
