package day_13;

public class Chaining {

	int x;
	double d;
	String s;
	Chaining () {
		this(123,123.45);
		System.out.println("Chaining 01");
	}
	
	Chaining (int x, double d) {
		
		this(x,d,"Mohit");
		this.x=x;
		this.d=d;
		System.out.println("Chaining 02");
		System.out.println(x+" "+d);
	}
	
	Chaining (int x, double d, String s){
		
		this.x=x;
		this.d=d;
		this.s=s;
		System.out.println("Chaining 03");
		System.out.println(x+" "+d+" "+s);

	}
	public static void main(String[] args) {
		Chaining obj=new Chaining();
		

	}

}
