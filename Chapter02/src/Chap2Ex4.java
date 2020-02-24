/* Write nested for loops to produce the following output:
	 *
	 * *****
	 * *****
	 * *****
	 * *****
	 */
public class Chap2Ex4 {

	public static void main(String[] args) {
	
	for(int i = 0; i < 4; i++) {
	    for(int j = 0; j < 5; j++)
	        System.out.print("*");
	    System.out.println();
	}
}
}
