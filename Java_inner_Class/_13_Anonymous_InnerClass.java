// Creating Anonymous Inner classes

public class _13_Anonymous_InnerClass
{
	public static void main(String[] Args)
	{
		AnonClass AnonC = new AnonClass()
		{
			public void SomeMethod()
			{
				System.out.println("SomeMethod();");
			}
			
		};
		
		AnonC.SomeMethod();
		System.out.println(AnonC.x);
	}
}

interface AnonClass
{
	int x = 0 ; //x is public
	void SomeMethod();
}

