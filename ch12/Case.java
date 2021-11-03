package ch12;

public class Case {

	public static void main(String[] args) {
		int Month=9;
		int Day=0;
		switch(Month) {
		case 1: 
			Day=31;
			break;
		case 2:
			Day=28;
			break;
		case 3:
			Day=30;
			break;
		case 4:
			Day=30;
			break;
		case 5:
			Day=30;
			break;
		case 6:
			Day=30;
			break;
		case 7:
			Day=30;
			break;
		case 8:
			Day=30;
			break;
		case 9:
			Day=30;
			break;
		case 10:
			Day=30;
			break;
		case 11:
			Day=30;
			break;
		case 12:
			Day=30;
			break;
			
		default : System.out.println("꺼져라"); break;
		}
		System.out.println(Month+"월의 일수는 " + Day);
	}

}
