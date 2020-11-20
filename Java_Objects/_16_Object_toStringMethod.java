// toString() method of Object

class _16_Object_toStringMethod
{
	public static void main (String[] Args)
	{
		Employee Emp = new Employee("Martha","Stewart");
		System.out.println(Emp.toString());
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
	
	@Override
	public String toString()
	{
		return this.getClass().getName() + this.firstName +this.lastName;
	}
}