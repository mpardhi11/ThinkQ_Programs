package Day_2;

public class Program_12 {
/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
 */
	public static void main(String[] args) {
		int i,j,row=5;
		
		for (i=1;i<=row;i++)
		{
			for (j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
			
		}

	}

}
