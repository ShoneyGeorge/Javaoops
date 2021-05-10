package Encapsulation;

public class Sample2 extends EncapSample1 {
	void show() {
		System.out.println("Sample2");

	}

	public static void main(String[] args) {
		Sample2 s=new Sample2();
		s.show();
		s.set(20, "Tonney");
		s.get();

EncapSample1 sample = new EncapSample1();
	sample.set(10, "Shoney");
		sample.get();
	}

}
