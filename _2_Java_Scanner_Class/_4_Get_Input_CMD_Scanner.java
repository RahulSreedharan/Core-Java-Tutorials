/**
	Getting input from Command line using Java Scanner Class
*/

import java.util.Scanner;

class _4_Get_Input_CMD_Scanner
{
	public static void main(String [] Args)
	{
		int i = 0;
		float f ;
		String s;
		
		Scanner CMD_Input = new Scanner(System.in);
		
		System.out.print("Enter an Integer -> ");
		i = CMD_Input.nextInt();
		
		
		System.out.print("Enter a  Float  -> ");
		f = CMD_Input.nextFloat();
		
		
		System.out.print("Enter a  String  -> ");
		s = CMD_Input.next();
		System.out.println();
		
		System.out.println("Entered Integer - > " +i);
		System.out.println("Entered Float   - > " +f);
		System.out.println("Entered String  - > " +s);
		
	}
}