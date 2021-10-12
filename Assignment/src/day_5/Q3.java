package day_5;
/*
 * Create Person class with fields(id,name,job) 
 * where job is another class with field(jobid,profile,joiningdate) 
 * where joiningdate is another class with fields (day, month, year) 
 * Display Person information 
 * (Note - Containment using constructor and getter/setter).
 */

class Person {
	Person (int id,String name,job j) {
		this.id=id;
		this.name=name;
		this.j=j;
	}
	
	int id;
	String name;
	job j;
	
	public void setID (int id) {
		this.id=id;
	}
	
	public void setName (String name) {
		this.name=name;
	}
	
	public void setJ(job j) {
		this.j=j;
	}
	
	public void Display () {
		System.out.println("Persone name : "+name);
		System.out.println("Persone ID : "+id);
		System.out.println("Person Job : "+j.jobid);
		System.out.println("Person Profile : "+j.profile);
		System.out.println("Person Joining Date : "+j.jd.day+"/"+j.jd.month+"/"+j.jd.year);
		//System.out.println(job.toString());
	}
}

class job {
	job (int jobid,String profile,joiningdate jd) {
		this.jobid=jobid;
		this.profile=profile;
		this.jd=jd;
	}
	
	int jobid;
	String profile;
	joiningdate jd;
	
	public void setJobid(int jobid) {
		this.jobid=jobid;
	}
	
	public void setProfile(String profile) {
		this.profile=profile;
	}
	
	public void setJd(joiningdate jd) {
		this.jd=jd;
	}
}

class joiningdate {
	joiningdate (int day, int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	int day, month, year;
	
	public void setDate (int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public String toString () {
		return day + " "+ month + " "+ year;
	}
	
	
}
public class Q3 {

	public static void main(String[] args) {
		joiningdate jd = new joiningdate(12,10,2021);
		job j =new job(121,"Programmer",jd);
		Person P = new Person(101,"Mohit",j);
		
		P.Display();
		
		jd.setDate(12, 10, 2021);
		
		j.setJd(jd);
		j.setJobid(1001);
		j.setProfile("Manager");
		
		P.setID(101);
		P.setName("JD. Matra");
		P.setJ(j);

		
		P.Display();
	}

}
