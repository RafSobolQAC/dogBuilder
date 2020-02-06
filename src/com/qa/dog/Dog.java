package com.qa.dog;

public class Dog {
	private int age = 0;
	private String privates = "";
	private String shade = "";
	private String breed = "";
	private boolean domesticated = false;

	
	public Dog(int age, String privates, String shade, String breed, boolean domesticated) {
		this.age = age;
		this.privates = privates;
		this.shade = shade;
		this.breed = breed;
		this.domesticated = domesticated;
	}
	
	public int getAge() {
		return age;
	}

	public String getPrivates() {
		return privates;
	}

	public String getShade() {
		return shade;
	}

	public boolean isDomesticated() {
		return domesticated;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void setPrivates(String privates) {
		this.privates = privates;
	}
	public void setShade(String shade) {
		this.shade = shade;
	}
	public void setDomesticated(boolean domesticated) {
		this.domesticated = domesticated;
	}
	
	
	
	
	
}
