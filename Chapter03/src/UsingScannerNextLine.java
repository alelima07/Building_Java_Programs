import java.util.Scanner;

public class UsingScannerNextLine {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("What's your name? "); //prompt
		
		String name = console.next();
		name = name.toUpperCase();
		
		
		System.out.println(name + " has " + name.length() + 
				" letters and starts with " + name.substring (0, 1) + ".");
		
		console.close();
		

	}

}
