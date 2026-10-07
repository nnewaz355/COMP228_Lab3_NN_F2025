package com.nn.week5.lab3;

public class EmergencyDoctor extends Doctor implements MedicalProfessional, Billable {

	public EmergencyDoctor(int personId, String name, int age, String specialization, double consultationFee) {
		super(personId, name, age, specialization, consultationFee);
	}
	
	public void handleEmergency() {
		// logic goes here
	}
	
	public void prescribeMedication() {
		// logic goes here
	}
	
	public void generateBill() {
		// logic goes here
	}
	
	@Override
	public void performDuties() {
		// logic goes here
	}
}
