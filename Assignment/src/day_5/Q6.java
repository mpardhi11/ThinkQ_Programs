package day_5;
/*
 * 7. Below code is showing compile time error. Can you suggest the corrections?

 */

	class X
	{
		public X(int i)
		{
		System.out.println(1);
		}
	}
	
	class Y extends X
	{
		public Y()
		{
			// Parent class Constructor 
			super(5);
		System.out.println(2);
		}
	}
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
