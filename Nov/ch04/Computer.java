package ch04;

public abstract class Computer {
	
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("컴퓨터를 킵니다");
	}
	public void turnOff() {
		System.out.println("컵퓨터를 끕니다");
	}

}
