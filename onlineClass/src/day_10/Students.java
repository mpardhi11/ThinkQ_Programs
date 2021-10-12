package day_10;

public class Students {

	int s_id,physics,chemistry,Biology;
	String s_Name;
	float per;
	void acceptData() {
		s_id=101;
		physics=89;
		chemistry=78;
		Biology=81;
		s_Name="Mohit";
	}
	
	void calc_Perentage() {
		per=(physics+chemistry+Biology)*100/300.0f;
	}
	
	void displayData() {
		System.out.println("Student ID : "+s_id);
		System.out.println("Student Name : "+s_Name);
		System.out.println("Students Marks : "+physics+" "+chemistry+" "+Biology);
		System.out.println("Student Percentage : "+per);
	}
	public static void main(String[] args) {
		Students S= new Students();
		
		S.acceptData();
		S.calc_Perentage();
		S.displayData();
		

	}

}
