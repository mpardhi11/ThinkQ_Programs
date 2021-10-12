package test2;
/*
 * 
7.WAP to print following pattern. [1M]
* * * * *
* * * *
* * *
* *
*

 */
public class Question7 {

	public static void main(String[] args) {
		int i,j;
		
		for(i=5;i>=1;i--)
		{
			for (j=i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
