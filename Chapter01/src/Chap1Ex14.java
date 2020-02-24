/* Write a complete Java program that generates the 
 * following three figures of output. Use static methods to show structure and 
 * eliminate redundancy in your solution.
 *     *****
 *   *********
 * *************
 *
 *     *****
 *   *********
 * *************
 * * | | | | | *
 * *************
 *     *****
 *   *********
 * *************
 *
 *     *****
 *   *********
 * *************
 *     *****
 * * | | | | | *
 * * | | | | | *
 *     *****
 *     *****
 */
public class Chap1Ex14 {
	public static void main(String[] args) {
        printTwoTriangles();
        printBars();
        System.out.println();
        printTwoTriangles();
        printFiveStars();
        printBars();
        printBars();
        printFiveStars();
        printFiveStars();
    }
    
    public static void printTwoTriangles() {
        printTriangle();
        System.out.println();
        printTriangle();
    }
    
    public static void printTriangle() {
        System.out.println("    *****");
        System.out.println("  *********");
        System.out.println("*************");
    }
    
    public static void printBars() {
        System.out.println("* | | | | | *");
    }
    
    public static void printFiveStars() {
    	System.out.println("    *****   ");
    }
}
