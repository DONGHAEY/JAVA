package ch04;

public class StudentsTest {
	int p;
	int cl;
	String name;
	
	public StudentsTest(int p, int cl, String name) {
		this.p = p;
		this.cl = cl;
		this.name = name;
	}
	
	public void print() {
		System.out.println(p +","+ cl+","+ name);
	}
}
