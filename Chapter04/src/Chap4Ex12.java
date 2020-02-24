/* Write a method called printTriangleType that accepts three integer 
 * arguments representing the lengths of the sides of a triangle and prints 
 * what type of triangle it is. The three types are equilateral, isosceles, 
 * and scalene.
 */
public class Chap4Ex12 {

	public static void main(String[] args) {
		printTriangleType(5, 7, 7);
		printTriangleType(6, 6, 6);
		printTriangleType(5, 7, 8);
		printTriangleType(2, 18, 2);
	}
	public static void printTriangleType(int a, int b, int c) {
	    if(a == b && b == c) {
	        System.out.println("equilateral");
	    } else if(a == b || a == c || b == c) {
	        System.out.println("isosceles");
	    } else {
	        System.out.println("scalene");
	    }
	}
}
