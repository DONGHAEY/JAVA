package ch08;

public class TypeConversion {

	public static void main(String[] args) {
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int sum1 = (int)dNum + (int)fNum;
		
		System.out.println(sum1);
		
		int sum2 = (int)(dNum + fNum);
		
		System.out.println(sum2);
	
		
	}

}
