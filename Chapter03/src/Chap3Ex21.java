import java.util.Scanner;
/*
   * Question 21 - Write a method called processName that accepts a Scanner for
   * the console as a parameter and prompts the user to enter a full name, then
   * prints the name in reverse order (i.e., last name, first name). Here is an
   * example dialogue with the user:
   * 
   * 
   * Please enter your full name: Sammy Jankis Your name in reverse order is
   * Jankis, Sammy
   */
public class Chap3Ex21 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter your full name: ");
		   String firstName = console.next();
		   String lastName = console.next();
		   System.out.print("Your name in reverse order is " + lastName + ", " + firstName);
		}

	}


