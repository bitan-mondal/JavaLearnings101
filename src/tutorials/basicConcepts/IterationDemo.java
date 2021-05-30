package tutorials.basicConcepts;

public class IterationDemo {
	public static void main(String[] args) {
		
		/*
		 * while, do while, for, for-each
		 */
		
		// while
		int a=0;
		while(a<2)
		{
			System.out.println("Hello");
			a++;
		}
		
		// do while --Since the condition is checked later, it will execute the program at least once
		int b = 0;
		do 
		{
			System.out.println("Hello.");
			b++;
		}
		while(b<2);
		
		
		// for loop
		for(int c=0; c<2; c++)
		{
			System.out.println("Hello!");
		}
		
		// Nested Loops
		/*
		 * * * *
		 * * * *
		 * * * *
		 */
		int alphabet = 65;
		
		for(int d = 0; d<=5; d++)
		{
			for(int e = 0; e<=d; e++)
			{
				System.out.print((char) (alphabet + e) + " ");
			}
			System.out.println();
		}
		
		
	}

}
