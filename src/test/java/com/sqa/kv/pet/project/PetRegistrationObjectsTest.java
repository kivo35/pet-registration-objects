package com.sqa.kv.pet.project;

import org.junit.Test;

public class PetRegistrationObjectsTest
{
	@Test
	public void test()
	{
		PetRegistrationObjects cat = new PetRegistrationObjects("cat", "Garfield", 5, true, 1000000, 'M');
		PetRegistrationObjects dog = new PetRegistrationObjects("dog", "Snoopy", 1, true, 53.67, 'M');
		PetRegistrationObjects lizard = new PetRegistrationObjects("lizard", "Crawly", 7, false, 121.89, 'F');

		PetRegistrationObjects[] pets = new PetRegistrationObjects[] { cat, dog, lizard };

		for (PetRegistrationObjects p : pets)
		{
			System.out.println(p);
			System.out.println("Pet moves: ");
			p.move();
			System.out.println("Pet makes sound: ");
			p.makeSound();
			System.out.println("Pet eats: ");
			p.eat();
		}

	}
}
