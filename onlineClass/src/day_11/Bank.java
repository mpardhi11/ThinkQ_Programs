package day_11;

public class Bank {
	int b_Id,b_AccountNo;
	float b_Balance;
	String b_CustomerName,bankName;
	
	
		public void acceptDetails(int b_Id,int b_AccountNo,float b_Balance,
								  String b_CustomerName,String bankName) 
		{
			this.b_Id=b_Id;
			this.b_AccountNo=b_AccountNo;
			this.b_Balance=b_Balance;
			this.b_CustomerName=b_CustomerName;
			this.bankName=bankName;
			
		}
		
		public void displayDetails() {
			System.out.println("Bank ID = "+b_Id+"\nCustomer Name : "+b_CustomerName
					+"\nBank Name "+bankName+"\nAccount No : "+b_AccountNo
					+"\nReamaining Balance : "+b_Balance);
		}
	public static void main(String[] args) {
			Bank obj1=new Bank();
			obj1.acceptDetails(101,884488,4500000.0f,"Mohit","ICICI");
			obj1.displayDetails();
			
		
	}

}
