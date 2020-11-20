

public class _6_Interface_Uses
{
	public static void main(String[] Args)
	{
		Car MyCar = new Car();
		MyCar.RunsOn();
		MyCar.Start_Engine();
		MyCar.Shift_Gear(5);
		MyCar.Accelerate();
		
	}
}

class Vehicle
{
	int Tyre = 0 ;
	int Doors = 2;
	
	void RunsOn()
	{
		System.out.println("Runs on Fuel");
	}
}

class Car extends Vehicle implements Drivable
{
	void RunsOn()
	{
		System.out.println("Car Runs on Petrol");
	}
	
	
	// Interface implementation
	public boolean Start_Engine()
	{
		System.out.println("Car Started");
		return true;
	}
	
	public int Shift_Gear(int gear)
	{
		System.out.println("Gear Changed to " + gear);
		return gear;
	}
	
	public double Accelerate()
	{
		System.out.println(" Car Accelerated to 2.6");
		return 2.654;
	}
	
}

interface Drivable
{
	boolean Start_Engine();
	int Shift_Gear(int gear);
	double Accelerate();
	
}