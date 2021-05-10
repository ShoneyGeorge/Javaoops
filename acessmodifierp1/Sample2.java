package acessmodifierp1;

// private can only access within class, but all can access in other classes in same packages.

public class Sample2 extends Sample1 {

	public static void main(String[] args) {
Sample2 samples=new Sample2();
Sample1.display();
//samples.display();
samples.print();
samples.getdata();
//samples.showdata();
System.out.println("a_public" +samples.a_public);
System.out.println("b_protected" + samples.b_protected);
System.out.println("c_default "+ samples.c_default);
//System.out.println("d_private" +samples.d_private);

	}

}
