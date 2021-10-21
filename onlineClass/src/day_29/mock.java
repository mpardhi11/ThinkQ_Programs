package day_29;
/*
OutPut
45
33
-99
-53   
 */
public class mock {

	public static void main(String[] args) {
		int[] a= {1,2,3,45,33,456,100,-99,-53,-3,-5};
		
		for(int i=0;i<a.length;i++) {
			
			if ((a[i]>9 && a[i]<100) || (a[i]<-9 && a[i]>-100)) {
				System.out.println(a[i]);
			}
		}

	}

}
