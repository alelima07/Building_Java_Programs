import java.util.Scanner;

public class assign5 {

	
	public static void main(String[] args) {
				
		//testing
		System.out.println("Testing Maria's score that should have an average of 82.8 ");
		int[] scores = {72,91,84,89,78};
		printGPA("Maria", scores);
		
		
		System.out.println();	
		
		System.out.println("Try it for yourself.");
		//enter your own information
		printGPA();
			
		}
	public static void printGPA() {
		Scanner console = new Scanner(System.in);
			    
		System.out.print("Enter a student record: ");
			    
		String name = console.next();
			int num = console.nextInt();
			 double sum = 0;
			    
			  for(int i = 0; i < num; i++)
			     sum += console.nextInt();
			    
			  System.out.println(name + "'s grade is " + sum / num);
			}
	
	
	public static void printGPA(String student, int[] scores) {
	       
		String name = student;
		int num = scores.length;
		double sum = 0;
		System.out.print(name + " has " + scores.length + " scores, which are " );    
			  for(int i = 0; i < num; i++) {
				  System.out.print(scores[i] + " " );
			      sum += scores[i];
			  }
			    
			  System.out.println("\n" + name + "'s grade is " + sum / num);
			  
			}
	}


