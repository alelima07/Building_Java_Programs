/* Modify the SlashFigure program from the previous exercise to produce a new 
 * program SlashFigure2 that uses a global constant for the figure's height.
 */

public class Chap2Ex17 {

//public static final int SIZE = 6;
//public static void main(String[] args) {
// for(int i = 1; i <= SIZE; i++) {
//for(int j = 0; j < 2 * i - 2; j++)
// System.out.print("\\");
                
//for(int j = 0; j < -4 * i + 4 * SIZE + 2; j++)
 // System.out.print("!");
                
//  for(int j = 0; j < 2 * i - 2; j++)
//  System.out.print("/");
                
// System.out.println();

    	public static final int HEIGHT = 8;
        public static void main(String[] args) {
            for (int i = 1; i <= HEIGHT; i++) {
                for (int j = 1; j <= 2 * i - 2; j++) {
                    System.out.print("\\");
                }
                
                for (int j = 1; j <= 4 * HEIGHT - 4 * i + 2; j++) {
                    System.out.print("!");
                }
                
                for (int j = 1; j <= 2 * i - 2; j++) {
                    System.out.print("/");
                }
                
                System.out.println();
            }
        }
    }
