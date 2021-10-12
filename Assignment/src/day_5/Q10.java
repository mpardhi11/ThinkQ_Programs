package day_5;
/*
 * 10. Create class Student (id, name) 
 * then create 2 objects of Student 
 * using new keyword. 
 * Print 2 objects and 
 * see its hashcode is different 
 * E.g. Student@15db9742 and Student@2329742. 
 * 
 * If you do this Student s1 = new Student (); 
 * Student s2 = s1; 
 * Now print s1 and s2 see both reference variables 
 * are pointing to same location 
 * 
 * now override the toString () method in student class 
 * and see the beautiful output.
 */

class Student1 {
	int id = 121;
	String name = "Test_object1";

	
	  //public String toString() { return id + " "+ name; }
	  
}

public class Q10 {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();

		System.out.println(s1);
		System.out.println(s2);

		s2 = s1;
		System.out.println("========================");
		System.out.println(s1);
		System.out.println(s2);

	}

}
