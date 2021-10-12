package day_18;
class Grandfather {
	String name="GHI";
}

class father extends Grandfather{
	String name="DEF";
	Grandfather g =new Grandfather();

}

class son extends father{
	String name="ABC";
	
	public void  call ()
	{
		System.out.println(name +" "+super.name+" "+g.name);
	}

}
public class Hierarchy {

	public static void main(String[] args) {
		
		son s=new son();
		s.call();
	}

}
