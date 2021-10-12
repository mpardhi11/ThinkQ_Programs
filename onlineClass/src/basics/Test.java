package basics;

public class Test {

	public static void main(String[] args) {
		int i,j,n=1;
		
		for (i=1;i<=5;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				if (j%2==0)
					System.out.print("0");
				else
					System.out.print("1");
			}
			
			System.out.println("");
		}
		
		
	}



}
