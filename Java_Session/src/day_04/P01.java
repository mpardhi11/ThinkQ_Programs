package day_04;
/*

ABCDEEDCBA
ABCD  DCBA
ABC    CBA
AB      BA
A        A

 */
public class P01 {

	public static void main(String[] args) {
		for(int row=1;row<=5;row++) 
		{
			char a ='A';
			for(int col=5;col>=row;col--) 
			{
				System.out.print(a);
				++a;
			}
			for(int col=1;col<row;col++) {
				System.out.print("  ");
			}
			//a ='A';
			--a;
			for(int col=5;col>=row;col--) 
			{
				System.out.print(a);
				a--;
			}
		System.out.println("");
		}
	}
}

