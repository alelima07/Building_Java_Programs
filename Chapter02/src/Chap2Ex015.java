
public class Chap2Ex015 {

	public static void main(String[] args) {
	           printDesign();
	        }

	 public static void printDesign() {
	        int b = 0;
	        for (int i = 1; i <= 9; i += 2) {
	             for (int k = 0 ; k < 5 - b; k++) {
	                  System.out.print("-");
	                }
	                    for (int j = 1; j <= i; j++) {
	                    System.out.print(i);
	               }
	                    for (int k = 0 ; k < 5 - b; k++) {
	                        System.out.print("-");
	                    }
	                    System.out.print(" ");
	                    System.out.print("");
	                    System.out.println("");
	                    b ++;
	         }
	      }
	   

	}


