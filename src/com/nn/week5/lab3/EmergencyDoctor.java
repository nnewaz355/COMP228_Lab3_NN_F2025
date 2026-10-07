package com.nn.week5.lab3;

public class EmergencyDoctor extends Doctor implements MedicalProfessional, Billable {

	public EmergencyDoctor(int personId, String name, int age, String specialization, double consultationFee) {
		super(personId, name, age, specialization, consultationFee);
	}
	
	public void handleEmergency() {
		// logic goes here
		System.out.println(this.getName() + " is handling a medical emergency.");
	}
	
	public void prescribeMedication() {
		// logic goes here
		System.out.println(this.getName() + " is prescribing medication.");
	}
	
	public void generateBill() {
		// logic goes here
		System.out.println(this.getName() + " generated an emergency treatment bill.");
	}
	
	@Override
	public void performDuties() {
		// logic goes here
		System.out.println(this.getName() + " is providing emergency medical care.");
	}
}
