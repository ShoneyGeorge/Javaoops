package Inheritance;

import java.util.Scanner;

/*  Program to find the total salary by hand of an Employee
· Class 1
Get basic pay, deduction and bonus from console.
· Class 2
Calculate hra (5% of basic pay) and pf (20% of basic pay).
· Class 3
Find the total salary (basicpay+hra-pf-deduction+bonus) and get the salary slip
Salary slip should contains :- basic pay, deduction, hra, pf, bonus and total salary by hand

*/

public class Class1 {
	double payable;
	double bonus;
	double deduction;

	void Pay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic pay ");

		payable = sc.nextLong();
		System.out.println("Enter Bonus");

		bonus = sc.nextLong();
		System.out.println("Enter Deduction");

		deduction = sc.nextLong();

}

	

}
