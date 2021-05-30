package tutorials.basicConcepts;

public class OperatorDemo {
	/*
	 *	Arithmetic -> +, -, *, /, % 
	 *	Bitwise - ||, &&
	 *	Relational
	 *	Logical  
	 */
	
	public static void main(String[] args) 
	{
		// Arithmetic Operators
//		int m=6, n=4;
//		int r1 = m+n;
//		int r2 = m-n;
//		int r3 = m*n;
//		double r4 = (double)m/n; //Gives quotient
//		int r5 = m%n;  //Gives remainder
//		
//		System.out.println(r1);
//		System.out.println(r2);
//		System.out.println(r3);
//		System.out.println(r4);
//		System.out.println(r5);
		
		// Short hand increment operator
		int i = 5;
		int j = 10;
		
		//j += 1;
		
		j = ++i;
		
		System.out.println(j);
		
	}
}
