package ch10;

public class Subway {
	int number;
	int money;
	int passengerCount;
	public Subway(int number) {
		this.number = number;
	}
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void ShowInfo() {
		System.out.println(number+"호선 의 잔액은" + money+"이고"+"승객수는" + passengerCount+"입니다");
	}
}
