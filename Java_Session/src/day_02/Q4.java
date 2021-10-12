package day_02;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner (System.in);
		int x=sc.nextInt();
		boolean v=true;
		
		if (x>0) {
			System.out.println("Enter a Number to SEARCH: ");
			int y=sc.nextInt();
			while (x>0) {
				int Z=x%10;
				if (Z==y) {
					v=true;
					break;
				}
				
				else {
					v=false;
				}
				x/=10;
			}
			System.out.println(v);
		}
		
		else {
			System.out.println("Negative");
		}
		
	}

}
