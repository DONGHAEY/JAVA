package ch10;

public class GasStation {
	int money;
	String adress;
	int oilCount;
	public GasStation(String adress) {
		this.adress = adress;
		oilCount = 10;
	}
	public int oilling(int liter) {
		oilCount -= liter;
		this.money += 6000 * liter;
		return 6000 * liter;
	}
	
	public void ShowInfo( ) {
		System.out.println(adress+"������ �����Ҵ� "+ oilCount+"��ŭ�� �⸧�� �����Ͽ��� �ܾ���"+money+"�Դϴ�");
	}
}
