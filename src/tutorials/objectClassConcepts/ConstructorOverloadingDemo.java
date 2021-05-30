package tutorials.objectClassConcepts;

class Algorin{
	
	int num1;
	int num2;
	String ops;
	public Algorin()
	{
		num1 = 0;
		num2 = 0;
		ops = "Nothing";
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(ops);
	}
	
	public Algorin(int i)
	{
		num1 = i;
		num2 = 0;
		ops = "Nothing";
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(ops);
	}
	
	public Algorin(int i, int j)
	{
		num1 = i;
		num2 = j;
		ops = "Nothing";
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(ops);
	}
	
	public Algorin(int i, int j, String ops)
	{
		num1 = i;
		num2 = j;
		this.ops = ops;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1+num2);
		System.out.println(ops);
	}
}

public class ConstructorOverloadingDemo {
	public static void main(String[] args) {
		Algorin obj1 = new Algorin();
		
		Algorin obj2 = new Algorin(2);
		
		Algorin obj3 = new Algorin(3,4);
		
		Algorin obj4 = new Algorin(5,7,"add");
		
	}
}
