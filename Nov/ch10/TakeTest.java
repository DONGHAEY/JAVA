package ch10;

public class TakeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person P1 = new Person("yesterdayMrChoi", 5000);
		Person P2 = new Person("todayMrChoi", 20000);
		Subway brown = new Subway(3);
		GasStation gasstation = new GasStation("S-oil");
		Bus bus7_2 = new Bus("7-2");
		Car myCar = new Car("myCar");
		
		P1.takeSubway(brown);
		P1.takeBus(bus7_2);
		P2.takeCar(myCar, gasstation);
		
		
		P1.ShowInfo();
		P2.ShowInfo();
		
		brown.ShowInfo();
		bus7_2.ShowInfo();
		gasstation.ShowInfo();
	}

}