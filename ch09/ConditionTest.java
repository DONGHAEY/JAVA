package ch09;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
		System.out.println("�Է� ���� �� �� �� ū ���� ����Ұ���");
		int Max;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է��ϼ��� : ");
		int a = scanner.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ��� : ");
		int b = scanner.nextInt();
		
		Max = (a>b) ? a:b;
		System.out.println(Max);
	}

}
