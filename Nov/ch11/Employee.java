package ch11;

public class Employee {
	String name;
	static int number= 100;
	int employeeNumber;
	public Employee(String name) {
		this.name = name;
		employeeNumber = number;
		number++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
}
