/*
* Write a method named digitSum that accepts an integer as a parameter
* and returns the sum of the digits of that number. 
*/

public class Chap05Ex18 {

	public static void main(String[] args) {
		System.out.println(digitSum(29107));
		System.out.println(digitSum(-456));

	}
	public static int digitSum(int num) {
	    num = Math.abs(num);
	    int sum = 0;
	    
	    while (num != 0) {
	        sum += num % 10;
	        num /= 10;
	    }
	    
	    return sum;
	}

}
