package ch09;

public class OperaterTest {

	public static void main(String[] args) {
		int Num1 = 10;
		int Num2 = 2;
		boolean value = ((Num1+=10)<10) && ((Num2+=2)<10);
		System.out.println(value);

	}

}
