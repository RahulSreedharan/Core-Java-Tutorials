/**
	java console operations using System.out.println();

*/


import java.lang.*;
import java.util.*;

class _1_Console_Println_Output
{
	public static void main(String[] Args)
	{
		int    i = 255;
		double d = 3.142857142857143;
		String s = "Hello from Java";
		
		System.out.println();
		
		System.out.print("System.out.print"); 		// Do not add a line break at the end
		System.out.println("System.out.println");	//        Adds a line break at the end
		
		System.out.println();
		
		System.out.println("Integer i = " +i);
		System.out.println("Double  d = " +d);
		System.out.println("String  s = " +s);
	}
}