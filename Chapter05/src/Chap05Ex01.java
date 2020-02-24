/*
* Write a method named showTwos that shows the factors of 2 in a given integer.
*/
public class Chap05Ex01 {

	public static void main(String[] args) {
		
		System.out.println(showTwos(7));
		System.out.println(showTwos(18));
		System.out.println(showTwos(68));
		System.out.println(showTwos(120));

	}
	public static int showTwos(int num) {
	    System.out.print(num + " = ");
	    
	    while (num % 2 == 0) {
	          System.out.print("2 * ");
	          num /= 2;
	    }
	    return num;
		
	}

}
