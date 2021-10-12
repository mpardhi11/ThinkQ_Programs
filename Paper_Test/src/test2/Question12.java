package test2;
/*
12) WAP to print number from 1 to 50 if number is even then print as it is 
and number is odd then print negative number with its square[1M]
 */
public class Question12 {

	public static void main(String[] args) {
		
		int i,n,square;
		
		for(i=1;i<=50;i++)
		{
			if(i%2==0)
				System.out.println(i+" ");
			else
			{
				
				System.out.println((-i)+" "+(i*i));
			}
		}
		
	}

}
