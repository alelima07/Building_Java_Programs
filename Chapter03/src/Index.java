
public class Index {

	public static void main(String[] args) {
		
		//index 	 012345678901
		String s1 = "Alessandra Lima";
		String s2 = "Linda Sousa";
		
		System.out.println(s1.indexOf("e")); //e
		
		System.out.println(s1.substring(7,10)); //dra
		
		String s3 = s2.substring(1,7);
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		//index 	   0123456789010123
		String book = "Building Java Programs";
		System.out.println(book.substring(9,13)); 
		
		String b = "alessandra";
		b = b.toUpperCase();
		System.out.println((b));
		

	}

}
