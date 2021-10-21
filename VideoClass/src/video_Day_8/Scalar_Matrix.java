package video_Day_8;

import java.util.Scanner;

public class Scalar_Matrix {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] [] arr= new int[4][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("==========================");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("==========================");
		
		System.out.println("Checking Scalar or Not : ");
		int x=arr[0][0];
		boolean b=true;
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=0;j<arr[i].length;j++) 
			{
				if((i==j && arr[i][j]!=x) || (i!=j && arr[i][j]!=0))
					b=false;
					break;
			}
			
		}
		if(b) {
			System.out.println("Matrix is Scalar Matrix");
		}
		else
			System.out.println("Matrix is NOT Scalar Matrix");
		sc.close();
	}

}
