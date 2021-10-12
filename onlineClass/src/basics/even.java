package basics;

public class even {

	public static void main(String[] args) {
		int i;
		for (i=2;i<=20;i+=2)
			{
			System.out.print(i+ " ");
			}
		System.out.println("");
		System.out.println("XXXXXXXX");
		i=2;
		while (i<=20)
			{
			System.out.print(i+" ");
			i+=2;
			}
		i=2;
		System.out.println("XXXXXXXX");

		do
		{
			System.out.print(i+ " ");
			i+=2;
		} while (i<=20);
	}

}
