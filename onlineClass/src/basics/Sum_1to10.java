package basics;

public class Sum_1to10 {

	public static void main(String[] args) {
		int i,sum=0;
		for (i=1;i<=10;i++)
		{
			sum =sum+i;
		}
		System.out.println("Sum = " + sum);
		
		i=1;
		sum=0;
		
		while (i<=10)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum = " + sum);
		
		i=1;
		sum=0;
		do 
		{
			sum=sum+i;
			i++;;
		}while (i<=10);
		System.out.println("Sum = " + sum);

	}

}
