package multipleinheritance;

public class Sample implements Sample2 {


	@Override
	public void display() {
System.out.println("Display");		
	}

	@Override
	public void show() {
		System.out.println("Show");		
		
	}

	public static void main(String[] args) {
		Sample s =new Sample();
		s.display();
		s.show();
	}

}
