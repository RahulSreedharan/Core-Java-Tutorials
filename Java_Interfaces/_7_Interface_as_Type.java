

public class _7_Interface_as_Type
{
	public static void main(String[] Args)
	{
		Car MyCar = new Car();
		Bus MyBus = new Bus();
		
		Drivable MyDrivable ; //Interface as a type.
		
							  //Drivable MyDrivable = new Drivable() cannot be instantiated 
							  
		MyDrivable = MyBus;  //Assigning MyBus to Mydrivable interfacetype
		
		MyDrivable.Start_Engine();
		MyDrivable.Accelerate();
		MyDrivable.Shift_Gear(23);
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

class Bus extends Car
{
	
}

interface Drivable
{
	boolean Start_Engine();
	int Shift_Gear(int gear);
	double Accelerate();
	
}