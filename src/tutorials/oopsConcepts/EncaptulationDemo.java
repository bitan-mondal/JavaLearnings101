package tutorials.oopsConcepts;

/*
 * Variables should always be private
 * Access variables through methods i.e. Getters and Setters
 * Methods should be public.
 */

/*
 * Encapsulation -> We are binding our data or variables with methods()
 */

class StudentData
{
	private int rollNo;
	private String name;
	
	// Getters and Setters
	
	public int getRollNo() {
		System.out.println("User is accessing RollNo value!");
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
		System.out.println("Value of RollNo changed!");
	}
	public String getName() {
		System.out.println("User is accessing Name value!");
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Value of Name changed!");
	}
}


public class EncaptulationDemo {
	public static void main(String[] args) {
		StudentData obj = new StudentData();
		
		obj.setRollNo(5);
		obj.setName("Bitan Mondal");
		
		System.out.println(obj.getRollNo());
		System.out.println(obj.getName());
	}
}
