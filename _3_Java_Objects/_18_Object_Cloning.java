// Cloning Example in Java 

public class _18_Object_Cloning
{
	public static void main(String[] Args)
	{
		Employee Emp1 = new Employee("Anthony", "Martinez");
		Emp1.SetSalary(4000.89);
		
		Employee Emp2 = (Employee)Emp1.Clone();
		
		System.out.println("Employee1 = " + Emp1.toString());
		
		System.out.println("Employee2 = " + Emp2.toString());
	}
}

class Employee
{
	private String FirstName;
	private String LastName;
	
	private Double Salary;
	
	public Employee(String FirstName,String LastName)
	{
		this.FirstName = FirstName;
		this.LastName  = LastName;
	}
	
	public String GetLastName()
	{
		return this.LastName;
	}
	
	public void SetLastName( String lastname)
	{
		this.LastName = lastname;
	}
	
	public String GetFirstName()
	{
		return this.FirstName;
	}
	
	public void SetFirstName( String firstname)
	{
		this.FirstName = firstname;
	}
	
	public Double GetSalary()
	{
		return this.Salary;
	}
	
	public void SetSalary(Double Salary)
	{
		this.Salary = Salary;
	}

	public Object Clone()
	{
		Employee Emp = new Employee(this.FirstName,this.LastName);
		Emp.SetSalary(this.Salary);
		return Emp;
	}
	
	public String toString()
	{
		return this.getClass().getName() + "[" + this.FirstName + " " + this.LastName + ";" + this.Salary + "]";
	}
}