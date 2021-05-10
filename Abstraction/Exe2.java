package Abstraction;

public class Exe2 extends Exe {
public void getdata()
{
	System.out.println("Non abstract get data");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Exe e=new Exe2();
//e.getdata();
e.print();
	}

}
