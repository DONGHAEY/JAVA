package ch05;

public class AiCar extends car{

	@Override
	public void drive() {
		System.out.println("자동차가 자율주행을 시작합니다");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 자율주행을 멈춥니다");
	}
	
}
