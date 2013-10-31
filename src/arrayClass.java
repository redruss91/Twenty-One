/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riley
 */
public class arrayClass{
    //built by Riley Brown

    public static void main(String args[]){
    
    
    int num[] = {1, 5, 4, 6, 3, 5};
        int size = 6;
        int place;
        boolean swap = true; 
        int temp;   
        

     while ( swap )
     {
        swap= false;   
            for( place=0;  place < num.length -1;  place++ )
            {
                   if ( num[ place ] < num[place+1] ){
                    temp = num[ place ];            
                    num[ place ] = num[ place+1 ];
                    num[ place+1 ] = temp;
                    swap = true;    
                  }
            }
      }
     System.out.println("\nYour sorted array:\n");
     for(int i = 0; i < size; i++){
     System.out.println(" " + num[i]);}
} 
    
}

