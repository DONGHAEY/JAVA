package ch01;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("choi");
		Tiger t1 = new Tiger("tiger");
		p1.walk("두 발");
		t1.walk("네발");
		
		p1.drive();
		t1.walk();
	}

}
