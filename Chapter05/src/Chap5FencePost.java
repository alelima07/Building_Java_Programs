/* Write a method printNumbers that prints each number from 1 to a given maximum
 * separated by commas. We print n numbers but need only n - 1 commas
 */
public class Chap5FencePost {
	
	
	public static void main (String[] args) {
		printNumbers(10);
		printNumbers(6);
	}

	public static void printNumbers(int max) {
		System.out.print(1);
		for (int i = 2; i <= max; i++) {
		System.out.print(", " + i); }
		System.out.println(); // to end the line 
		
	}
	}