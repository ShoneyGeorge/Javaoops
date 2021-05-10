package This;

public class Sample {
	int a,b;
	void display()
	{
		System.out.println("display");
	}
	static void getData()
	{
		System.out.println("Getdata");
	}
	void show(int a,int b)
	{
		this.display();
		this.a=a;
		this.b=b;
		this.getData();
		System.out.println("Show");
		System.out.println(a);
		System.out.println(b);

	}
Sample()
{
	System.out.println("first constructor");
}
Sample(int a)
{
	this();
	System.out.println("Second constructor");

}
	public static void main(String[] args) {
Sample s=new Sample(10);
s.show(20, 30);

	}

}
