package acessmodifierp1;

//within class we can access all access modifier

 public class Sample1 {
	public int a_public;
	protected int b_protected;
	int c_default;
	private int d_private;

	public static  void display() {
		System.out.println("static public");
	}

	protected void getdata() {
		System.out.println("protected");

	}

	private void showdata() {
		System.out.println("private");

	}

	void print() {
		System.out.println("default");

	}

	public static void main(String[] args) {
		/*Sample1 sample = new Sample1();
		sample.display();
		sample.getdata();
		sample.showdata();
		sample.print();
		System.out.println("a_public" +sample.a_public);
		System.out.println("b_protected" + sample.b_protected);
		System.out.println("c_default "+ sample.c_default);
		System.out.println("d_private" +sample.d_private);

		

	}
*/
}
}
