package basics;
import java.util.Scanner;
public class Max_of_3 {

	 public static void main(String[] args) 
	    {
	        int x, y, z;
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the first number:");
	        x = scan.nextInt();
	        System.out.print("Enter the second number:");
	        y = scan.nextInt();
	        System.out.print("Enter the third number:");
	        z = scan.nextInt();
	        if(x > y && x > z)
	           System.out.println("Gratest number is:"+x);
	        
	        else if(y > z)
	        	System.out.println("Gratest number is:"+y);
	        
	        else
	        	System.out.println("Gratest number is:"+z);
	       	 
	    }

}
