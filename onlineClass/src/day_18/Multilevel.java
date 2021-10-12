package day_18;

class Vehical {
	public int price;
	public String name;
	
}


class Two_Wheeler extends Vehical{
	public String Company;
	public float Wheel_Size;
	
	public float  claculate_Full_Milage(int x,float y) {
		return  x*y;
	}
	
}

class Moped extends Two_Wheeler{
	int fule_tank=12;
	float milage=55.5f;
	float x =claculate_Full_Milage (fule_tank,milage);
	
}

class Bike extends Two_Wheeler{
	int fule_tank=5;
	float milage=40.4f;
	float x =claculate_Full_Milage (fule_tank,milage);
	
	
}
	
public class Multilevel {

	public static void main (String[] args) {
		
		Bike b = new Bike ();
		System.out.println(b.x);
		
		Moped m = new Moped ();
		System.out.println(m.x);
	}

}
