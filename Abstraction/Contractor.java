package Abstraction;

public class Contractor extends Employee {
	@Override
	public void calculateSalary() {

		int workinghours = 4;
		int totalsalary = salaryperhour * workinghours;
		System.out.println("The total Salary for contract based Employee " + totalsalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor c = new Contractor();
		c.calculateSalary();
	}
}
