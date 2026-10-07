package com.nn.week5.lab3;

public class Nurse extends Person {
	
	private String department;
	private String shift;
	
	public Nurse(int personId, String name, int age, String department, String shift) {
		super(personId, name, age);
		this.department = department;
		this.shift = shift;
	}
	
	public void assistPatient() {
		// logic goes here
	}
	
	@Override
	public void performDuties() {
		// logic goes here
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}
}
