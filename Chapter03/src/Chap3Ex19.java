/*
   * Question 19 - Write a method called printReverse that accepts a string as its
   * parameter and prints the characters in opposite order. For example, a call of
   * printReverse("hello there!") should print "!ereht olleh". If the empty string
   * is passed, the method should produce no output.
   */
public class Chap3Ex19 {

	public static void main(String[] args) {
		printReverse("ALESSANDRA");

	}
	public static void printReverse(String string) {

	    for (int i = string.length() - 1; i >= 0; i--) {
	        System.out.print(string.charAt(i));
	    }
	}
}
