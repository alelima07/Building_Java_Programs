/* 
* Write a method called vertical that accepts a String as its parameter 
* and prints each letter of the string on separate lines.
*/

public class Chap3Ex18 {

	public static void main(String[] args) {
		vertical("hey now");

	}
	public static void vertical(String string) {

	    for (int i = 0; i < string.length(); i++) {
	        System.out.println(string.charAt(i));
	    }
	}
}

