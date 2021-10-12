package day_1;
/*
 * 7. Swap values of two integer variables using third variable.
(Note - also do same program without using third variable)
 */
public class Swap {

	public static void main(String[] args) {
		int n1=20,n2=30,temp;
		//Swap Using Third Variable
		System.out.println("Swap Using Third Variable ");
		System.out.println("Befoure Swap");
		System.out.println(n1+"\t"+n2);
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After Swap");
		System.out.println(n1+"\t"+n2);
		
		//Swap Without Using Third Variable
		System.out.println("Swap Without Using Third Variable ");
		System.out.println("Befoure Swap");
		System.out.println(n1+"\t"+n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After Swap");
		System.out.println(n1+"\t"+n2);

		
	}

}
