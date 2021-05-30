package tutorials.objectClassConcepts;

//Outer.class
class Outer
{
	//Member variable
	int a;
	
	//Member method
	public void show()
	{
		
	}
	
	// Member Class
	//Outer$Inner.class
	class Inner
	{
		public void diaplay()
		{
			System.out.print("Inner Display");
		}
	}
}

//InnerDemo.class
public class InnerDemo 
{
	// Can have variables, methods, class
	public static void main(String[] args) 
	{
		Outer obj = new Outer();
		obj.show();
		System.out.println();
		
		//We need the outer Class and the object of outer class to access the Inner Class object
		Outer.Inner obj1 = obj.new Inner();
		obj1.diaplay();
	}
}
