package polymorphism;

import java.util.Scanner;

/* Program to calculate discount If customer purchase clothes on Offseason, set discount 15% and on Onseason 40%
 Should use two classes, Onseason and Offseason
 Use two methods- discount(method name should be same)*/

public class Onseason {

	void clothes()

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price");
		int a = sc.nextInt();
		double b = a * .4;
		System.out.println("onseason  Discount price - " + b);
		System.out.println("onseason  price - " + (a - b));

	}

}
