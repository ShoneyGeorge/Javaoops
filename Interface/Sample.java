package Interface;

public class Sample implements Sampleinterface{

	void display()
	{
		System.out.println("parent class");

	}

	@Override
	public void print() {
System.out.println("child class");
	}
	public static void main(String[] args) {
		Sampleinterface s=new Sample();
		s.print();
		System.out.println(a);
	}
}
