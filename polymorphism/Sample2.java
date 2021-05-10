package polymorphism;

public class Sample2 extends Sample1 {
	static void m2()
	{
		
		System.out.println("static_morph");

	}
	void m1()
	{
		super.m1();
		super.m2();
		System.out.println("poly");
	}
	

	public static void main(String[] args) {
	Sample2 sample=new Sample2();
		sample.m1();
		//Sample2.m1();
		//Sample1.m1();
	}

}
