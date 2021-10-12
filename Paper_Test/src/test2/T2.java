package test2;
/*
 * 6) There are four classes 
 * a) Car (carId, carcolor) 
 * b) Engine (engineid ,lastenginecleandate) 
 * c) SubEngine (subenginetype)
 * d) Gear (type - auto manual)
Car has Engine, Engine has SubEngine, Car also has Gear
Create Object in Object (Containment) for above scenario

 */

class Car {
	int carId=1212121;
	String carcolor="RED";
	Engine E;
	
	Car (Engine E) {
		this.E=E;
	}
	void Display() {
		System.out.println("Car Details Are : "+carId+" "+carcolor+" "+E+" "+E.SE+" "+E.SE.g);
		System.out.println(E.SE.toString());
	}
	
	
}

class Engine {
	int engineid=12345;
	String lastenginecleandate="xyzdt";
	SubEngine SE;
	
	Engine (SubEngine SE) {
		this.SE=SE;
	}
}

class SubEngine {
	Gear g;
	SubEngine (Gear g) {
		this.g=g;
	}
	String subenginetype="Petrol";


}
class Gear {
	String type="auto manual";
	
}
public class T2 {

	public static void main(String[] args) {
		Gear g = new Gear();
		SubEngine SE = new SubEngine(g);
		Engine E= new Engine(SE);
		Car c = new Car(E);
		c.Display();

	}

}
