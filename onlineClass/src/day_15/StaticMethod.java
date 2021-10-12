package day_15;

public class StaticMethod {
		/*1st
		  method () {
		  statements;
		  statements;
		  
		  
		  }
		  
		  method 
		  {
		  	2nd
		  	statements;
		  	statements;
		  	statements;
		  }
		 */
	
	
	public static void Add(int x,int y) {
		System.out.println(x+y);
	}
	
	public static void Add(float  x,int y) {
		System.out.println(x+y);
	}
	
	public static float Add(int x,float y) {
		return x+y;
	}
	
	
	public static void main(String[] args) {
		
		StaticMethod.Add(1,2);
		StaticMethod.Add(1.5f, 5);
		System.out.println(StaticMethod.Add(10, 15.0f));
		
	}

}
