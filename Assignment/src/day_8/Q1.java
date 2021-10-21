package day_8;
/*
 1. Initialize and print all elements of a 2D array. 
 */
public class Q1 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int[] aa : arr) {
			for(int bb : aa) {
				System.out.print(bb + " ");
			}
			System.out.println("");
		}
	}

}
