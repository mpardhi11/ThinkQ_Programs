package day_20;

abstract class ABSTRACT {
	int x,y;
	ABSTRACT () {
		System.out.println("Constructor Called of ABSTRACT Class");
		//this.x=x;
		//this.y=y;
	}
	abstract void display_Method ();
	
	
}

class child extends ABSTRACT {
	child () {
		//System.out.println((super()); 
		
	} 
	
	
	public void display_Method () {
		System.out.println("Display Method of CHILD Class");		
	}
	
	public void setData () {
		System.out.println(super.x+" "+super.y);
	}
}
public class Q1 {
	public static void main(String[] args) {
		child obj = new child();
		obj.display_Method();
		obj.setData();

	}

}
