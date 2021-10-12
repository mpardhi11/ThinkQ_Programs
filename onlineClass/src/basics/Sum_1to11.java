package basics;

public class Sum_1to11 {

	public static void main(String[] args) {
		int i,sum=0;
		for (i=2;i<=20;i+=2)
		{
			sum =sum+i;
		}
		System.out.println("Sum = " + sum);
		
		//--------------------------------------
		i=2;
		sum=0;
		while (i<=20)
		{
			sum=sum+i;
			i+=2;
		}
		System.out.println(sum);
		
		i=2;
		sum=0;
		do 
		{
			sum=sum+i;
			i+=2;
		} while(i<=20);
		System.out.println(sum);
	}

}
