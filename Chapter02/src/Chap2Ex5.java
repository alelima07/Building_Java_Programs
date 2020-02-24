/* Write nested for loops to produce the following output:
 *
 * *
 * **
 * ***
 * ****
 * *****
 */

public class Chap2Ex5 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
		    for(int j = 0; j < i; j++)
		        System.out.print("*");
		    	System.out.println();
		}		

	}

}
