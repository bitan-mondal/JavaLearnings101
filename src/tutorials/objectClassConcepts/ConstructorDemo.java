package tutorials.objectClassConcepts;

class Calc
{
	//Variables
	int num1;
	int num2;
	int result;
	
	//Constructor
	public Calc()
	{
		num1 = 5;
		num2 = 5;
		result = num1 + num2;
		System.out.println("In Default Constructor.");
	}
	
	//Parameterized Constructor
	public Calc(int n)
	{
		num1 = n;
		num2 = n;
		result = num1 + num2;
		System.out.println("In Parameterized Constructor with single argument.");
	}
	
	//Parameterized Constructor
	public Calc(int i, int j)
	{
		num1 = 2;
		num2 = 3;
		result = (num1 + num2 + i)*j;
		System.out.println("In Parameterized Constructor with multiple arguments.");
	}
	
	//Parameterized Constructor
	public Calc(double d)
	{
		num1 = (int) d;
		result = num1;
	}
	
	public void display()
	{
		System.out.println("The result is: " + result);
	}
}

public class ConstructorDemo {
	public static void main(String[] args) {
		Calc obj1 = new Calc(7.5);  //Constructor calling Default
		obj1.display();
		
		Calc obj2 = new Calc(5);
		obj2.display();
		
		Calc obj3 = new Calc(2,5);
		obj3.display();
	}

}
