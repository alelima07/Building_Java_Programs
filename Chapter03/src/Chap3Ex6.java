/* Write a method called largerAbsVal that takes two integers as parameters 
 * and returns the larger of the two absolute values.
 */
public class Chap3Ex6 {

	public static void main(String[] args){
	       
		int larger = largerAbsVal(11, 2);
	       System.out.println(larger);
	       
	       larger = largerAbsVal(4, -5);
	       System.out.println(larger);
	    }
	    
	    public static int largerAbsVal(int n1, int n2){
	        n1 = Math.abs(n1);
	        n2 = Math.abs(n2);
	        return Math.max(n1, n2);
	    }
	}

