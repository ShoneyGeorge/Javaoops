package Inheritance;

// inheritance cad be done for default,public access modifier also we can access static,instance&local variable

public  class SingleInheritanceA {
	 final int a=1;
			 int b=2;static int d=30;
	void display()
	{
		int b=20;
		System.out.println(a+b);

		System.out.println("Parent class");
	}
	static void getdata() {
		System.out.println("Get data");

	}
}
