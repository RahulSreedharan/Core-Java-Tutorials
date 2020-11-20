// Exceptions in Java
// Divide by Zero Error 


public class _14_Exceptions_DivideByZero
{
	public static void main(String[] Args)
	{
		int a,b,c;
		a = 9;
		b = 0;
		c = 0;
		
		try
		{
			c = a/b; //Divide by Zero
		}
		catch (Exception e)
		{
			// Different ways to print Exception Information in Java
			System.out.println("Exception occured - " + e + "\n");  // Normal
			e.printStackTrace();                                                      // using printStackTrace() Method
			System.out.println("Exception occured - " + e.toString() + "\n");         // using toString() Method
			System.out.println("Exception occured - " + e.getMessage() + "\n");       // using getMessage() Method   
			
			
		}
	}
}