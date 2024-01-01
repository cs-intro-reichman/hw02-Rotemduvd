
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		
		for (int i = 1;i <= n; i++) { //prints number of rows until n
			
			for (int j = 1;j < n; j++){ // prints the row until j=n
				if(i % 2 == 0){
					System.out.print(" *");
				}else {
					System.out.print("* ");
				} 
		 
			
			} System.out.println();


		}
	}
}