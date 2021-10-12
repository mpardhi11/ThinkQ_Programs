package day_5;
/*
 * 8. 
 * --WAP to create a class Kid with method readBook() 
 * --and another method readBook () with 2 parameters. 
 * --The method readBook here is over-loaded. 
 * --Create a class BigKid 
 * --which extends Kid 
 * created above and Implement readBook() 
 * differently in BigKid class. 
 * --Here the method readBook() has been over-ridden 
 * --in the child class BigKid().
 */

class Kid {
	
	public void readBook(String Book1) {
		System.out.println("Kid with Book_1 : "+Book1);
		
	}
	
	public void readBook(String Book1, String Book2) {
		System.out.println("Kid with 2-Books : "+Book1+" "+Book2);
		
	}
	
}

class BigKid extends Kid {
		public void readBook(String Book1) {
			System.out.println("Kid with Book_1 : "+Book1);
		}
		
}
public class Q8 {

	public static void main(String[] args) {
		BigKid BK = new BigKid();
		
		//Overridden
		BK.readBook("2States");
		//OverLoaded
		BK.readBook("Rich_dad_Poor_Dad", "Rudest Book Ever");

		Kid k1= new BigKid();
		Kid k2= new Teenager();
		//Parent (Kid k1) to reference BigKid readbook ()
		k1.readBook("You can Win");
		//Parent (Kid k1) to reference Teenager readbook ()
		k2.readBook("Harry Potter 1");
	}

}
