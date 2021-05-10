package SuperKeyword;

public class ChildClass extends ParentClass {
	public void child() {
		super.parent(); //Super is used to call method,variables,constructor from parent class

		System.out.println("Child class");
		//System.out.println(super.b);
		this.show(); // this will use to call method,variable of a method in another method in same class
		//System.out.println(super.c);

	}

	public void show() {
		System.out.println("show");
	}
	ChildClass()
	{
		//super();
		System.out.println("Constructor in ChildClass");
	}
	

	public static void main(String[] args) {
		ChildClass child = new ChildClass();
		child.child();
		// child.parent();
	}

}
