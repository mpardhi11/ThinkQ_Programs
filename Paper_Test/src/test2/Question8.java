package test2;
/*
8) WAP to print following pattern. [1M]
      1 2 3 4 5
        1 2 3 4
          1 2 3
            1 2
              1
 */
public class Question8 {

	public static void main(String[] args) {
		int i,j=1,k;
		
		for (i=5;i>=1;i--) 
		{
			j=1;
			while (j<5)
			{
				System.out.print("*");
				j--;
			}
			for (k=1;k<=i;k++)
			{
				System.out.print(k);
			}
   
			System.out.println("");
		
		}
	}

}
