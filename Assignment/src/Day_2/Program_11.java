package Day_2;
/*
 * * * * *
  * * * *
   * * *
    * *
     *
 */
public class Program_11 {

	public static void main(String[] args) {
		int i,k,j,row=5;
		
		for (i=1;i<=row;i++)
		{
			for (j=1;j<=i;j++)
				System.out.print(" ");
			for (k=row;k>=i;k--)
				System.out.print("* ");
			
			System.out.println("");
		}

	}

}
