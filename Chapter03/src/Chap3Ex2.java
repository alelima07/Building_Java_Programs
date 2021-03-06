/* Write a method called printPowersOf2 that accepts a maximum number as an 
 * argument and prints each power of 2 from 20 (1) up to that maximum power, 
 * inclusive.You may assume that the value passed to printPowersOf2 is 0 or 
 * greater.
 */
public class Chap3Ex2 {

	public static void main(String[] args) {
		printPowersOf2(3);
		printPowersOf2(10);
	}
	public static void printPowersOf2(int n) {
		   for(int i = 0; i <= n; i++)
		      System.out.print(((int) Math.pow(2, i)) + " ");
		   	  System.out.println();
	}
	
}


