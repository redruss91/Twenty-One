package cit260.main;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riley
 */
public class Main {
    
    //playerOne onehand = new playerOne();
    //onehand.hand(Deck[cardsdealt]);
    
    
    playerOne human = new playerOne();
    
   int cardsdealt = 0;
   
    
    static int Deck[] = {};
    int i;
    int j;
    int f;
    
   
   public void hits(){
   human.addCard(Deck[cardsdealt]);
   cardsdealt++;
   
   }

  
    public void filler(){
    for(i=1; i<5; i++){
        for(j=1; j<14; j++){
            for(f=0; f < 53; f++){
             Deck[f] = j ;j++;
                }}i++;
}}
}
