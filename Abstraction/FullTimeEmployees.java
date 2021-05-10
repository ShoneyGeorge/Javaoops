package Abstraction;

public class FullTimeEmployees extends Employee {
	public void calculateSalary() {
		int hours = 8;
		int totalsalary = salaryperhour * hours;
		System.out.println("The total Salary for fulltime  Employee " + totalsalary);
	}

	public static void main(String[] args) {
		FullTimeEmployees emp = new FullTimeEmployees();
		emp.calculateSalary();
	}

}
