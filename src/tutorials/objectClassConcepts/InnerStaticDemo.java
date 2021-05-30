package tutorials.objectClassConcepts;

/*
 * Inner Class
 * 	- Member Class
 *  - Static Class
 *  - Anonymous Class
 */

class Outer1
{
	static int a;
	
	public static void show()
	{
		System.out.println("Outer Show.");
	}
	
	static class Inner1	
	{
		public void display()
		{
			System.out.println("Inner Display.");
		}
	}
}

public class InnerStaticDemo {
	public static void main(String[] args) {
		Outer1 obj = new Outer1();
		obj.show();
		
		// In case of static methods and static Inner class, we need Outer class to access the methods of Inner class
		Outer1.Inner1 obj1 = new Outer1.Inner1();
		obj1.display();
		
		
		
	}

}
