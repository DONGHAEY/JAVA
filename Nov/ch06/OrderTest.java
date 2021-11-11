package ch06;

public class OrderTest {
	String phone_number;
	String numberoforder;
	String adress;
	int date;
	int time;
	int price;
	String name;
	int MenuNumber;
	
	public OrderTest(String name, String adress, String phone_number) {
		this.name = name;
		this.adress = adress;
		this.phone_number = phone_number;
	}
	
	public void print() {
		System.out.println("주소: "+ adress + "번호" + phone_number + "네임" + name );
	}
}
