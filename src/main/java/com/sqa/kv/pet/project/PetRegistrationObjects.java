/**
 *
 */
package com.sqa.kv.pet.project;

/*
 * Create a Pet class. Create the variables type, name, age, hasRabies, petCosts, and gender for the Pet Class.
 * Create a constructor which assigns default values for the Pet class.
 * Override the toString method with more meaningful output (Use option in Menu, Source > Generate toString().
 * Create the methods makeSound(), eat(), and move() using System.out calls to console.
 */
public class PetRegistrationObjects
{
	// create private variable to store pets informations
	private String type;
	private String name;
	private int age;
	private boolean hasRabies;
	private double petCosts;
	private char gender;

	// default constructor
	public PetRegistrationObjects()
	{
		this.type = "none";
		this.name = "none";
		this.age = 0;
		this.hasRabies = false;
		this.petCosts = 0;
		this.gender = 'm';
	}

	// constructor based on created variables
	public PetRegistrationObjects(String type, String name, int age, boolean hasRabies, double petCosts, char gender)
	{
		super();
		this.type = type;
		this.name = name;
		this.age = age;
		this.hasRabies = hasRabies;
		this.petCosts = petCosts;
		this.gender = gender;
	}

	// eat method
	public void eat()
	{
		System.out.println(this.getName() + " ate the whole spoon of cinnamon ewww.");
	}

	// generate getters and setters based on created pet variables
	public int getAge()
	{
		return this.age;
	}

	public char getGender()
	{
		return this.gender;
	}

	public String getName()
	{
		return this.name;
	}

	public double getPetCosts()
	{
		return this.petCosts;
	}

	public String getType()
	{
		return this.type;
	}

	public boolean isHasRabies()
	{
		return this.hasRabies;
	}

	// make sound method
	public void makeSound()
	{
		System.out.println(this.name + " makes a funny sound while thinking about something.");
	}

	// move method
	public void move()
	{
		System.out.println(
				"\"I like it move it, move it\" is " + this.getName() + "'s favorite song to listen while running.");
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public void setGender(char gender)
	{
		this.gender = gender;
	}

	public void setHasRabies(boolean hasRabies)
	{
		this.hasRabies = hasRabies;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPetCosts(double petCosts)
	{
		this.petCosts = petCosts;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	@Override
	public String toString()
	{
		return "\nRegistering a pet: \npet's type: " + this.type + "; \npet's name: " + this.name + ";\npet's age: "
				+ this.age + "; \ndid the pet had Rabies shot? " + this.hasRabies + "; \nprice paid for the pet: "
				+ this.petCosts + "; \npet's gender: " + this.gender + ".";
	}
}
