package ch08;

public class StudentsTest {
	private int p;
	private int cl;
	private String name;
	
	public StudentsTest() {}
	
	public StudentsTest(int p, int cl, String name) {
		this.p = p;
		this.cl = cl;
		this.name = name;
	}
	
	public void setName(String naem) {
		this.name = naem;
	}
	public String getName() {
		return name;
	}

	public void print() {
		System.out.println(p +","+ cl+","+ name);
	}
}
