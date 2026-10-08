package com.nn.week5.lab3;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring Person variables (polymorphism)
		// Person person1, person2, person3, person4; try again in polymorphism section
		
		//Specializing the Person variables
		Doctor doc = new Doctor(1001, "Chloe", 28, "Neurology", 175.50);
		Nurse nurse = new Nurse(1002, "Kai", 29, "Cardiology", "Day");
		Surgeon surgeon = new Surgeon(1003, "Blaze", 30, "Orthopedics", 350.00, "Trauma Reconstruction", 4);
		EmergencyDoctor emgDoc = new EmergencyDoctor(1004, "Nova", 27, "Critical Care", 220.00);
		
		System.out.println("========================================\n       HOSPITAL MANAGEMENT SYSTEM\n========================================");
		
		//Invoke Doctor's Methods
		System.out.println("\n--- DOCTOR ---");
		System.out.println(doc);
		doc.performDuties();
		doc.diagnosePatient();
		
		//Invoke Nurse's Methods
		System.out.println("\n--- NURSE ---");
		System.out.println(nurse);
		nurse.performDuties();
		nurse.assistPatient();
		
		//Invoke Surgeon's Methods
		System.out.println("\n--- SURGEON ---");
		System.out.println(surgeon);
		surgeon.performDuties();
		surgeon.diagnosePatient();
		surgeon.performSurgery();
		
		//Invoke Emergency Doctor's Methods
		System.out.println("\n--- EMERGENCY DOCTOR ---");
		System.out.println(emgDoc);
		emgDoc.performDuties();
		emgDoc.prescribeMedication();
		emgDoc.generateBill();
	}

}
