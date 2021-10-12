package day_13;

public class This2 {
	int id;
	String name;
	double salary;
	
	This2(){
		this(123,"Name",123.456);
	
	}
	
	This2(int id, String name,double money){
		this.id=id;
		this.name=name;
		this.salary=salary;
		System.out.println("Use of This in Constructor");
	}
	public static void main(String[] args) {
		This2 obj1=new This2();		
	}

}
