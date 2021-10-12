package day_19;

public class Father {

	Uncle Display() {
		System.out.println("Inside Father Class");
		Uncle U = new Uncle ();
		return U;
	}
	public static void main(String[] args) {
		son s = new son();
		s.Display();
		
		
	}
	
	}
	
class son  extends Father {
	
	son_of_Uncle  Display() {
		System.out.println("Inside Son Class");
		son_of_Uncle k1 = new son_of_Uncle ();
		return k1;
	}
	

}
