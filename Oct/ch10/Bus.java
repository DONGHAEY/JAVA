package ch10;

public class Bus {
	int money;
	String number;
	int passengerCount;
	public Bus(String number) {
		this.number = number;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void ShowInfo() {
		System.out.println(number+"번 버스의 잔액은" + money+"이고 승객수는 "+ passengerCount+"입니다");
	}
}
