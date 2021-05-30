package tutorials.oopsConcepts;

class A1
{
	public void show()
	{
		System.out.println("In A");
	}
}

class B1 extends A1
{
	//@Override helps us to find the error at compile time
	@Override
	public void show()
	{
		// super is a keyword, used to represent our Super class method and objects
		super.show();
		System.out.println("In B");
	}
}

public class OverridingDemo {
	public static void main(String[] args) {
		B1 obj = new B1();
		/*
		 *  It will check if Class B has a method show(), if it's there, then it will call the class B method
		 *  else, it will got to class A and check for show() in Class A, it found, it will call show()
		 */
		
		/*
		 *  And if we have same method in both the Base class and Derived Class, then Derived class
		 *  method will override the Base class method, this is method overriding
		 */
		
		obj.show();
	}
}
