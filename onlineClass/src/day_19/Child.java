package day_19;


abstract class Parent
{
	int x=10;
	abstract void show();
	int get()
	{
		return 10;
	}
}


public class Child extends Parent {
	
	void show()
	{
		System.out.println("Show");
	}

	public static void main(String[] args) {
	Child c=new Child();
	c.show();

	}

}
