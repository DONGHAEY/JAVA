package ch05;

public class PersonTest {
	int key;
	int kg;
	String se;
	int age;
	String name;
	
	public PersonTest(int key, int kg, int age, String se, String name) {
		this.key = key;
		this.kg = kg;
		this.se = se;
		this.age = age;
		this.name = name;
	}
	
	public void print() {
		System.out.println("키가 "+key+"이고 몸무게가"+kg+"인 남성이 있습니다. 이름은 "+name+"이고 나이는"+age+"입니다");
	}
}
