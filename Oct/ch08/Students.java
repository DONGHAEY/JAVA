package ch08;

public class Students {

	public static void main(String[] args) {
		StudentsTest donghyeon = new StudentsTest(3, 4, "dHH");
		StudentsTest mrkim = new StudentsTest(1, 2, "name");
		mrkim.setName("KIM");
		donghyeon.print();
		mrkim.print();
		
	}

}