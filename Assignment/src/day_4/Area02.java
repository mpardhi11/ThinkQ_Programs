package day_4;
/*
 * 11. Create a class to print the area of a square and a rectangle. 
 * The class has two methods with the same name but different number of parameters. 
 * The method for printing area of rectangle has two parameters 
 * which are length and breadth respectively 
 * while the other method for printing area of square has one parameter which is side of square.
 */
public class Area02 {

	Area02(float length, float width) {
		System.out.println("Area of Rectangle : "+(length*width));
	}
	
	Area02 (float length) {
		System.out.println("Area of Square : "+(length*length));
	}
	public static void main(String[] args) {
		
		Area02 rectabngle = new Area02(5.5f,10.5f);
		Area02 square = new Area02(5.5f);

	}

}
