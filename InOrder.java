/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		 int  i = (int)(10 * Math.random());
         System.out.println();
         int newnum;

         do{
          System.out.print(i + " ");
          newnum = (int)(10 * Math.random());
          if (newnum >= i){
             i = newnum;
          }

        }while(newnum >= i);
            
   }
		
       
}
	
