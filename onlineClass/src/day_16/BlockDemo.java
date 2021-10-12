package day_16;

public class BlockDemo {
	
	BlockDemo()
	{
		System.out.println("My default constructor");
	}
	
	{
		System.out.println("my intilizer");
	}	static {
		System.out.println("static2");
	}

	public static void main(String[] args) {
		//System.out.println("main");
		BlockDemo d=new BlockDemo();
		
		BlockDemo d1=new BlockDemo();

	}
	static {
		System.out.println("static1");
	}

}
