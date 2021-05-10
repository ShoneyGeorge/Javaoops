package Inheritance;

public class MultilevelInheritanceC extends MultilevelInheritanceB {
	void getdata()
	{
		System.out.println("Second child class");
	}

	public static void main(String[] args) {
	
		MultilevelInheritanceC A=new MultilevelInheritanceC();
		A.display();
		MultilevelInheritanceB.show();
		//A.show();
		A.getdata();
	}

}
