package ch07;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 방식을 선택하세여!");
		System.out.println("R: 한명씩 차례로");
		System.out.println("S: 쉬고있는 또는 업무량이 적은 상담원에게");
		System.out.println("P: 우선순위 높은사람");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		if(ch=='R' || ch=='r') {
			scheduler = new RoundRobin();
		} else if (ch=='S' || ch=='s') {
			scheduler = new ShortestJob();
		} else if (ch=='P' || ch=='p') {
			scheduler = new PolityAll();
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
