package day_6;
/* 8. Create interface IceCream with method eat 
 * and Juice with method drink, 
 * Create class Mastani 
 * which implements both interfaces.
 * 
 */

interface IceCream  {
	void eat ();
}

interface Juice {
	void drink();
}

class Mastani implements IceCream, Juice{
	public void eat () {
		System.out.println("Eating IceCream");
	}
	
	public void drink () {
		System.out.println("Drinking Juice");
	}
}
public class Q8 {

	public static void main(String[] args) {
		Mastani obj = new Mastani ();
		obj.drink();
		obj.eat();
		
	

	}

}

/*
 * OUTPUT
 * Drinking Juice
Eating IceCream

 */
