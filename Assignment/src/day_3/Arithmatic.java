package day_3;
/*
 * 		7. Write java Program for arithmetic operation 
 * 		for each operation write separate Method 
 * 		using parameter passing and return type.
 */
public class Arithmatic {

	double x,y;
		public double add(double a, double b)
		{
			return a+b;
		}
		
		public double sub(double a, double b)
		{
			return a-b;
		}
		
		public double mul(double a, double b)
		{
			return a*b;
		}
		public double div(double a, double b)
		{
			return a/b;
		}
	
	public static void main(String[] args) {
		Arithmatic a1 =new Arithmatic();
		System.out.println(a1.add(15, 15.0));
		System.out.println(a1.sub(15, 15.0));
		System.out.println(a1.mul(15, 15.0));
		System.out.println(a1.div(15, 15.0));
		
	}

}
