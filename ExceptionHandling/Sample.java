package ExceptionHandling;

public class Sample {
	int[] c = { 2, 3, 4 };
	int b, a = 10;

	void display() {
		int a = 10;
		System.out.println(a);
		try {

			b = a / 0;
			System.out.println(b);
		} 
		catch (Exception e) {

			System.out.println(e);

		}
	}
		void show()
		{
		try {
			c[4] = 10;

		} catch (Exception e) {

			System.out.println(e);

		}
		
		finally {
			System.out.println("the end");

		}
		
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.display();
		s.show();
	}

}
