/*
* Write a method named hasMidpoint that accepts three integers as parameters 
* and returns true if one of the integers is the midpoint between the other 
* two integers; that is, if one integer is exactly halfway between them. Your 
* method should return false if no such midpoint relationship exists. The 
* integers could be passed in any order; the midpoint could be the 1st, 2nd,
* or 3rd. You must check all cases. 
*/
public class Chap05Ex14 {

	public static void main(String[] args) {
		
		System.out.println(hasMidpoint(9,15,8));
		System.out.println(hasMidpoint(7,4,10));
	}
	public static boolean hasMidpoint(int a, int b, int c) {
	    if (a == b && b == c && a == c) {
	        return true;
	    } else {
	        int smallest = Math.min(a, Math.min(b, c));
	        int largest = Math.max(a, Math.max(b, c));
	        double midpoint = (smallest + largest) / 2.0;
	        
	        if (midpoint != smallest) {
	            if (midpoint == a || midpoint == b || midpoint == c) {
	                return true;
	            } else {
	                return false;
	            }
	        }
	        
	        return false;
	    }
	}

}
