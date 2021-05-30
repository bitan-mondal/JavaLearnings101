package tutorials.objectClassConcepts;

class CalcThis
{
	//Variables
	//Instance Scope
	int num1;
	int num2;
	int result;
	
	//Constructor
	//Local scope (Local variable shadows the instance variable)
	public CalcThis(int num1, int num2)
	{
		this.num1 = num1;
		this.num2 = num2;

	}
	
	public void display()
	{
		System.out.println("The result is: " + result);
	}
}

public class thisDemo {
	public static void main(String[] args) {
		CalcThis obj = new CalcThis(5,5);  //Constructor calling Default
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}
}
