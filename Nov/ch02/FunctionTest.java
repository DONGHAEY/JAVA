package ch02;

public class FunctionTest {
	
	public static int add(int num1, int num2) {
		return (num1+num2);
	}
	//이름을 입력받아 이름_hellfmf를 출력하는 함수
	
	public static void sayHello(String name) {
		System.out.println("hello "+name);
	}
	//1qnxj 100RKwl ejgks rufrhk rkqtdmf qksghksdmfgksek
	public static int calcSum() {
		int count=0;
		for(int i=0; i<=100; i++) {
			count+=i;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int sum = 0;
		sum = add(num1, num2);
		System.out.println(sum);
		sayHello("name");
		int p = calcSum();
		System.out.println(p);
	}

}
