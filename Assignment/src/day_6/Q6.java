package day_6;
/*
 * 6. Create interface Cake with a method declared as bake. 
 * Create 2 classes 
 * Strawberry, 
 * BlackForest 
 * both implementing Cake interface.
 */


interface Cake {
	void bake ();
}

class Strawberry implements Cake{
	public void bake () {
		System.out.println("Making Strawberry Cake");
	}
}

class BlackForest implements Cake {
	public void bake () {
		System.out.println("Making BlackForest Cake");
	}
}
public class Q6 {

	public static void main(String[] args) {
		Cake  c = new Strawberry();
		c.bake();
		
		c = new BlackForest ();
		c.bake();
	}

}

/*
O/P 
Making Strawberry Cake
Making BlackForest Cake

*/
