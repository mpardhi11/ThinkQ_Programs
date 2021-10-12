package day_18;
class Vehical1 {
	public void Display () {
		System.out.println("You are inside Vehical class");
	}
	
}

class Moped1 extends Vehical1{
	public void Display () {
		System.out.println("You are inside Moped class");
	}
	
}

class Bike1 extends Vehical1{
	public void Display () {
		System.out.println("You are inside Bike class");
	}
}
 
public class Overriding {

	public static void main(String[] args) {
		Vehical1 v = new Vehical1();
		v.Display();
		
		Vehical1 v1 = new Moped1 ();
		v1.Display();
		
		Vehical1 v2 = new Bike1 ();
		v2.Display();
	}

}
