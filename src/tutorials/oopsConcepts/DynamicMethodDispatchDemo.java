package tutorials.oopsConcepts;

class BaseA
{
	public void show()
	{
		System.out.println("In A");
	}
}

class ChildB extends BaseA
{
	public void show()
	{
		System.out.println("In B");
	}
	public void config()
	{
		System.out.println("Config");
	}
}

class ChildC extends BaseA
{
	public void show()
	{
		System.out.println("In C");
	}
}

public class DynamicMethodDispatchDemo {
	
	/* NOTES:
	 * -> Compile Time Polymorphism
	 * -> Run Time Polymorphism
	 */
	
	/*
	 * Since while changing the object results in calling a different method,
	 * so every time it is changing the method, which is called Dynamic Method Dispatch
	 */
	
	/*
	 *  Method Overriding -> Runtime Polymorphism -> Changing Objects results in changng method, 
	 *  which is Dynamic Method Dispatch
	 */
	public static void main(String[] args) {
		
		/*
		 * If we have a reference 'obj' of a Super Class and an Object of Sub class,
		 * we can only call those methods which are declared in Super class or Base class.
		 */
		BaseA obj = new ChildB();  // Run Time Polymorphism
		obj.show();
		
		obj = new ChildC(); 
		obj.show();  // Dynamic Method Dispatch
	}
}
