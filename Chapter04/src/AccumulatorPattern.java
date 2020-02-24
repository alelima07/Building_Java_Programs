
public class AccumulatorPattern {

	public static void main(String[] args) {
		
		int product = 1;
		for (int i = 1; i <=20; i++ ) {
			
			product *= 2; //accumulator equivalent to product = product * 2
			System.out.println(i + " " + product);
		

		}
			System.out.println("2 ^ 20= " + product);
			
		
	}

}
