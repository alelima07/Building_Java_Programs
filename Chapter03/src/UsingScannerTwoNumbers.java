import java.util.Scanner;

public class UsingScannerTwoNumbers {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Please type two numbers: "); //prompt
		
		int num1 = console.nextInt();
		int num2 = console.nextInt();
		
		int product = num1 * num2;
		
		System.out.println("The product is " + product);
		
		console.close();
		
		

	}

}
