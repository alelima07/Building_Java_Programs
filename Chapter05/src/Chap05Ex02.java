/*
* Write a method named gcd that accepts two integers as parameters
* and returns the greatest common divisor of the two numbers. 
*/
public class Chap05Ex02 {

	public static void main(String[] args) {
		System.out.println("GCD of 27 and 6   is " + gcd(27, 6));    // 3
        System.out.println("GCD of 24 and 84 is " + gcd(24, 84));   // 12
        System.out.println("GCD of 38 and 7   is " + gcd(38, 7));    // 1
        System.out.println("GCD of 45 and 105 is " + gcd(45, 105)); // 15
        System.out.println("GCD of 1 and 25 is " + gcd(1, 25));    // 1
        System.out.println("GCD of 25 and 1   is " + gcd(25, 1));    // 1
        System.out.println("GCD of 0 and 14 is " + gcd(0, 14));    // 14
        System.out.println("GCD of 14 and 0   is " + gcd(14, 0));    // 14

}
	public static int gcd(int a, int b) {

	    while (b != 0) {
	        int c = a % b;
	        a = b;
	        b = c;
	    }
	    
	    return Math.abs(a);
	}
}
