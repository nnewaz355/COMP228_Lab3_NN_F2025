package com.nn.week5.lab3;

/*
 * Doctor is the child
 * Person is the parent
 */

public class Doctor extends Person {
	
	private String specialization;
	private double consultationFee;
	
	public Doctor(int personId, String name, int age, String specialization, double consultationFee) {
		super(personId, name, age);
		// TODO Auto-generated constructor stub
		this.specialization = specialization;
		this.consultationFee = consultationFee;
	}
	
	public void diagnosePatient() {
		// logic goes here
		
	}
	
	@Override
	public void performDuties() {
		// logic goes here
	}

}
