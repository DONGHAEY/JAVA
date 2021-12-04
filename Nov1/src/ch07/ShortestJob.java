package ch07;

public class ShortestJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 || 대기가 가장 짧은 상담원에게 배정합니다.");
	}
}
