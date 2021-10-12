package basics;

public class odd {

	public static void main(String[] args) {
		int i,count=0;
		for (i=1;i<=20;i+=2)
			{
				count++;
			}
		System.out.println(count);
		
		
		i=1;
		count=0;
		while (i<=20)
			{
			count++;
			i+=2;
			}
		System.out.println("Count"+count);
		
		
		i=1;
		count=0;
		System.out.println("------");
		do
		{
			count++;
			i+=2;

		} while (i<=20);
		System.out.println(count);

	}

}
