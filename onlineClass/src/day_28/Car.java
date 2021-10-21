package day_28;

import java.util.Scanner;

public class Car {
int id,price;
String name,color;

void set_Id(int ii) {
	id=ii;
}

void set_Name(String n) {
	name = n;
}

void set_Color (String c) {
	color=c;
}

void set_Price(int p) {
	price =p;
}

//===================================================
int get_Id() {
	return id;
}

String get_Name() {
	return name;
}

String get_Color () {
	return color;
}

int get_Price() {
	return price;
}
//=================================================
	public static void main(String[] args) {
		Car[] c1 = new Car[4];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<c1.length;i++) {
			c1[i]=new Car();
			System.out.println("Enter ID  Name Color Price : ");
			int x = sc.nextInt();

			String y =sc.next();

			String c = sc.next();

			int p =sc.nextInt();
	//==================================================	
			c1[i].set_Id(x);
			c1[i].set_Price(p);
			c1[i].set_Name(y);
			c1[i].set_Color(c);
		}
		
		System.out.println("==================================");
		for(Car cc : c1) {
			if (cc.price>50_000) {
				System.out.println(cc.get_Id()+" "+cc.get_Name()+" "+cc.get_Color()
				+" "+cc.get_Price());
			}
		}
		
		sc.close();

	}

}
