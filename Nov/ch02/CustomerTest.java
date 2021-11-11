package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer choi = new Customer("choi");
		vipCustomer kim = new vipCustomer("kim");
		
		System.out.println("천원짜리물건구매시 "+choi.calcPrice(1000)+"원 적립됨");
		System.out.println("천원짜리물건구매시 "+kim.calcPrice(1000)+"원 적립됨");
	}

}
