package day_13;

public class Car {
	private int id;
	private String color,name;
	private float price;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setData(String color, String name) {
		this.color=color;
		this.name=name;
	}
	
	public void setPrice(float price) {
		this.price=price;
	}
	
	protected int getId() {
		return id;
	}
	
	protected String getColor() {
		return color;
	}
	
	protected String getName() {
		return name;
	}
	
	protected float getPrice() {
		return price;
	}
	
	public static void main(String[] args) {

	}

}
