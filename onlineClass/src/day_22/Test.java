package day_22;

interface Movable {

	void show();

	static void put() {
		System.out.println("Pune");
	}

	default void dodefault() {
		System.out.println("Default");
	}

}

public class Test implements Movable {

	public void show() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.show();
		t.dodefault();
		Movable.put();

	}

}
