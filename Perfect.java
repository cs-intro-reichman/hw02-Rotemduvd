
public class Perfect {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]);
		int d = N - 1;
		String s = N + " is a perfect number since " + N + " = " + 1;
		int sum = 1;

		while (1 < d){
			if ((N % d) == 0){
				s = s + " + " + (N / d);
				sum = sum + (N / d);
			}d = d - 1;
		}
		/* Same as Divisors comment */

		if (sum == N){
			System.out.println(s);
		} else {
			System.out.println(N + " is not a perfect number");
		}
		



	}
}
