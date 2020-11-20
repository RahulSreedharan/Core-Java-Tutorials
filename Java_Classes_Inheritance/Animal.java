class Animal
{
	int Weight = 0;
	String Food = "Nothing";
	
	Animal() //Default constructor
	{
		Weight = 10;
		Food   = "Animal_Food";
	}
	
	Animal(int Weight,String Food)
	{
		this.Weight = Weight;
		this.Food   = Food;
	}
	
	void Eats() //void method
	{
		System.out.printf("Class Animal:I am Eating %s\n",Food);
	}
}