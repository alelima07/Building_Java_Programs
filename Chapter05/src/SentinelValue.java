import java.util.Scanner;

public class SentinelValue {

	public static void main(String[] args) {
		 Scanner console = new Scanner(System.in); 
		 
		 int sum = 0;
		// pull one prompt/read ("post") out of the loop
		
		 System.out.print("Enter a number (-1 to quit): "); 
		 
		 int number = console.nextInt();
		
		 while (number != -1) { // it could also be 0 as long as it doesnt change the total amount
		sum = sum + number; // moved to top of loop 
		System.out.print("Enter a number (-1 to quit): "); 
		number = console.nextInt();
		}
		 
		System.out.println("The total is " + sum);
		console.close();
	}
}