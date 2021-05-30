package tutorials.basicConcepts;

public class JumpDemo {
	public static void main(String[] args) {
		for(int i=0; i<10; i++)
		{
			if(i==7)
				//continue;
				break;
			System.out.println("Value is " + i);
		}
	}

}
