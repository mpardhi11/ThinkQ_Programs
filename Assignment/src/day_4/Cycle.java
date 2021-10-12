package day_4;
/*
 * 9.	--Create a class Cycle with member variables: int accountNo, int noOfWheels
	--a. Create a default constructor with a write in it “I am default constructor”

	--b. Create another constructor which takes 2 arguments, 
	--calls the default constructor using this keyword and has a print in it “I am another constructor”.

	--c. In main method, create an object of type Cycle by using default constructor(Note the output)

	--d. Create another object of type Cycle by using the parameterized constructor
	--( Note the sequence of print indicating that inner most constructor is called first)

10. Show the use of this keyword in Program – 
--a. with a field(Instance Variable) 
--b. with Constructor 
--c. with Method

 */
public class Cycle {
	int accountNo, noOfWheels;
	
		Cycle() {
			
			System.out.println("I am default constructor");
		}
		
		Cycle (int accountNo, int noOfWheels) {
			this();
			System.out.println("I am another constructor");
			this.accountNo=accountNo;
			this.noOfWheels=noOfWheels;
		}
		
		public void setData(int accountNo, int noOfWheels)
		{
			this.accountNo=accountNo;
			this.noOfWheels=noOfWheels;
		}
	public static void main(String[] args) {
		Cycle obj1 =new Cycle();
		Cycle obj2 =new Cycle(12345,2);
		obj1.setData(1452,4);
	}

}
