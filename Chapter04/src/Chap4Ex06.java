/*
* Write a method called printRange that accepts two integers as arguments
* and prints the sequence of numbers between the two arguments, separated
* by spaces. Print an increasing sequence if the first argument is smaller
* than the second; otherwise, print a decreasing sequence. If the two numbers 
* are the same, that number should be printed by itself.
*/
public class Chap4Ex06 {

	public static void main(String[] args) {
		printRange(2, 7);
		printRange(19, 11);
		printRange(5, 5);

	}
	public static void printRange(int a, int b) {
	    if (a <= b) {
	        for (int i = a; i <= b; i++) {
	            System.out.print(i + " ");
	        }
	    } else {
	        for (int i = a; i >= b; i--) {
	            System.out.print(i + " ");
	        }
	    }
	    System.out.println();
	}
}
