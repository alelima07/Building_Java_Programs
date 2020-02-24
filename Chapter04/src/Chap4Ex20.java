/*
* Write a method named numUnique that takes three integers as parameters and 
* that returns the number of unique integers among the three. 
*/
public class Chap4Ex20 {

	public static void main(String[] args) {
		System.out.println(numUnique(18, 3, 4));
		System.out.println(numUnique(6, 7, 6));

	}
	public static int numUnique(int a, int b, int c) {
	    int count = 0;
	    
	    if (a != b) {
	        count++;
	    }
	    
	    if (b != c) {
	        count++;
	    }
	    
	    if (a != c) {
	        count++;
	    }
	    
	    if (a == b && b == c) {
	        count++;
	    }
	    
	    return count;
	}
}