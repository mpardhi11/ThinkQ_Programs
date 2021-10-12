package day_21;
interface xx {
	int X = 10;
	static int value() {
		return X;
	}
}

abstract class yy {
	int Y=20;
	
	public int value2() {
		return Y;
	}
}

class Addition  extends yy implements xx{
	
	public void add () {
		int c  = X+Y;
		//System.out.println(c);
	}
	
	public void mul () {
		int c = xx.value();
		//int d  = super.value2();
		//System.out.println(c*d);
	}
}
public class AbstractInterface {

	public static void main(String[] args) {
		Addition a=new Addition();
		a.add();
		//a.mul();
		
		

	}

}
