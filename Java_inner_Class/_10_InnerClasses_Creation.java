// Inner class Creation and properties in Java

public class _10_InnerClasses_Creation
{
	public static void main(String[] Args)
	{
		Animal Monkey  = new Animal();
		Monkey.Breed();  //Outer class Method 
		
		System.out.println(Monkey.head);
		//System.out.println(Monkey.legs); //unable to access private
		
		Animal.Brain  MonkeyBrain = Monkey.new Brain();
		
		MonkeyBrain.Thinking();
		//MonkeyBrain.Breed();
	}
}

class Animal //Outer Class Animal
{
	private int legs = 4;
	int head = 1;

		class Brain // Inner Class Brain
		{
			int Lobes = 4;
			
			 void Thinking()
			{
				System.out.println("Brain is Thinking.....");
				//void Breed();
			}
		}
		
	void Breed()
	{
		System.out.println("Animal can Breed");
	}
	
}