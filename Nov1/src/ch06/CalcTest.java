package ch06;

public class CalcTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		Calc p1 = new CompleteCalc();
		
		System.out.println(num1 + "+" + num2 + "=" + p1.add(num1, num2));
		System.out.println(num1 + "-" + num2 + "=" + p1.substract(num1, num2));
		System.out.println(num1 + "*" + num2 + "=" + p1.times(num1, num2));
		System.out.println(num1 + "/" + num2 + "=" + p1.divide(num1, num2));
	}

}