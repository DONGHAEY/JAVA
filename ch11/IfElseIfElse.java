package ch11;

public class IfElseIfElse { //camelǥ���
	public static void main(String[] args) {
		int age=17;
		int charge;
		if(age<8) {
			System.out.println("�� ���� �Ƶ��Դϴ�");
			charge = 200;
		} else if (age<14) {
			System.out.println("�ʵ��л��Դϴ�");
			charge=400;
		} else if (age<28) {
			System.out.println("�߰���л��Դϴ�");
			charge=800;
		} else {
			charge=1200;
			System.out.println("�����Դϴ�");
		}
		System.out.println("����� " + charge + "�� �Դϴ�");
	}
}
