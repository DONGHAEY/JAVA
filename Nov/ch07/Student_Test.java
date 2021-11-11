package ch07;

public class Student_Test {
	String student;
	int sum;
	int num;
	Subject korean;
	Subject math;
	
	public Student_Test(String name, int number) {
		this.student = name;
		this.num = number;
		korean = new Subject();
		math = new Subject();
	}
	public void SetKorean(int score) {
		korean.score = score;
	}
	
	public void showStudentScore() {
		sum = korean.score;
		System.out.println(student + " 의" + sum+ "점 입니다");
	}

}
