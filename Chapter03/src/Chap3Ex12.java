/*    Chapter 3    Exercise 10    scientific()
 * 
 * Write a method called scientific that accepts a real 
 * number base and an exponent as parameters and computes the 
 * base times 10 to the exponent, as seen in scientific notation. 
 * For example, the call of scientific(6.23, 5) would 
 * return 623000.0 and the call of scientific(1.9, -2) would return 0.019.
 */ 

public class Chap3Ex12 {

	public static void main(String[] args) {
		
		System.out.println("scientific(6.23, 5): " + scientific(6.23, 5));
        System.out.println("scientific(1.9, Ð2): " + scientific(1.9, -2));
    }
    
    public static double scientific(double number, int exponent){
        return Math.pow(10, exponent) * number;
    }
        
}
	


