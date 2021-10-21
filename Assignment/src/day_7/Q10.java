package day_7;
/*
 * 10. Write methods that return the average of an array with following 
 * headers and invoke the method from main
i. public static int average(int[] array).
 */
public class Q10 {
	public static int average(int[] array) {
		int[] arr=array;
		int sum=0;
		for (int aa : arr) {
			sum=sum+aa;
		}
		return sum/arr.length;
		
	}
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		
		int avg = average(arr);
		
		System.out.println("average : "+avg);
		

	}

}
