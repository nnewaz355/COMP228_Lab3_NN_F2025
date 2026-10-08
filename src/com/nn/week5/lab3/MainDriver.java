package com.nn.week5.lab3;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Person person1, person2, person3, person4; try again in polymorphism section
		
		
		System.out.println("========================================\n       HOSPITAL MANAGEMENT SYSTEM\n========================================");
		
		//Invoke Doctor's Methods
		System.out.println("\n--- DOCTOR ---");
		Doctor doc = new Doctor(1001, "Chloe", 28, "Neurology", 175.50);
		doc.performDuties();
		doc.diagnosePatient();
		
		//Invoke Nurse's Methods
		System.out.println("\n--- NURSE ---");
		Nurse nurse = new Nurse(1002, "Kai", 29, "Cardiology", "Day");
		nurse.performDuties();
		nurse.assistPatient();
		
		//Invoke Surgeon's Methods
		System.out.println("\n--- SURGEON ---");
		Surgeon surgeon = new Surgeon(1003, "Blaze", 30, "Orthopedics", 350.00, "Trauma Reconstruction", 4);
		surgeon.performDuties();
		surgeon.diagnosePatient();
		surgeon.performSurgery();
		
		//Invoke Emergency Doctor's Methods
		System.out.println("\n--- EMERGENCY DOCTOR ---");
		EmergencyDoctor emgDoc = new EmergencyDoctor(1004, "Nova", 27, "Critical Care", 220.00);
		emgDoc.performDuties();
		emgDoc.prescribeMedication();
		emgDoc.generateBill();
		
		//Polymorphism
		
		System.out.println("\n----- POLYMORPHISM -----");
		Person person;
		person = doc;
		person.performDuties();
		person = nurse;
		person.performDuties();
		person = surgeon;
		person.performDuties();
		person = emgDoc;
		person.performDuties();
		
		System.out.println("\n----- POLYMORPHISM USING ARRAY -----");
		
		//Prime the person object for specializing and populate specialized objects into array
		Person people[] = {doc, nurse, surgeon, emgDoc}; 
		
		//Display info and perform duties for each person
		for (Person p : people) {
			p.performDuties();
		}
		
		//Signal End of Demo
		System.out.println("\n==================================\n       END OF DEMONSTRATION\n==================================");
	}

}
