package ch07;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_Test choi = new Student_Test("choi", 100);
		Student_Test kim = new Student_Test("kim", 10);
		
		choi.SetKorean(100);
		kim.SetKorean(80);
		
		choi.showStudentScore();
		kim.showStudentScore();
	}

}
