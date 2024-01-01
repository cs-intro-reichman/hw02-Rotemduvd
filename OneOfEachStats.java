import java.util.Random;

public class OneOfEachStats {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
        int count;
        int countT = 0;
        int counttwo = 0;
        int countthree = 0;
        int countfour = 0;

        // Set a fixed seed to make random numbers predictable
        Random generetor = new Random(seed);

        for (int rep = 0; T > rep; rep++) {
            count = 1;
            int boy = 0;
            int girl;
            girl = boy;
            

            while ( (girl<=0) || (boy<=0)) {
                double check = generetor.nextDouble();
                if (check > 0.5){
                   boy++;
                }else{
                    girl++;
                }
                
                
                
            }
            count = boy + girl;

            if (count == 2) {
                counttwo++;
            } else if (count == 3) {
                countthree++;
            } else {
                countfour++;
            }
            countT += count;
           
        } 
        double avg = ((double) countT) /((double) T);
        System.out.println("Average: " + avg + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + counttwo);
        System.out.println("Number of families with 3 children: " + countthree);
        System.out.println("Number of families with 4 or more children: " + countfour);

        int common = Math.max(Math.max(counttwo, countthree), countfour);
        String commonstr;

        if (common == counttwo) {
            commonstr = "2";
        } else if (common == countthree) {
            commonstr = "3";
        } else {
            commonstr = "4 or more";
        }
        System.out.println("The most common number of children is " + commonstr + ".");
    }
}