package day_04;
import day_03.t2;
public class test extends t2{
	public void show() {
	i = i + 1;
	j = j + 2;
	System.out.println("i = " + i + " j= " + j);//
	}
	public static void main(String[] args) {
	test p = new test();
	p.show();
	}
	}
