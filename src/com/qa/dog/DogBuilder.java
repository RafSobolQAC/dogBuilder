package com.qa.dog;

public class DogBuilder {
//	protected Dog dog;
	private int age = 0;
	private String privates = "";
	private String shade = "";
	private String breed = "";
	private boolean domesticated = false;

	public DogBuilder(int age, String privates, String shade, String breed, boolean domesticated) {
		this.age = age;
		this.privates = privates;
		this.shade = shade;
		this.breed = breed;
		this.domesticated = domesticated;
	}
	
	public DogBuilder() {}
		
	public DogBuilder buildAge(int age) {
		this.age = age;
		return this;
	}
	public DogBuilder buildPrivates(String privates) {
		this.privates = privates;
		return this;

	}
	public DogBuilder buildShade(String shade) {
		this.shade = shade;
		return this;

	}
	public DogBuilder buildBreed(String breed) {
		this.breed = breed;
		return this;
	}
	public DogBuilder buildHouse(boolean domesticated) {
		this.domesticated = domesticated;
		return this;

	}
	
	public Dog build() {
		return new Dog(age, privates, shade, breed, domesticated);
	}
}
