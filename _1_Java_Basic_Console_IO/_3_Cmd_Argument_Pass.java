
/**
	Passing Command line Arguments to java programs
	
	c:\>java _3_Cmd_Argument_Pass Argument1 Argument2 Argument3
	
*/

import java.util.*;

class _3_Cmd_Argument_Pass
{
	public static void main() //public static void main(int[] Args) not allowed Why?
	
	{
		int i = 0;
		
		for(i = 0; i < Args.length;i++)
			System.out.printf("Args[%d] -> %s\n",i,Args[i]);
	}
}