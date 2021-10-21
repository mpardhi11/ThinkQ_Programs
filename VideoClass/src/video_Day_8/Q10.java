package video_Day_8;
import java.util.Arrays;

class auther{
	int Auther_ID;
	String Auther_Name;
	books[] book;
	auther(int id,String name,books b[]) {
		Auther_ID=id;
		Auther_Name=name;
		book=b;
	}
	
	public String toString() {
		return Auther_ID + " "+ Auther_Name+book.toString();//Arrays.toString(book);//+Array.to;
	}
}

class books  {
	int book_Id,book_Price;
	String book_Name;
	
	books (int Id,int Price,String Name) {
		book_Id=Id;
		book_Price=Price;
		book_Name=Name;
	}
	
	public String toString () {
		return "\n"+book_Id+" "+book_Price+" "+book_Name+"\n";
	}
}
public class Q10 {

	public static void main(String[] args) {
		auther[] aa = new auther[3];
		books[] bb1 = new books[3];
		
		bb1[0]=new books(01,123,"Book1 of Mohit");
		bb1[1]=new books(02,450,"Book2 of Mohit");
		bb1[2]=new books(03,360,"Book3 of Mohit");
		
		books[] bb2 = new books[3];
		bb2[0]=new books(01,123,"Book1 of Ram");
		bb2[1]=new books(02,450,"Book2 of Ram");
		bb2[2]=new books(03,360,"Book3 of Ram");
		
		books[] bb3 = new books[3];
		bb3[0]=new books(01,123,"Book1 of Sham");
		bb3[1]=new books(02,450,"Book2 of Sham");
		bb3[2]=new books(03,360,"Book3 of Sham");
		
		
		aa[0]= new auther (101,"Mohit",bb1);
		aa[1]= new auther (102,"Ram",bb2);
		aa[2]= new auther (103,"Sham",bb3);
		
		for (auther obj : aa) {
			System.out.println(obj);
		}
	}

}
