package day_11;

import day_12.Test;

public class Access extends Test {

	public static void main(String[] args) {
		
		Test t=new Test();
		
		//System.out.println(t.x); cant access private outside class
		
		//System.out.println(t.y); cant access outside package
		//System.out.println(t.z);cant access protected ouside package without child
		Access a=new Access();
		System.out.println(a.z);
		
		System.out.println(t.p);
		
		

	}

}
