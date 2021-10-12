package day_03;

public class Q1 {

	public static void main(String[] args) {
		String primeNumber="";
		System.out.println("Length : "+primeNumber.length());
		for (int i=300;i<=400;i++) {
			int count =0;
			for ( int j=i;j>=1;j--) {
				if (i%j==0) {
				count++;
				}
					
			}
			if (count==2) {
				primeNumber = primeNumber +" "+ i;
				//primeNumber = i+" "+primeNumber;
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		System.out.println("Length : "+primeNumber.length());
		System.out.println(primeNumber);
	}

}
