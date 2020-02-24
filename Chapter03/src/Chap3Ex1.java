/* Write a method called printNumbers that accepts a maximum number as a 
 * parameter and prints each number from 1 up to that maximum, inclusive, 
 * boxed by square brackets. You may assume that the value passed to 
 * printNumbers is 1 or greater.
 */

public class Chap3Ex1 {

	public static void main(String[] args) {
		printNumbers(15);
		printNumbers(5);
		
		
	}
		public static void printNumbers(int n) {
		    for(int i = 1; i <= n; i++)
		        System.out.print("[" + i + "] ");
		    	System.out.println(); //to give a blank space between them
		}

	}


