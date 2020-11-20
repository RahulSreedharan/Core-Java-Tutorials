import java.io.FileOutputStream;
import java.io.File;

public class FileOutputStream_Eg
{
	public staic void main(String[] Args)
	{
		String TextString = "Hello from Java IO Streams";
		String FileName   = "output.txt";
		
		
		File TxtFileHandle = new File(FileName);// a handle for creating the text file
		
		//Create the File in the hard drive
		try
		{
			if(TxtFileHandle.createNewFile())
			{
				System.out.println("File creation Successful");
			}
			else
			{
				System.out.println("Error! in File creation");
			}
		}
		catch(Exception E )
		{
			System.out.println(E.getMessage());
		}
		
		// Create,connect and write to the outputstream 
		try
		{
			FileOutputStream OutputTextStream = new FileOutputStream(FileName);
			for(String t :TextString)
				 OutputTextStream.write(t);
			
		}
        }
}
