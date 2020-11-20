// Exceptions in Java
// Checked Exceptions 

import java.io.*;

public class _15_Exceptions_Checked
{
	public static void main(String []Args)
	{
		//calling method have to deal with the exception
		try
		{
			openFile("File.txt");
		}
		catch(Exception e)
		{
			
		}
	}
	
	static void openFile(String FileName) throws FileNotFoundException,IOException
	{
		FileInputStream f = new FileInputStream(FileName);
	}
}