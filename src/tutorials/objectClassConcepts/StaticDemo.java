package tutorials.objectClassConcepts;

class Employee{
	int empID;
	int salary;
	static String ceo;
	
	
	public void show()
	{
		System.out.println(empID + " : " + salary + " : " + ceo);
	}
	
}

public class StaticDemo {
	public static void main(String[] args) {
		
		//If we want to call a main method, we don't need object, so we can make it static
		//For non static variable. it is mandatory to use object name
		//For static variable, we prefer to use Class name
		
		Employee bitan = new Employee();
		bitan.empID = 123;
		bitan.salary = 4000;
		Employee.ceo = "mallick";
		
		
		Employee subham = new Employee();
		subham.empID = 234;
		subham.salary = 5000;
		Employee.ceo = "mallick";
		
		Employee.ceo = "John";
		
		bitan.show();
		subham.show();
	}
}
