package ch09;

public class Person_Test {
	String name;
	int age;
	
	public Person_Test() {
		this("이름없음", 1);
	}
	public Person_Test(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person_Test getPerson() {
		return this;
	}

}
