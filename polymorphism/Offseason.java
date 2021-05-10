package polymorphism;

import java.util.Scanner;

public class Offseason extends Onseason {

	void clothes() {
		super.clothes();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price");
		int a = sc.nextInt();
		double c = a * .15;
		System.out.println("Offseason Discount price - " + c);
		System.out.println("Offseason  price - " + (a - c));

	}

	public static void main(String[] args) {
		Offseason season = new Offseason();
		season.clothes();
	}

}
