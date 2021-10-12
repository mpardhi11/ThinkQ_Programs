package day_09;

public class D06 {

	public static void main(String[] args) {
		int i,j,k;
		
		for (i=1;i<=4;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for (k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
