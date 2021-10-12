package day_16;
class Address
{
	int pincode;
	String city;
	
	Address(int pincode,String city)
	{
		this.pincode=pincode;
		this.city=city;
	}
	void disp()
	{
		System.out.println(pincode+" "+city);
	}
	
}
public class Person {
	
	int id;
	String name;
	Address adr;
	
	Person(int id,String name,Address adr)
	{
		this.id=id;
		this.name=name;
		this.adr=adr;
	}
  void show()
  {
	  System.out.println(id+" "+name+" ");
	  adr.disp();
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a=new Address(41,"pune");
		Person p=new Person(101,"Neha",a);
		p.show();

	}

}
