package day_13;

public class GetCar {

	public static void main(String[] args) {
		
		Car obj1=new Car();
		obj1.setId(1235);
		obj1.setData("red","Alto");
		obj1.setPrice(123.45f);
		
		System.out.println(obj1.getId());
		System.out.println(obj1.getName());
		System.out.println(obj1.getColor());
		System.out.println(obj1.getPrice());

	}

}
