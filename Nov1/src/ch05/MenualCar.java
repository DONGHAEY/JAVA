package ch05;

public class MenualCar extends car {

	@Override
	public void drive() {
		System.out.println("기어를 P->D");
		System.out.println("엑셀을 밟는다");
		System.out.println("핸들을 조향한다");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("브레이크를 밟는다");
		System.out.println("기어봉을 D->P");
	}
	
}
