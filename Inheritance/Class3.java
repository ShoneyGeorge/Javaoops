package Inheritance;

public class Class3 extends Class2 {

	void salarySlip() {

		System.out.println("salary by hand :");
	}

	public static void main(String[] args) {
		Class3 a = new Class3();
		System.out.println("Salary Slip");
		a.Pay();
		System.out.println("Bonus :" + a.bonus);
		System.out.println("Deduction :" + a.deduction);
		a.hraPf();
		a.salarySlip();

	}
}
