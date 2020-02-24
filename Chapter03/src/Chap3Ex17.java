/*
* Write a method padString that accepts two parameters: a String and an integer representing a length. 
* The method should pad the parameter string with spaces until its length is the given length.
* If the string's length is already at least as long as the length parameter, your method 
* should return the original string.
*/

public class Chap3Ex17 {

	public static void main(String[] args) {
		
		System.out.println(padString("hello", 8));
		System.out.println(padString("congratulations", 10));
		
	}


	public static String padString(String string, int length) {
	    int wordLength = string.length();
	    
	    for (int space = 1; space <= length - wordLength; space++) {
	        string = " " + string;
	    }
	    
	    return string;
	}
}
