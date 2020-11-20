// Tick Tock with an Inner Class - application that implements the Ticker class as an inner class
// Wiley - Java All In One For Dummies - 4th.Edition


import java.awt.event.*;
import javax.swing.*;


public class _11_InnerClass_TickTock
{
	private String tickMessage = "Tick ...";
	private String tockMessage = "Tock ...";
	
	public static void main(String [] Args)
	{
		_11_InnerClass_TickTock t = new _11_InnerClass_TickTock();
		t.go();
	}
	
	private void go()
	{
		// create a timer that calls the Ticker class at one second intervals
		Timer t = new Timer(1000, new Ticker());
		t.start();
		
		// display a message box to prevent the program from ending immediately
		JOptionPane.showMessageDialog(null,"Click OK to exit program");
		System.exit(0);
	}
	
	//---------------------------- Inner Class Ticker ---------------------------//
			class Ticker implements ActionListener
			{
				private boolean tick = true;
	
				public void actionPerformed(ActionEvent event) 
				{
					if (tick)
					{
						System.out.println(tickMessage); 
					}
					else
					{
						System.out.println(tockMessage); 
					}
				tick = !tick;
				}
			}
			
			
} //End of class _11_InnerClass_TickTock

