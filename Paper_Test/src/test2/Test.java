package test2;
class Pen{
	Refill r;
	float capLength;
	String brand;
	
	public void set_capLength (float capLength) {
		this.capLength=capLength;
	}
	
	public void set_brand (String brand) {
		this.brand=brand;
	}
		
	
	void set_Refill (Refill r) {
		this.r=r;
	}
	
	String get_materialType () {
		return r.n.materialType;
	}
	
	float get_width () {
		return r.n.width;
	}
	
	float get_length () {
		return r.length;
	}
	
	String get_inkColor () {
		return r.inkColor;
	}
	
	float get_capLength () {
		return capLength;
	}
	
	String get_brand () {
		return brand;
	}
}

class Refill {
	String inkColor;
	float length;
	Nib n;
	
	public void set_inkColor (String inkColor) {
		this.inkColor=inkColor;
	}
	
	public void set_length (float length) {
		this.length=length;
	}
	
	public void set_Nib (Nib n) {
		this.n=n;
	}
}

class Nib {
	String materialType;
	float width;
	
	public void set_materialType (String materialType) {
		this.materialType=materialType;
	}
	
	public void set_width(float width) {
		this.width=width;
	}
	
}
public class Test 
	{
	public static void main(String arg[]) {
		Pen p = new Pen();
		Nib n= new Nib();
		Refill r = new Refill();
		n.set_width(1.2f);
		n.set_materialType("Iron");
		
		r.set_inkColor("Red");
		r.set_length(5.5f);
		r.set_Nib(n);
		
		p.set_capLength(5.9f);
		p.set_brand("Unik");
		p.set_Refill(r);
		
		System.out.println(p.get_width());
		System.out.println(p.get_materialType());
		System.out.println(p.get_inkColor());
		System.out.println(p.get_length());
		System.out.println(p.get_brand());
		System.out.println(p.get_capLength());
	}
	}
