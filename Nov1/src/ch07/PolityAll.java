package ch07;

public class PolityAll implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("�켱������ ���� �� ������ ��⿭���� �����ɴϴ�");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("������ ��ų�� ���� ���");
	}
}
