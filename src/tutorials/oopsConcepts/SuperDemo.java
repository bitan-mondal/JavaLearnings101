package tutorials.oopsConcepts;

class A
{
	public A()
	{
		System.out.println("In A");
	}
	
	public A(int i)
	{
		System.out.println("In A int");
	}
}

class B extends A
{
	public B()
	{
		super(5);
		System.out.println("In B");
	}
	
	public B(int i)
	{
		super(i);
		System.out.println("In B int");
	}
}

public class SuperDemo {
	public static void main(String[] args) {
		/*
		 * If we create an object of Sub class or if we call the Parameterized Constructor
		 * of Sub class, it will first call the default constructor of Base class and then 
		 * Parameterized constructor of Sub class
		 */
		/*
		 * This is because the compiler will by default provide a super() in the constructor's
		 * of the Sub class, so if the super() doesn't have any parameters, it will call
		 * the Default Constructor of Base class.
		 */
		/*
		 * If we want to call the Parameterized constructor of Base class from Sub class,
		 * we need to pass the parameter inside super(i)
		 */
		B obj2 = new B();  // To call parameterized constructor of Base from Sub Class Default Constructor
		
		
	}
}
