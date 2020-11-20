// Using Static Inner classes

public class _12_Static_InnerClass
{
	public static void main (String[] Args)
	{
		Animal.AnimalProperties AniProp = new Animal.AnimalProperties();
		
		AniProp.Legs();
		AniProp.Species();
	}
}

class Animal // Main class
{
	static int Legs = 4;     //declared static so that inner class can access them
	static String Species = "Canine";
	int head = 1;
	
	static class AnimalProperties //Static inner class
	{
		void Legs()
		{
			System.out.println("Legs = " + Legs);
		}
		
		void Species()
		{
			System.out.println("Species = " + Species);
		}
		
	}
}