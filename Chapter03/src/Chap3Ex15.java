/*
   * Question 15 - Write a method called sphereVolume that accepts a radius as a
   * parameter and returns the volume of a sphere with that radius. For example,
   * the call sphereVolume(2.0) should return 33.510321638291124. The formula for
   * the volume of a sphere with radius r is the following: volume =
   * 4/3*PI*radius^3
 */
public class Chap3Ex15 {

	public static void main(double J) {
		System.out.println("Question 15");
	    System.out.println(sphereVolume(J));
	    System.out.println();
	    System.out.println();

	  }

	  public static double sphereVolume(double radius) {

	    double d = 4 * Math.PI * Math.pow(radius, 3) / 3;

	    return d;
	  }

	}


