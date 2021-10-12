package day_08;

public class Number3 {

	public static void main(String[] args) {

		int i,j,count=1;
		
		for (i=0;i<4;i++)
		{
			for (j=0;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;

			}
			System.out.println("");
		}
	}

}
