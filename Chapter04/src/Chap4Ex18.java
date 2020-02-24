/*Write a method called wordCount that accepts a String as its parameter and returns the number of words in the String. A word is 
a sequence of one or more nonspace characters (any character other than ' '). For example, the call wordCount("hello") should 
return 1, the call wordCount("how are you?") should return 3, the call wordCount(" this     string has     wide       spaces ") 
should return 5, and the call wordCount(" ") should return 0.*/
public class Chap4Ex18 {

	public static void main(String[] args) {
		
		System.out.println(wordCount("Hello World!"));
	}
	public static int wordCount(String str) {
	    String[] arr = str.split("\\s+");
	    int count = 0;
	    
	    for(String s : arr) {
	        if(s.length() > 0)
	            count++;
	    }
	    
	    return count;
	}
}
