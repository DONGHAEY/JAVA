package ch09;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		System.out.println("입력 받은 두 수 중 큰 수를 출력할거임");
		int Max;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하세요 : ");
		int a = scanner.nextInt();
		System.out.println("두번째 수를 입력하세요 : ");
		int b = scanner.nextInt();
		
		Max = (a>b) ? a:b;
		System.out.println(Max);
	}

}
