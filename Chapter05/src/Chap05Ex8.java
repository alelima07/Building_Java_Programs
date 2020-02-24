import java.util.Random;

public class Chap05Ex8 {

	public static void main(String[] args) {
		randomWalk();

	}
	public static void randomWalk() {
	    int position = 0;
	    int maxPost = -3;
	    System.out.println("position = " + position);
	    Random random = new Random();
	    
	    while (position != 3 && position != -3) {
	        int step = random.nextInt(2);
	        if (step == 0) {
	            step--;
	        }
	        position += step;
	        System.out.println("position = " + position);
	        if (position > maxPost) {
	            maxPost = position;
	        }
	    }
	    
	    System.out.println("max position = " + maxPost);
	}

}
