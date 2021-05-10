package Encapsulation;
// encapsulation we use has a relationship we view ,modify and print the values of private variable in other class.
public class EncapSample1 {

	private int age;
	private String name;

	public void set(int a, String b) {
		age=a; //instance variable should be in left side
		name=b;
	}

	public void get() {
		age = age * 10;
		System.out.println("age is " + age);
		System.out.println("name is " + name);

	}

}
