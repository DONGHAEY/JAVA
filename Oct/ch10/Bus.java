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
		System.out.println(number+"�� ������ �ܾ���" + money+"�̰� �°����� "+ passengerCount+"�Դϴ�");
	}
}
