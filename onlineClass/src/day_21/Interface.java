package day_21;
interface x {
	void display ();
}

class y implements x {
	public void display () {
		System.out.println("Display is on");
	}
}
public class Interface {

	public static void main(String[] args) {
		x ab= new y();
		ab.display();

	}

}
