package Abstraction;

public abstract class Exe {
	public  abstract void getdata();
	public void print()
	{
		this.getdata();
		System.out.println("Print");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
