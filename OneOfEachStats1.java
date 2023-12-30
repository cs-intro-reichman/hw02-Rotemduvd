/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		
		int T = Integer.parseInt(args[0]);
		int count;
		int gen;
		int ngen;
		int countT = 0;
		int counttwo = 0;
		int countthree = 0;
		int countfour = 0;
		 
		for(int rep = T; rep > 0; rep--){ //giving the times I want to do check the families
			count = 1;
			gen = (int)(2 * Math.random());
			ngen = gen;

		

			while(gen == ngen){ //loop saying keep giving random numbers between 0-1 until they arent equal. and sum the times run.
				ngen = (int)(2 * Math.random());
				if(ngen == 0){
					count = count + 1; 
				}else{
					count = count + 1;

				}
				
			
			}//end of while loop 
			if (count == 2){
				counttwo = counttwo + 1;
			}
			else if (count == 3){
				countthree = countthree + 1;
			}
			else{
				countfour = countfour + 1;
			}
			countT = countT + count;
			
		}//for closed
		double avg = ((double)(countT)/(double)(T));
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("number of families with 2 children: " + counttwo);
		System.out.println("number of families with 3 children:  " + countthree);
		System.out.println("number of families with 4 or more children:  " + countfour);

		int common = Math.max(Math.max(counttwo,countthree),countfour);
		String commonstr;

		if (common == counttwo) {
            commonstr = "2";
        } else if (common == countthree) {
            commonstr = "3";
        } else {
            commonstr = "4 or more";
        }
        System.out.println("The most common number of children is " + commonstr);
	

	}
}


