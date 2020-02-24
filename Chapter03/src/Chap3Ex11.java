/*    Chapter 3    Exercise 9    distance()
 * 
 * Write a method called distance that accepts four integer 
 * coordinates x1, y1, x2, and y2 as parameters and computes 
 * the distance between points (x1, y1) and (x2, y2) on the 
 * Cartesian plane. The equation for the distance is
 */


public class Chap3Ex11 {

	public static void main(String[] args) {
		double dist = distance(10,2,3,15);
		System.out.print(dist);
    }
    
    public static double distance(int x1, int y1, int x2, int y2){
        double value = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        value = Math.sqrt(value);
        return value;
    }
}
	


