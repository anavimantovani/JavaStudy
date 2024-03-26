//Author: Ana Victoria Gomes Mantovani
//Date: 10/15/2022
//Purpose: Classify different pets by age, animal and name

public class Pet 
{
	private String name;
	private String animal;
	private int age;
	
	public void setName(String petName)
	{ name = petName; }
	
	public void setAnimal(String petAnimal)
	{ animal = petAnimal; }
	
	public void setAge(int petAge)
	{ age = petAge; }
	
	public String getName()
	{ return name; }
	
	public String getAnimal()
	{ return animal; }
	
	public int getAge()
	{ return age; }
	
	public Pet(String petName, String petAnimal, int petAge)
	{
		name = petName;
		animal = petAnimal;
		age = petAge;
	}
}

