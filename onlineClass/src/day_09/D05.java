package day_09;

public class D05 {

	public static void main(String[] args) {
		int i,j;
		for (i=1;i<=4;i++) 
		{
			char x='A';
			for (j=1;j<=i;j++)
			{
				if (i%2==1)
					System.out.print(j);
				else
					System.out.print(x);
				x++;
			}
		System.out.println("");
	}

}
}
