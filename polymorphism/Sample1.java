package polymorphism;

// Static method can't override,bcoz static method is called by class name no need to create object.Cant use super for static method.
//Override must need two class(parent class & child class) to perform,but overload will perform within same class also static method can overload.
//public-load,ride.
//private-load
//default-load,ride
//protected- load,ride
//final methods can overload,but can't override.

public class Sample1 {
	
	static void m2()
	{
		System.out.println("static_poly");
	}
	

 void m1()
	{
	 
		System.out.println("poly1");
	}
	
}
