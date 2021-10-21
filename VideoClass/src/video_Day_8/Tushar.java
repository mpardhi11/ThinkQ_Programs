package video_Day_8;

import java.util.Arrays;

class Author1
{
   int id;
   String name;
   Book booksWritten[]; // array of books
   
    Author1(int id, String name, Book[] books)
    {
    	this.id=id;
    	this.name=name;
    	this.booksWritten=books;
    }

    public String toString()
   {
     return "Author ID :"+ this.id + "\nAuthor Name :"+ name 
 		+ "\nBooks written by Authors :"+Arrays.toString(booksWritten);		
   }
   
}
public class Tushar {
		public static void main(String[] args) 
		{
			Book books[]=new Book[3];
			books[0]=new Book(100,"Life Is A Journey",500);
			books[1]=new Book(101,"Struggle For Independence",900);
			books[2]=new Book(102,"My India",1000);
			Author1 a1 = new Author1(201,"Mr.ABC",books);
			
			Book books1[]= new Book[5];
			books1[0]=new Book(103,"Swami Vivekanand",690);
		    books1[1]=new Book(104,"Shivaji Maharaj",570);
		    books1[2]=new Book(105,"Rich And Poor Dad",800);
		    books1[3]=new Book(106,"Shyamchi Aai",120);
		    books1[4]=new Book(107,"Mahanayak",340);
			Author1 a2=new Author1(202,"Mr.XYZ",books1);
			
			System.out.println(a1);
			System.out.println(a2);

		}

	}

