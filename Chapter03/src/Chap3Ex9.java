/* Write a method named lastDigit that returns the last digit of an integer. 
 * It should work for negative numbers as well.
 */
public class Chap3Ex9 {

	public static void main(String[] args) {
		int n = lastDigit (15);
		System.out.println(n);
	       
	}

	public static int lastDigit(int n) {
    return Math.abs(n % 10);
}
}