/*    Chapter 3    Exercise 8    quadratic()
 * 
 *    Write a method called quadratic that solves 
 *    quadratic equations and prints their roots. 
 */ 

	public class Chap3Ex8{
    public static void main (String[] args){
        quadractic(1, -7, 12);
        quadractic(1, 3, 2);
    }
    
    public static void quadractic(double a, double b, double c){
        double squareRoot = Math.sqrt(b * b - 4 * a * c);
        System.out.println((-b + squareRoot)/2 * a);
        System.out.println((-b - squareRoot)/2 * a);   
    }
}