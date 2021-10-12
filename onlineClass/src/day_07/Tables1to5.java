package day_07;

public class Tables1to5 {

	public static void main(String[] args) {
		int i,j;
		for (i=1;i<=5;i++)
		{
			for (j=1;j<=10;j++)
			{
				System.out.println(j+"*"+i+"="+(i*j));
			}
			System.out.println("");
		}

//		i=j=1;
//		while (i<=10)
//		{
//			while (j<=5)
//			{
//				System.out.print(j+"*"+i+"="+(i*j)+"---");
//				j++;
//			}
//			i++;
//			System.out.println("");
//
//		}
	}

}
