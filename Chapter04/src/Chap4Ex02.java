/*
* Write a method named repl that accepts a String and a number of repetitions 
* as parameters and returns the String concatenated that many times. For example, 
* the call repl("hello", 3) returns "hellohellohello". If the number of repetitions 
* is 0 or less, an empty string is returned. 
*/

public class Chap4Ex02 {



	public static void main (String[] args){
		System.out.println(repl("hello", 4)); //this method prints Hello 4 times
		//System.out.println(repl("hello", 0)) Here it's an empty string 0
		//System.out.println(repl("hello", 4) + " should match \nhellohellohellohello");
				        
		// true conditions
			if(repl("hello",4).equals("hellohellohellohello")) {
			System.out.println("True");
			} else {
				System.out.println("One of these things is not like the other");
				        }
			//false conditions
			if(repl("hello",4).equals("hellohellohello")) {
				 System.out.println("True");
			} else {
				 System.out.println("One of these things is not like the other");
				        }
				    }
				    
			public static String repl(String s, int n){
				  String value = "";
				  for (int i = 1; i <= n; i++){
				      value = value + s;
				        }
				        return value;
				    }
				
				   
			}




	


