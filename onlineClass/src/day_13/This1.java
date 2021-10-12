package day_13;

public class This1 {
	int x1;
	
	public void THIS(int x1) {
		// Use of "This" for Variable;
		this.x1=x1;
		System.out.println("Use of This for Variable ");
		System.out.println(x1);
	}
	public static void main(String[] args) {
		This1 obj1=new This1();
		obj1.THIS(123);
	}

}
