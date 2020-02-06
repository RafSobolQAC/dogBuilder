package com.qa.dog;

public class Runner {
	public static void main(String[] args) {
		DogBuilder dogBuild = new DogBuilder();
		Dog dog = dogBuild.buildAge(5).buildHouse(true).buildPrivates("boi").buildShade("dark red slash yellow").build();
		
		DogBuilder dogSlowlyBuilt = new DogBuilder();
		dogSlowlyBuilt = dogSlowlyBuilt.buildAge(10);
		dogSlowlyBuilt.buildHouse(true);
		Dog dogSlow = dogSlowlyBuilt.build();
		System.out.println(dogSlow.isDomesticated());


		
		System.out.println(dog.getAge());
	}
}
