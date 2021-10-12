package day_08;

public class Star03 {

	public static void main(String[] args) {
		int i,j;
		
		//Using For Loop-------------------------------

		for(i=1;i<=4;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print("* ");
			}
		System.out.println("");
		}
		
		System.out.println("");
		//Using While Loop-------------------------------
		i=1;
		while (i<=4)
		{
			j=4;
			while (j>=i)
			{
				System.out.print("* ");
				j--;
			}
			System.out.println("");
			i++;
		}
	}

}
