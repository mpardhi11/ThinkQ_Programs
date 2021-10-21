package day_7;
/*
 * 13. Write a program to sort array of string 
 * in descending order of string length. 
 * If two strings have 
 * same length sort 
 * them in ascending order of alphabets.
 * E.g. 
 * 			String [] sarr = {“hi”, “how”, “are”, “you”, “doing”}
 * Output will be 
 * 							 {“doing”, “are”, “how”, “you”, “hi”}
 */
public class Q13 {

	public static void main(String[] args) {
		String[] sarr = {"hi", "how", "are", "you", "doing"};
		
		for (int i=0;i<sarr.length;i++) {
			for(int j=i+1;j<sarr.length;j++) {
				if(sarr[i].length()>sarr[j].length()) {
					String temp = sarr[i];
					sarr[i]=sarr[j];
					sarr[j]=temp;
				}
			}
		}
		for(String arr : sarr) {
			System.out.print(arr +"\t");			
		}

	}

}
