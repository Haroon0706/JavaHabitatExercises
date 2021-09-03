package com.qa.habitat;


//	Exercise - Animal Habitat exercise
//	Create a new animal class (for a specific type of animal) with at least 4 variables and 1 method
//	Include getters, setters and constructor
//	Create an appropriate habitat class for that animal
//	Habitat class must include the following methods:
//	- Add to habitat
//	- Remove all animals from habitat
//	- Get one variable from all animals (animal.getName())
//	- Run Method of one animal by specifying one of the variables
//	- Remove an animal from the habitat by specifying one of the variables

public class CaveMen {
	
	private String name;
	private String hairColour;
	private int strength;
	private boolean male;
	
	public void swingClubNoise() {
		System.out.println("Whooooooosh!");	
		
	}

	public CaveMen(String name, String hairColour, int strength, boolean male) {
		super();
		this.name = name;
		this.hairColour = hairColour;
		this.strength = strength;
		this.male = male;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHairColour() {
		return hairColour;
	}

	public void setHairColour(String hairColour) {
		this.hairColour = hairColour;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}
	
	

}
