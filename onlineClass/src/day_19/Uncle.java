package day_19;

public class Uncle {

	Father Display() {
		System.out.println("Inside Uncle Class ");
		Father F = new Father ();
		return F;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son_of_Uncle su = new son_of_Uncle();
		su.Display();
		
	}
}

class son_of_Uncle extends Uncle{
	son Display() {
		System.out.println("Inside son_of_Uncle Class ");
		son s1 = new son ();
		return s1;
		
	}
	
}