/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		String sOut = "";
		int i = (s.length() - 1);
		int m = (i / 2);

	
		while (i >= 0){
			char c = s.charAt(i);
			sOut = sOut + c;
			i = (i - 1);
		}
		// Again same as Divisors and Perfect
		System.out.println(sOut);
		System.out.println("The middle character is " + s.charAt(m));


	}
}
