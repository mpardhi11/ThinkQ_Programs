package day_04;

public class star5 {

	public static void main(String[] args) {
		int count=9;
		for (int i=1;i<=5;i++) 
		{
			for (int k=(i*2);k>=1;k--)
			{
				System.out.print("*" );
			}
	
			for (int j=1;j<=i;j++)
			{
				System.out.print("-");
			}
			System.out.println("");
		}
	}

}
