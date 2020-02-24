
public class Chap3Ex3 {

	public static void main(String[] args) {
		printPowersOfN(4,3);   
		printPowersOfN(5,6);
		printPowersOfN(-2, 8);
	}
	
	public static void printPowersOfN(int base, int exponent){
	    for(int i = 0; i < exponent + 1; i++){
	        double numberPowered = Math.pow(base, i);
	        System.out.print((int)numberPowered + " ");
	    }
	    System.out.println();
	}

}


