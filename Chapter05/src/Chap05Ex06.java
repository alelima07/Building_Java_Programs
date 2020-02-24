import java.util.Random;

/*
* Write a method named makeGuesses that will guess numbers between 1 
* and 50 inclusive until it makes a guess of at least 48. It should
* report each guess and at the end should report the total number 
* of guesses made.
*/
public class Chap05Ex06 {

	public static void main(String[] args) {
			
			int numOfGuesses = 1;
		    Random random = new Random();
		    int guess = random.nextInt(50) + 1;
		    System.out.println("guess = " + guess);
		    
		    while (guess < 48) {
		        guess = random.nextInt(50) + 1;
		        numOfGuesses++;
		        System.out.println("guess = " + guess);   
		    }
		    
		    System.out.println("total guesses = " + numOfGuesses);
		}

		}

	


