package testPackage;


class parent {
	static { //Static Block
		int x=20;
		System.out.println(x+"Static of Parent");
	}
	int p1=1234;
	
	{
		int x=20;
		System.out.println(x+"Instance of Parent");
	}
	parent () {
		System.out.println("default Constructor of Parent");
	}
	
	void display (){
		System.out.println("Display meythod of Parent");
		
	}
	
	void calculate () {
		System.out.println(20+30+40);
	}
	
}

class child extends parent {
	

	static {
		int x=200;
		System.out.println(x+"Static of Child");
	}
	
	
	child () {
		super ();
		System.out.println("default Constructor of Child");

	}

	{
		int x=250;
		System.out.println(x+"Instance of child");
	}
	
	void display ()
	{
		super.display();
		System.out.println("Display meythod of Child "+super.p1+" ");
	}
	
	
	
	
}

public class StaticDemo {
		public static void main(String[] args) 
		{
	          child c,c1;
	          c1=new child();
	          c=new child();
	          c.calculate();
	          c.display();
	          c1.display();
	          

		}

	}
