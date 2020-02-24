/* Write a method largestAbsVal that accepts three integers as parameters and 
 * returns the largest of their three absolute values.
*/
public class Chap3Ex7 {

	public static void main(String[] args){
	       
		int largest = largestAbsVal(7, -2, 11);
	       System.out.println(largest);
	       
	       largest = largestAbsVal(-4, 5, 2);
	       System.out.println(largest);
	    }
	public static int largestAbsVal(int a, int b, int c) {
	    return Math.max(Math.abs(a), Math.max(Math.abs(b), Math.abs(c)));
	}
}