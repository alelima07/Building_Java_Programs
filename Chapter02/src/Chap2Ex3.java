/* Write a piece of code that uses a for loop to compute and print the first 
 * 12 Fibonacci numbers
 */

public class Chap2Ex3 {

	public static void main(String[] args) {
		int f0 = 1;
		int f1 = 1;

		System.out.print(f0 + " ");
		System.out.print(f1 + " ");

		for(int fNext = f1 + f0; fNext <= 144; fNext = f1 + f0) {
		    System.out.print(fNext + " ");
		    f0 = f1;
		    f1 = fNext;
		}

	}

}
