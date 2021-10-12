package day_15;

public class OverloadMain {

	public static void main(int x,int y) {
		System.out.println("method 1");
		System.out.println(x+y);
		
	}
	
	public static void main(float x, float y) {
		System.out.println("method 2");

		System.out.println(x+y);
	}
	
	public static void main(float x, int y) {
		System.out.println("method 3");
		System.out.println(x+y);
		
		
	}
	
	public static void main(String[] args) {
		
		OverloadMain.main(1.2f, 1.2f);
		OverloadMain.main(1, 5);
		OverloadMain.main(1.5f, 6);
		System.out.println("method 4");

	}

}
