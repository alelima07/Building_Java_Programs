/*
* Write a method called fractionSum that accepts an integer parameter n and returns 
* as a double the sum of the first n terms of the sequence
* 
* In other words, the method should generate the following sequence: 
* 1 + (1/2) + (1/3) + (1/4) + (1/5) + ...
*/
public class Chap4Ex01 {

	public static void main(String[] args) {
		
		System.out.println(fractionSum(5));
    }
    
		
	public static double fractionSum(int n) {
		    double sum = 0.0;
		    
		    for (double i = 1.0; i <= n; i++) {
		        sum += 1 / i;
		    }
		    
		    return sum;
		}

	}


