
public class WhileLoop {

	public static void main(String[] args) {
		
		int n = 91;
		int factor = 2;
		while (n % factor != 0) { //increment factor by 1 if there is a reminder of the divi
			factor++; // factor = factor + 1
		}
		System.out.println("First factor is " + factor);
		
		//output: First factor is 7
		// 7 is the number that divided by n 91 with no reminder 
	}

}
