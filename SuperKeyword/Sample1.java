package SuperKeyword;

public class Sample1 {
	int a_parent = 20;

	Sample1() {
		System.out.println("Parent Constructor");
	}

	void parent() {
		System.out.println("Parent class Method1");

	}

	void parent2() {
		System.out.println("Parent class Method2");
this.parent();
	}
}
