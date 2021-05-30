package tutorials.objectClassConcepts;

class Calculator
{
	//Variables
	int num1;
	int num2;
	int result;
	
	//method
	public void perform()
	{
		result = num1 + num2;
	}
	
}

public class ObjectDemo {
	public static void main(String[] args) {
		
		/*
			Calculator obj;  //reference
			obj = new Calculator(); //Object by new keyword "new Calculator()"
		*/
		
		Calculator obj = new Calculator(); // obj knows something and obj does something 
		obj.num1 = 3;
		obj.num2 = 5;
		
		obj.perform(); 
		
		System.out.println(obj.result);
		
	}

}
