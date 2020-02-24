/*
* Write a method named firstDigit that returns the first digit of an integer.
*/

public class Chap05Ex19 {

	public static void main(String[] args) {
		
		System.out.println(firstDigit(3572));
		System.out.println(firstDigit(2020));
	}
	public static int firstDigit(int num) {
	    num = Math.abs(num);
	    
	    while (num / 10 != 0) {
	        num /= 10;
	    }
	    
	    return num;
	}

}
