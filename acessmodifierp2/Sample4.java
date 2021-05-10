package acessmodifierp2;

import acessmodifierp1.Sample1;

//protected can access within class,within package but outside package only can access through subclass,that means if  we  extends.
 

public class Sample4  {
	//public class Sample4 extends Sample1 {

	public static void main(String[] args) {
Sample1 obj=new Sample1(); //Aggregation- we can use within & outside package.
//Sample4 obj=new Sample4(); 

obj.display();
//obj.getdata();
//obj.showdata();
//obj.print();
	}

}
