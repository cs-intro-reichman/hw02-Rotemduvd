/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		int d = x;
		while (0 < d){
		    if ((x % d) == 0){
			    System.out.println(x / d);
			}
			d = d - 1;
		}

		/* you should have used a for loop and not while,
		when we need to run a finite number of iterations like d, we use for 
  		for (int d = x;d > 0; d--)
  		*/
	}
}
