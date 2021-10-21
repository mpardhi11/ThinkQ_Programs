package day_7;
/*
 * 5. Take 10 integer inputs from user and store them in an array. 
 * Now, copy all the elements in another array but in reverse order.
 */
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		int[] arr_1 = new int[10];
		int[] arr_2 = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter "+arr_1.length+" Elements");
		for(int i=0;i<arr_1.length;i++) {
			arr_1[i]=sc.nextInt();
		}
		
		int count=arr_1.length-1;
		
		for(int i=0;i<arr_2.length;i++) {
			arr_2[i]=arr_1[count];
			count--;
		}
		
		for(int aa : arr_2) {
			System.out.print(aa+"\t");
		}

		sc.close();
	}

}
