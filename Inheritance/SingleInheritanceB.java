package Inheritance;
class SingleInheritanceB extends SingleInheritanceA {
//int a=20,b=30;
	void show()
	{
		
		int c=a+b;
		//System.out.println("Child class");
		System.out.println(c);


	}
		public static void main(String[] args) {

			SingleInheritanceB b=new SingleInheritanceB();
			b.show();
			b.display();
			//b.getdata();
			int e=b.b;
			System.out.println(e);

			//SampleInheritance.getdata();
			System.out.println(d);
		}

	}


