//Author: Ana Victoria Gomes Mantovani
//Date: 10/15/2022
//Purpose: Classify different pets by age, animal and name

import java.util.Scanner;
public class PetDemo {

	public static void main(String[] args) 
	{
		Pet dog = new Pet("Max", "dog", 5);
		Pet cat = new Pet("Sylvester", "cat", 13);
		Pet bird = new Pet("Sparkly", "bird", 7);

		System.out.println("Animal #1:");
		System.out.println("The pet name is: " + dog.getName());
		System.out.println("The pet animal type is: " + dog.getAnimal());
		System.out.println("The pet age is: " + dog.getAge());
		System.out.println(dog.getName() + " is a " + dog.getAnimal() + " and is " + dog.getAge() + " years old.");
		System.out.println();
		
		System.out.println("Animal #2:");
		System.out.println("The pet name is: " + cat.getName());
		System.out.println("The pet animal type is: " + cat.getAnimal());
		System.out.println("The pet age is: " + cat.getAge());
		System.out.println(cat.getName() + " is a " + cat.getAnimal() + " and is " + cat.getAge() + " years old.");
		System.out.println();
		
		System.out.println("Animal #3:");
		System.out.println("The pet name is: " + bird.getName());
		System.out.println("The pet animal type is: " + bird.getAnimal());
		System.out.println("The pet age is: " + bird.getAge());
		System.out.println(bird.getName() + " is a " + bird.getAnimal() + " and is " + bird.getAge() + " years old.");

	}

}
