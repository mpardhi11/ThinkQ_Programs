package day_4;

public class Area {

	public void claculateArea (float x) {
		
		System.out.println("Area of Circle : "+(3.1415*x*x));
	}
	
	public void claculateArea (int x,int y) {
		System.out.println("Area of Rectangle : "+ (x*y));
		
	}
	
	public void claculateArea (int x) {
		System.out.println("Area of Square : "+(x*x));
	
}
	
	public static void main(String[] args) {
			
		Area a = new Area();
		
		a.claculateArea(1.0f);
		a.claculateArea(10);
		a.claculateArea(10, 20);
		
		
	}

}
