package basics;
import java.util.Scanner;
public class Date_Checker {

	public static void main(String[] args) {
		int DD, MM, YYYY;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Date :");
        DD = scan.nextInt();
        
        System.out.print("Enter the Month :");
        MM = scan.nextInt();

        System.out.print("Enter the Year :");
        YYYY = scan.nextInt();
        boolean b = false; 		
        if (DD <=31 && MM <= 12 && YYYY <= 9999)
        {
            if (((YYYY % 4 == 0) && (YYYY % 100!= 0)) || (YYYY %400 == 0))
            {
            			if (DD >29 && MM ==2)
            				System.out.println("1Invalid Date");
            			else
            				System.out.println("1You entred Correct Date");

            				System.out.println(DD + "/"+ MM +"/"+YYYY); 
            }
            	
            else if (!((YYYY % 4 == 0) && (YYYY % 100!= 0)) || (YYYY %400 == 0) && (MM==2))
            {
            			System.out.println("Month");
            }
            
            else 
            {
            	System.out.println("1You entred Correct Date");

				System.out.println(DD + "/"+ MM +"/"+YYYY); 
            }
        	
          
        }

	}
}

/*if (DD >28 && (MM ==2))
	System.out.println("Invalid Date");
else
	System.out.println("You entred Correct Date");

	System.out.println(DD + "/"+ MM +"/"+YYYY);
*/