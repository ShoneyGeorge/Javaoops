package SuperKeyword;

public class Super2 extends Super1 {
	void get()
	{
       super.show();
        super.getdata();
		System.out.println("get");

	}

	//Super2() {
	//	super();

	//	System.out.println("Show 2");

	//}

	public static void main(String[] args) {
		Super2 sup = new Super2();
		sup.show();
		//sup.super1();
		
	}

}
