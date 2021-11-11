package ch10;

public class Person {
	String name;
	int money;
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeSubway(Subway subway) {
		money -= 1300;
		subway.take(1300);
	}
	public void takeBus(Bus bus) {
		money -= 1300;
		bus.take(1300);
	}
	public void takeCar(Car car, GasStation gasstation) {
		money-= car.take(gasstation, 3);
	}
	public void ShowInfo() {
		System.out.println(name + "님의" + "남은 잔액은 " + money+"입니다");
	}
}
