package tutorials.basicConcepts;

public class SelectionDemo {
	/*
	 * If
	 * Ternary
	 * Switch
	 */
	public static void main(String[] args) {
		// If Else
		int n = 7;
		
		if(n%2!=1)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
		// Ternary Operator
		// ?: Condition?exp1:exp2
		int i = 8;
		int j = 0;
		
//		if(i>6)
//			j = 1;
//		else
//			j = 2;
		
		j = i>6?1:2;
		
		System.out.println(j);
		
		
		// Switch Case
		
		String s = "abc";
		
		switch(s)
		{
		case "A":
			System.out.println("One");
			break;
		case "abc":
			System.out.println("Two");
			break;
		
		default:
			System.out.println("No match!");
		}
		
	}

}
