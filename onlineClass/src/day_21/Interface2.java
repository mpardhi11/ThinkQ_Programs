package day_21;
interface Saving_Account {
	public void balance ();
}

interface Loan_Account {
	public void reamining_Ammount ();
}

class Bank implements Saving_Account,Loan_Account {
	int x= 120000;
	int y = 1500000;
	public void balance () {
		System.out.println("Reamining Balance : "+x);
	}
	public void reamining_Ammount () {
		System.out.println("Reamining Loan : "+y);
	}
	
}
public class Interface2 {

	public static void main(String[] args) {
		Bank b= new Bank ();
		b.balance();
		b.reamining_Ammount();
	}

}
