package ch13;

public class WhileTest {

	public static void main(String[] args) {
		int sum=0;
		int i=1;
		while(i<10) {
			sum+=++i;
		}
		System.out.println(sum);
	}
}
