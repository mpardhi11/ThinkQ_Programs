package day_7;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 9. WAP to find and count total number of duplicate elements in an array.
 */
public class Q9 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		int[] find = new int[10];
		int x=0;
		System.out.println("Enter "+arr.length+" Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i] + "\t");
					find[x]=arr[i];
					x++;
					count++;
					break;
				}
					
				}
			}
		System.out.println("Count : "+count);
		System.out.println(Arrays.toString(find));
		sc.close();
		}
	}


