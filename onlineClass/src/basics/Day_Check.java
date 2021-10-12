package basics;
import java.util.Scanner;

public class Day_Check {

	public static void main(String[] args) {
		int d;
        System.out.println("Enter a Number");
		Scanner scan = new Scanner(System.in);
        d = scan.nextInt();
        System.out.println("You Entred : " + d);
      
        if (d==1)
        	System.out.print("Day 1 is Mon");
        else if (d==2)
        	System.out.print("Day 2 is Thu");
        else if (d==3)
        	System.out.print("Day 3 is Wed");
        else if (d==4)
        	System.out.print("Day 4 is Thu");
        else if (d==5)
        	System.out.print("Day 5 is Fir");
        else if (d==6)
        	System.out.print("Day 6 is Sat");
        else if (d==7)
        	System.out.print("Day 2 is SUN");
        else 
        	System.out.print("Invalid Day");
        

	}

}
