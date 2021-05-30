package tutorials.oopsConcepts;

// IS-A - When one class extends another class (AdvCalc)
// HAS-A - When one class has an object of another class (InheritanceDemo)

class Base
{
	
	public int add(int i, int j)
	{
		return i+j;
	}
}

class AdvCalc extends Base
{	
	public int subtract(int i, int j)
	{
		return i-j;
	}
}

class SuperAdvCalc extends AdvCalc
{
	public int multiply(int i, int j)
	{
		return i*j;
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
//		Base obj = new Base();
//		
//		int result = obj.add(2, 3);
		
//		AdvCalc obj1 = new AdvCalc();
//		int result1 = obj1.add(2, 4);
//		int result2 = obj1.subtract(6,4);
//		
//		System.out.println(result1);
//		System.out.println(result2);
		
		SuperAdvCalc obj2 = new SuperAdvCalc();
		
		int res1 = obj2.add(2, 3);
		int res2 = obj2.subtract(4,1);
		int res3 = obj2.multiply(3,5);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}

}
