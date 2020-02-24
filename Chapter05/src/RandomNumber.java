import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Random rand = new Random();
		
		double randomGPA = rand.nextDouble() * 2.5 + 1.5; //nextDouble is 0.0 or 0.1
		System.out.println(randomGPA);
		

	}

}
