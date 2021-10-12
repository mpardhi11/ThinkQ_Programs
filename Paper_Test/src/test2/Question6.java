package test2;
/*
 * 6) WAP to print following pattern. [1M]
                1
	  		  2 2 2
            3 3 3 3 3
          4 4 4 4 4 4 4
 */
public class Question6 {

	public static void main(String[] args) {

		int i,j,k;
		int count=1;
		for (i=1;i<=4;i++)
		{  
			for (j=7;j>count;j--) {
				System.out.print(" ");
			}
			for (k=1;k<=count;k++) {
				System.out.print(i+" ");
			}
			
			System.out.println("");
			count+=2;
			if (count==9)
			{
				break;
			}
				
		}
	}

}
