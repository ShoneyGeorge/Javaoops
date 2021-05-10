package SuperKeyword;

public class Sample2 extends Sample1 {
	int a_parent = 10;
	Sample2() {
		System.out.println("Child class Construcor");
}
void child() {
		System.out.println("Child class Method1");

	}

	void child2() {
		super.parent2();
		System.out.println(super.a_parent);

		this.child();
		System.out.println("Child class Method2");

	}

	public static void main(String[] args) {
Sample2 sample=new Sample2();
sample.child2();
System.out.println(sample.a_parent);
	}

}
