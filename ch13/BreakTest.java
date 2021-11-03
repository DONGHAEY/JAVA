package ch13;

public class BreakTest {

	public static void main(String[] args) {
		int sum=0;
		int count;
		for(count =1; ; count++) {
			sum+=count;
			if(sum>=100) {
				break;
			}
		}
		System.out.println(count);
	}
}
