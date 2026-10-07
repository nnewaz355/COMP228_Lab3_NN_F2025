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
		//System.out.println(this.name + " is diagnosing a patient.");
	}
	
	@Override
	public void performDuties() {
		//System.out.println(this.name + " is examining and treating patients.");
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public double getConsultationFee() {
		return consultationFee;
	}

	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}

}
