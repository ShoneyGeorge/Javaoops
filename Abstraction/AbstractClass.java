package Abstraction;

public abstract class AbstractClass {
	//0-100%  data hiding is possible,bcoz only abstract method details is hided non abstract method can access from an abstract class.
	public abstract void show();
	
public void display()
{
	this.show();
	System.out.println("Non Abstract Method");
}
}

