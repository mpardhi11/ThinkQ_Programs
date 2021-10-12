package day_08;

public class Star5 {

	public static void main(String[] args) {
		int i,j;
		
		for (i=1;i<=5;i++)
		{
			for (j=1;j<=5;j++)
			{
				if (i==3 || j==3)
					System.out.print("0");
				else
					System.out.print("*");
			}
			System.out.println("");
		}
	}

}
