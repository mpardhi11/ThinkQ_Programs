package day_02;

/*
 * W Program to Check Char is Alphabate or Digit
 */
public class Program_7 {

	public static void main(String[] args) {
		char z = '9';
		int aa=z;
		
		System.out.println(z);
		System.out.println(aa);
		if ((aa>=65 && aa<=90) || (aa>=97 && aa<=122))
			System.out.println("You entred Char ");
		else 
			System.out.println("You entred Number ");
		
		z = 'Z';
		aa=z;
		
		System.out.println(z);
		System.out.println(aa);
		if ((aa>=65 && aa<=90) || (aa>=97 && aa<=122))
			System.out.println("You entred Char ");
		else 
			System.out.println("You entred Number ");

	}

}
