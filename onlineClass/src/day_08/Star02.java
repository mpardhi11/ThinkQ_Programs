package day_08;

public class Star02 {

	public static void main(String[] args) {
		int i,j;
		
		//Using For Loop-------------------------------
		for (i=1;i<=4;i++)
		{
			for(j=1;j<=4;j++)
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
			j=1;
			while (j<=4)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println("");
			i++;
		}
	}

}
