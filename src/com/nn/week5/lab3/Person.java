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
}
