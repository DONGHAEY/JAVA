package ch02;

public class vipCustomer extends Customer{
	private double saleRatio;
	public vipCustomer (String name) {
		super(name);
		super.name = name;
		super.customerNumber = super.number++;
		super.grade = "VIP";
		super.bonusRatio = 0.05;
		
		this.saleRatio = 0.1;
	}
	@Override //부모꺼를 들고와서 재 정의하겠다
	public int calcPrice(int price) {
		bonusPoint = (int)(price * bonusRatio);
		return price - (int)(price*saleRatio);
	}	
}