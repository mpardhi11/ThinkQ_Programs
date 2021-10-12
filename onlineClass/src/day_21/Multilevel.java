package day_21;
interface Bike_able {
	public void  Wheels ();
}

interface Car_able extends Bike_able{
	public void Meter ();

}


class Vehical implements Car_able {
	
	public void Wheels () {
		System.out.println("Bike has 2 Wheels");
	}
	
	public void Meter () {
		System.out.println("Car has Digital Meter");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		Vehical v = new Vehical ();
		v.Wheels();
		v.Meter();
		

	}

}
