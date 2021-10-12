package day_1;
/*
 * 10. Write a Java program to enter marks of five subjects and calculate total and
Percentage.
 */
public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=75,n2=79,n3=87,n4=88,n5=71,sum=0;
		double per2;
		
		sum = n1+n2+n3+n4+n5;
		per2 = (sum/500.0)*100;

		System.out.println(sum);
		System.out.println(per2);


	}

}
