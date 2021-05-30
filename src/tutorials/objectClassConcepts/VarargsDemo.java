package tutorials.objectClassConcepts;

class Calcu{
	public int add(int ... n)  //Variable Length Arguments {4,5,5,2,6,8,9}
	{
		int sum = 0;
		for(int i : n)
		{
			sum += i;
		}
		return sum;
	}
}

public class VarargsDemo {
	public static void main(String[] args) {
		Calcu obj = new Calcu();
		
		System.out.println(obj.add(4,5,5,2,6,8,9));
		
	}
}
