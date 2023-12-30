
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		
		int gen = (int)(2 * Math.random());
		int ngen = gen;
		int count = 1;
		String s = "";
		if(gen == 0){
				s = "b";
		}else{
				s = "g";
		}

		while(gen == ngen){
			ngen = (int)(2 * Math.random());
			if(ngen == 0){
				s = s + " b";
				count = count + 1; 
			}else{
				s = s + " g";
				count = count + 1;
			}
		}
		System.out.println(s);
		System.out.println("You made it... and you now have " + count +" children" );
	}
}
