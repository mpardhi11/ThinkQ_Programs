package test2;
/*
 * 14)WAP to print fibbo series upto 20 terms[1M]
 */
public class Question14 {

	public static void main(String[] args) {
		int n1=0,n2=1,sum=0;
		
		System.out.print(n1+" ");
		
		for(int i=1;i<=20;i++)
		{
			n1=n2;
			n2=sum;
			sum=n1+n2;
			System.out.print(sum+" ");
		}
		
	}

}
