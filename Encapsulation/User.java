package Encapsulation;

import java.util.Scanner;

public class User {
	Scanner sc = new Scanner(System.in);
	private int pin;
	static int number;

	public void data() {
		System.out.println("Enter a pin");
		number = sc.nextInt();
	}

	public void get() {
		this.data();
		pin = number;
		System.out.println("Atm pin is " + pin);
		if (number == pin) {
			System.out.println("Entered  pin is valid");
		} else {
			System.out.println("not valid");
		}
	}
}