package day_13;

public class This3 {
	
	public void Caller () {
		this.Called();
	}
	
	public void Called() {
		
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		This3 x = new This3();
		x.Caller();
	}

}
