package Excersies;

public class Abstract2 extends Abstract1 {
	@Override
	public void show() {
System.out.println("public");		
	}

	@Override
	void getvalue() {
		System.out.println("default");		
		
	}

	@Override
	protected void print() {
		System.out.println("protected");		
		
	}
	public static void main(String[] args) {
		Abstract2 sam=new Abstract2();
		sam.show();
		sam.getvalue();
		sam.print();
		sam.display();

	}

	
	

}
