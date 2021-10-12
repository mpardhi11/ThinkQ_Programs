package basics;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float basic= 15000f,pf=0f,hra=0f,gross=0f;
		
		pf = (basic/100)*10f;
		hra = (basic/100)*20f;
		gross = (basic+ hra);
		
		System.out.println(basic);
		System.out.println(pf);
		System.out.println(hra);
		System.out.println(gross);

	}

}
