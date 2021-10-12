package day_17;

class Department {
	int did;
	String dname;

	void setDid(int did) {
		this.did = did;
	}

	void setDname(String dname) {
		this.dname = dname;
	}

	int getDid() {
		return did;
	}

	String getDname() {
		return dname;
	}

}

public class Emp {

			int id;
			String name;
			Department dept;
		
			void setId(int id) {
				this.id = id;
			}
		
			void setName(String name) {
				this.name = name;
			}
		
			void setDept(Department dept) {
				this.dept = dept;
			}
		
			int getId() {
				return id;
			}
		
			String getName() {
				return name;
			}
		
			Department getDept() {
				return dept;
			}

	
	public static void main(String[] args) {
		Department d = new Department();
		d.setDid(1);
		d.setDname("HR");
		Emp e = new Emp();
		e.setId(101);
		e.setName("sagar");
		e.setDept(d);

		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(d.getDid());
		System.out.println(d.getDname());
		
		
		//System.out.println(e.getDept());

	}

}