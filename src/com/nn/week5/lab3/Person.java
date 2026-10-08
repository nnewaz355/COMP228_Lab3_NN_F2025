package com.nn.week5.lab3;

public class Person {
	private int personId;
	private String name;
	private int age;
	
	public Person(int personId, String name, int age) {
		//super();
		this.personId = personId;
		this.name = name;
		this.age = age;
	}

	public void performDuties() {
		System.out.println("Write duties of person");
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Person ID: " + this.personId + "\nName: " + this.name + "\nAge: " + this.age;
	}
}
