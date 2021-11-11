package ch09;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person_Test p1 = new Person_Test("¾È³ç", 19);
		Person_Test p2;
		p2 = p1.getPerson();
		System.out.println(p1);
		System.out.println(p2);
	}
}