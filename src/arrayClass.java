/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riley
 */
public class arrayClass{
    

    public static void main(String args[]){
    
    /**
     *
     * @param num
     */
    
      
    int num[] = {1, 5, 4, 6, 3, 5};
        int size = 6;
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable
        

     while ( flag )
     {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                   if ( num[ j ] < num[j+1] )   // change to > for ascending sort
                   {
                           temp = num[ j ];                //swap elements
                           num[ j ] = num[ j+1 ];
                           num[ j+1 ] = temp;
                          flag = true;              //shows a swap occurred 
                  }
            }
      }
     for(int i = 0; i < size; i++){
     System.out.println(" " + num[i]);}
} 
    
}

