package day_16;
class car 
{
	float price;
	String name;
	String Test="TESTTTT";
	car (String name, float price) {
		this.name=name;
		this.price=price;
	}
	
	public String toString() {
		return price +" "+name+" "+Test+" Mohit Padhi";
		
	}
	
}


public class Vehical {
	int no;
	String company;
	car c;
	
	Vehical (String company, int no,car c) {
		this.company=company;
		this.no=no;
		this.c=c;
	}
	
	void display () {
		System.out.println(no+" "+company+" "+c.toString());
	}
	public static void main(String[] args) {
		car c=new car("Audi",123.456f);
		
		Vehical v= new Vehical ("Google",133, c);
		v.display();
		
	}

}
