package test2;
/*
 * 11)
    Print the Series [1M]
2 12 36 80 150 252....upto 10 terms

 */
public class Question11 {

	public static void main(String[] args) {
		int n=2,i,j;
		
		System.out.print(n+" ");
		for(n=2;n<12;n++) 
		{
			int sum = (n*n)+(n*n*n);
			//n++;
			System.out.print(sum+" ");			
		}
		
	}

}
