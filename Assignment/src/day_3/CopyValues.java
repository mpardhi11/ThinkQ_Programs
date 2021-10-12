package day_3;
/*
 * Write a program to copy values of one object into another 
 * by assigning the values of one object into another.
 */
public class CopyValues {

	int v1;
	String v2;
	
	public void display()
	{
		System.out.println("Id : " + v1);
		System.out.println("Name : " + v2);
	}
	
	public static void main(String[] args) {
		
		CopyValues value1= new CopyValues();
		CopyValues value2= new CopyValues();
		value1.v1=12345;
		value1.v2="Obj1";
		System.out.println("Object :- Vaule1");
		value1.display();
		System.out.println("Object :- Vaule2");
		value2.display();
		value2=value1;
		System.out.println("Object :- Vaule2");
		value2.display();
		
	}

}
