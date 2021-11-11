package ch04;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c1 = new Desktop();
		
		c1.display();
		c1.turnOn();
		
		Computer n1 = new myLaptop();
		
		n1.turnOff();
		n1.typing();
		n1.display();
	}

}
