package day_5;
/*
 * 6. Create a class named 'Rectangle' 
 * with two data members 'length' and 'breadth' 
 * and two methods to print 
 * the area 
 * and perimeter of the rectangle respectively. 
 * Its constructor having parameters 
 * for length and breadth is used to initialize length and breadth of the rectangle. 
 * Let class 'Square'
 * inherit the 'Rectangle' class with its 
 * constructor having a parameter for its side (suppose s) 
 * calling the constructor 
 * of its parent class 
 * as 'super(s,s)'. 
 * Print the area and perimeter of a rectangle 
 * and a square.
 */

class Rectangle {
	float breadth,length;
	Rectangle (float breadth,float length) {
		this.breadth=breadth;
		this.length=length;
	}
	
	Rectangle (float s) {
		this.breadth=s;
		this.length=s;
	}
	public float area() {
		
		return (length*breadth);
	}
	
	public float perimeter () {
		return 2*(length+breadth);
	}
}

class Square extends Rectangle {
	//float s;
	Square (float s) {
		super(s,s);
		//this.s=s;
	}
	
	Square (float s1, float s2) {
		super(s1,s2);	
	}
	
	
}
public class Q5 {

	public static void main(String[] args) {
		Square sq; 
		sq=new Square(5.0f,4.0f);
		System.out.println("Area of Rectangle : "+sq.area());
		System.out.println("Perimeter of Rectangle : "+sq.perimeter());
		
		System.out.println("=====================================");
		sq=new Square(5.0f);
		System.out.println("Area of Square : "+sq.area());
		System.out.println("Perimeter of Square : "+sq.perimeter());

	}

}
