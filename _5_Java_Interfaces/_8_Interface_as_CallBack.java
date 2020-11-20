// Interface as Call backs

import java.awt.event.*;
import javax.swing.*;

public class _8_Interface_as_CallBack
{
	public static void main(String[] Args)
	{
		Timer t = new Timer(1000,new Ticker()); // create a timer that calls the Ticker class at one second intervals
		t.start(); // Start the timer
		
		JOptionPane.showMessageDialog(null,"Click OK to exit program"); // display a message box to prevent the program from ending immediately
	
	}
}

class Ticker implements ActionListener 
{
	private boolean tick = true;
	
	public void actionPerformed(ActionEvent event) 
	{
		if (tick)
			{
				System.out.println("Tick..."); 
			}
		else
			{
				System.out.println("Tock...");
			}
		tick = !tick; 
	}
}

