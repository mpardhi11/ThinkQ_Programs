package day_19;

abstract class Vehical {
	int x = 11;
	abstract void m1();
	
	int Display () {
		System.out.println("Control inside Display() Method of Vehical");	
		return x;
	}
	
	
}
public class Bike  extends Vehical{
		
		public void m1() {
			System.out.println("Control inside M1() Method");	
		}
		
		void Display (int x) {
			System.out.println("Control inside Display() Method of Bike");	
			System.out.println("Varibale inside Abstrac Class "+x);
		}
		
	
	public static void main(String[] args) {
		Bike b = new Bike ();
		b.m1();
		int x =b.Display();
		b.Display(x);
	}

}
