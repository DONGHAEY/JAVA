package ch02;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer choi = new Customer("choi");
		vipCustomer kim = new vipCustomer("kim");
		
		System.out.println("õ��¥�����Ǳ��Ž� "+choi.calcPrice(1000)+"�� ������");
		System.out.println("õ��¥�����Ǳ��Ž� "+kim.calcPrice(1000)+"�� ������");
	}

}
