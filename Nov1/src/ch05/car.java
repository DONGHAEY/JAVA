package ch05;

public abstract class car {
	public void startCar() {
		System.out.println("자동차의 시동을 겁니다");
	}
	public void turnOff() {
		System.out.println("자동차의 시동을 끕니다");
	}
	public abstract void drive();
	public abstract void stop();
	
	public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
