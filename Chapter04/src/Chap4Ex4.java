
public class Chap4Ex4 {
	public static void main(String[] args) {
		System.out.print(daysInMonth(5));

	}
	public static int daysInMonth(int m) {
	    switch(m) {
	        case 1:
	        case 3:
	        case 5:
	        case 7:
	        case 8:
	        case 10:
	        case 12:
	            return 31;
	        case 4:
	        case 6:
	        case 9:
	        case 11:
	            return 30;
	        default:
	            return 28;
	    }
	}
}
