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
		System.out.println("Ű�� "+key+"�̰� �����԰�"+kg+"�� ������ �ֽ��ϴ�. �̸��� "+name+"�̰� ���̴�"+age+"�Դϴ�");
	}
}
