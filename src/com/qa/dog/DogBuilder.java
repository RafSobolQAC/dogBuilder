package com.qa.dog;

public class DogBuilder {
//	protected Dog dog;
	private int age = 0;
	private String privates = "";
	private String shade = "";
	private boolean domesticated = false;

	public DogBuilder(int age, String privates, String shade, boolean domesticated) {
		this.age = age;
		this.privates = privates;
		this.shade = shade;
		this.domesticated = domesticated;
	}
	
	public DogBuilder() {}
		
	public void buildAge(int age) {
		this.age = age;
	}
	public void buildPrivates(String privates) {
		this.privates = privates;
	}
	public void buildShade(String shade) {
		this.shade = shade;
	}
	public void buildHouse(boolean domesticated) {
		this.domesticated = domesticated;
	}
	
	public Dog build() {
		return new Dog(age, privates, shade, domesticated);
	}
}
