
public class Chap4Ex05 {

	public static void main(String[] args) {
		System.out.print(pow(3, 4));

	}
	public static int pow(int base, int exp) {
	    int result = 1;
	    while(exp > 0) {
	        result *= base;
	        exp--;
	    }
	    return result;
	}
}
