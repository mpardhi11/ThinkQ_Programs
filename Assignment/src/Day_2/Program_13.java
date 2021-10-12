package Day_2;
/*
A
A B
A B C
A B C D
A B C D E
A B C D E F
 */
public class Program_13 {

	public static void main(String[] args) {
		int i,j,row=5;
		//char C='A';
		for (i=1;i<=row;i++)
		{
			char C='A';
			for (j=1;j<=i;j++)
			{
				
				System.out.print(C+" ");
				C++;
			}
			//C++;
			System.out.println("");
		}

	}

}
