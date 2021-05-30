package tutorials.objectClassConcepts;


/*
 * With method overloading, multiple methods can have the same name with different parameters.
 */

class Casio{
	
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	
	public void add(int i, int j, int k)
	{
		System.out.println(i+j+k);
	}
	
}

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		Casio obj = new Casio();
		
		obj.add(2, 3);
		
		obj.add(2, 3, 5);
	}
}
