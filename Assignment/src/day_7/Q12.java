package day_7;

/*
 * 12. What is use of variable arguments show with example?
 */
public class Q12 {
public static int varar(int...arr) {
	int sum=0;
	for(int aa :  arr) {
		sum=sum+aa;
	}
	return sum;
	
}
	public static void main(String[] args) {
		System.out.println("VAR_AR Addition Calculator");
		
		System.out.println("Sending 5 Values");
		System.out.println("Sum : "+varar(10,20,30,40,50));
		
		System.out.println("Sending 4 Values");
		System.out.println("Sum : "+varar(10,20,30,40));
		
		System.out.println("Sending 3 Values");
		System.out.println("Sum : "+varar(10,20,30));
		}

}
