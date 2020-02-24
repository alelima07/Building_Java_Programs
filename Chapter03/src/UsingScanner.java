import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("How old are you? "); //prompt
		
		int age = console.nextInt();
		
		System.out.println("You typed " + age);
		
		console.close();
		
		

	}

}
