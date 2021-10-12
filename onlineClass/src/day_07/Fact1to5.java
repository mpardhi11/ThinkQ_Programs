package day_07;
/*
 * Write a code to Calculate Sum of Factorial between 1 to 5
 */
public class Fact1to5 {

	public static void main(String[] args) {
		int i,j,sum=0,Fact=1;
		
		for (i=1;i<=5;i++)
		{
			for (j=1;j<=i;j++)
			{
				Fact=Fact*j;
			}
			sum =sum+Fact;
			Fact=1;
		}
		System.out.println(sum);
		
		
		sum=0;
		Fact=1;
		i=1;
		while (i<=5) 
		{
			j=1;
			while(j<=i) 
			{
				Fact=Fact*j;
				j++;
			}
			sum =sum+Fact;
			Fact=1;
			i++;
		}
		
		System.out.println(sum);

	}

}
