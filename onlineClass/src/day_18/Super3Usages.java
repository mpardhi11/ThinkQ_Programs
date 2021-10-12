package day_18;

class parent {
	parent (int x,int y) {
		System.out.println("Parametrize Constructor Parent class");
		System.out.println(x+y);
		
	}

}

class child extends parent{
	child (int x,int y) {
		super(1,2);
		System.out.println("Parametrize Constructor child class");
		System.out.println(x+y);
		
	}
	
}
public class Super3Usages {

	public static void main(String[] args) {
		child c= new child(50,30);
	}

}
