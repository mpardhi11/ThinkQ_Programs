package day_3;
/*	
 * 		8. Create one class Employee (id , name, salary) 
 * 		with private access modifier and 
 * 		create getter and setter.
 */
public class Employee {

	private int id;
	private double salary;
	private String name;
	
		public int getId ()
		{
			return id;
		}
	
	 public double getSal ()
		{
			return salary;
		}
		
		public void setSal (double d)
		{
			this.salary=d;
			}
		
		public String getName ()
		{
			return name;
		}
		
		public void setName (String n)
		{
			this.name=n;
			}
		
	public void setId (int i)
	{
		this.id=i;
		}
	
	
	public static void main(String[] args) {
		Employee Mohit =new Employee();
		Mohit.setId(1234);
		System.out.println(Mohit.getId());
		Mohit.setName("Mohit");
		System.out.println(Mohit.getName());
		Mohit.setSal(123456.78);
		System.out.println(Mohit.getSal());

	}

}
