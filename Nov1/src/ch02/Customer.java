package ch02;

public class Customer {
	protected static int number = 100;
	protected String name;
	protected int customerNumber;
	protected String grade;
	protected double bonusRatio;
	protected int bonusPoint;
	public Customer(String name) {
		this.name = name;
		this.customerNumber = number++;
		this.grade = "silver";
		this.bonusRatio = 0.01;
	}
	public int calcPrice(int price) {
		bonusPoint = (int)(price * bonusRatio);
		return bonusPoint;
	}
}
