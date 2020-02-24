import java.util.Scanner;

public class Chap4Ex10 {


		public static void main(String[] args) {
			Scanner console = new Scanner(System.in);
			printGPA(console);
			
		}
		
		public static void printGPA(Scanner console){
		    System.out.print("Enter a student record: ");
		    String studentRecord = console.nextLine();
		    console.close();
		   
		    int spaceBetween = studentRecord.indexOf(" ");
		    
		    String studentName = studentRecord.substring(0, spaceBetween);
		    
		    int numOfScores = Character.getNumericValue(studentRecord.charAt(studentName.length() + 1));
		    
		    String num = "";
		    int sum = 0;
		    for(int i = studentName.length() + 3; i < studentRecord.length(); i++){
		       if(Character.isDigit(studentRecord.charAt(i))){
		           num = num + studentRecord.charAt(i);
		       } else {
		           if (num.length() == 1){
		               sum += Character.getNumericValue(num.charAt(0));
		           } else if (num.length() == 2){
		                sum += Character.getNumericValue(num.charAt(0)) * 10;
		                sum += Character.getNumericValue(num.charAt(1));
		           } else if (num.length() == 3){
		               sum += Character.getNumericValue(num.charAt(0)) * 100;
		               sum += Character.getNumericValue(num.charAt(1)) * 10;
		               sum += Character.getNumericValue(num.charAt(2));
		           }
		           num = "";
		       }
		    }
		    
		    if (num.length() == 1){
		        sum += Character.getNumericValue(num.charAt(0));
		    }else if(num.length() == 2){
		       sum += Character.getNumericValue(num.charAt(0)) * 10;
		       sum += Character.getNumericValue(num.charAt(1));
		    } else if (num.length() == 3){
		        sum += Character.getNumericValue(num.charAt(0)) * 100;
		        sum += Character.getNumericValue(num.charAt(1)) * 10;
		        sum += Character.getNumericValue(num.charAt(2));
		    }
		       
		    double studentGPA = (double)sum / numOfScores;
		    System.out.println(studentName + "\'s grade is " + studentGPA);
		}

	}