package testPackage;

public class Static {
	static int count=0;
	   public void increment()
	   {
	       count++;
	   }
	   public static void main(String args[])
	   {
		   Static obj1=new Static();
		   Static obj2=new Static();
	       obj1.increment();
	       obj2.increment();
	       System.out.println("Obj1: count is="+Static.count);
	       System.out.println("Obj2: count is="+count);
	   }

}

/*
//static int count=0;
	int count=0;
	public void increament () {
		count++;
	}
	public static void main(String[] args) {
		Static obj1 = new Static();
		Static obj2 = new Static();
		//count=10;
		System.out.println(obj1.count);
		obj1.increament();
		System.out.println(obj1.count);
		obj2.increament();
		System.out.println(obj2.count);
		
		System.out.println(obj1.count);
		System.out.println(obj2.count);

	}
*/