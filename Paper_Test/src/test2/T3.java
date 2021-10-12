package test2;
/*
 * 8)Write a Java program that prints the numbers
from 1 to 50. But for multiples of three print “buzz” instead of the
number and for the multiples of five print “fizz”. For numbers which
are multiples of both three and five print “ buzzfizz “. After program
looping is completed print how many times buzz was printed, fizz
was printed and buzzfizz was printed.

 */
public class T3 {
	
	public static void main (String args[]) {
		int counter1=0,counter2=0,counter3=0,i; 
		
		for (i=1;i<=50;i++) {
			if (i%3==0 && i%5==0) {
				System.out.println("buzzfizz");
				counter3++;
			}
			else if (i%3==0) {
				System.out.println("buzz");
				counter1++;
			}
			else if (i%5==0) {
				System.out.println("fizz");
				counter2++;
			}
			else
				System.out.println(i);
		}
		System.out.println("buzz counter : "+counter1);
		System.out.println("fizz counter : "+counter2);
		System.out.println("buzzfizz counter : "+counter3);
	}

}
