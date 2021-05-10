package Inheritance;

public class HiraricalInheritanceC extends HieraricalInheritanceA{
	void getdata()
	{
		System.out.println("Child class-2");
	}

	public static void main(String[] args) {
		//HiraricalInheritanceB B=new HiraricalInheritanceB();
		HiraricalInheritanceC D=new HiraricalInheritanceC();
		D.getdata();
		D.show();

		// TODO Auto-generated method stub

	}

}
