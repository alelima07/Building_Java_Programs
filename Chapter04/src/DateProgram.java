
public class DateProgram {

	public static void main(String[] args) {
		
		boolean boyOne = isDate(35, 60, 65000.00, 30); 
		boolean boyTwo = isDate(55, 60, 5000.00, 60);
		
	}
	
	public static boolean isDate(int age, int height, double salary, int location) {
		
		boolean rich = salary >= 100000.00;
		boolean goodAge = age >=21 && age < 50;
		boolean goodHeight = height >= 50 && height < 84;
		boolean goodLocation = location <=50;
		
		if(goodAge && goodHeight && goodLocation || rich) { //HERE ALL REQUIREMENTS MUST MATCH
	//if(goodAge && goodHeight || rich)  && goodLocation { NOW THE LOCATION IS A DEAL BREAKER
			System.out.println("Ok, let's go out!");
			
			return true;

		} else {
			System.out.println("It's not you, it's me.");
			
			return false;
		}
		
	}

}
