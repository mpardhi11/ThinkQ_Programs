package video_Day_8;

public class Book 
{
   int id,prize;
   String name;
   
   Book(int id, String name, int prize)
   {
	   this.id=id;
	   this.name=name;
	   this.prize=prize;
   }
   public String toString()
   {
	 return "Book ID :"+ id + "\nBook Name :"+ name +  "\nBook Prize :" +prize;  
   }
   
}