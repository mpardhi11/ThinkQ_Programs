package Day_2;

public class Program_10 {
/*
 * Draw the below pattern -
 * 		* * * * *
 * 		* * * *
 * 		* * *
 * 		* *
 * 		*
 */
	public static void main(String[] args) {

		int row=5,i,j;
		for (i=1;i<=row;i++)
			{
				for (j=5;j>=i;j--)
				{
					System.out.print("*"+" ");
				}
				System.out.println(" ");

			}

	}

}
