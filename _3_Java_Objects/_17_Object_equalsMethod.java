// using equals() method to compare two objects

public class _17_Object_equalsMethod
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee("Martinez", "Anthony");
		Employee emp2 = new Employee("Martinez", "Anthony");

		if (emp1.equals(emp2))
				System.out.println("These employees are the same.");
		else
				System.out.println("These are different employees.");
	}
}

class Employee 
{
	private String lastName;
	private String firstName;
	
	public Employee(String lastName, String firstName)
	{
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}

	public String getFirstName()
	{
		return this.firstName;
	}
	
	public boolean equals(Object obj) 
	{

		if (this == obj) // an object must equal itself
			return true;
			

		if (this == null) // no object equals null
			return false;

		if (this.getClass() != obj.getClass()) // objects of different types are never equal
			return false;

			
		Employee emp = (Employee) obj;// cast to an Employee, then compare the fields
		
		return (this.lastName.equals(emp.getLastName()) && this.firstName.equals(emp.getFirstName()));
	}
}
