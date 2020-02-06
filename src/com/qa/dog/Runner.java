package com.qa.dog;

public class Runner {
	public static void main(String[] args) {
		DogBuilder dogBuild = new DogBuilder();
		dogBuild.buildAge(5);
		dogBuild.buildHouse(true);
		dogBuild.buildPrivates("boi");
		dogBuild.buildShade("dark red slash yellow");
		
		Dog dog = dogBuild.build();
		System.out.println(dog.getAge());
	}
}
