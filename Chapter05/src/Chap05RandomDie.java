import java.util.Random;

public class Chap05RandomDie {

	public static void main(String[] args) {
			
			Random rand = new Random();
			
			int tries = 0;
			
			int roll = 0;
			
			while (roll != 3) {
				// roll the dice once
				roll = rand.nextInt(6) + 1;
				System.out.println(roll);
				tries++;
			}
				System.out.println("You won after " + tries + " tries!");
				
			}

	}

