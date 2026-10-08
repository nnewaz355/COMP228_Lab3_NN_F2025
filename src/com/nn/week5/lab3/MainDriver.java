package com.nn.week5.lab3;

public class MainDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring Person variables (polymorphism)
		Person person1, person2, person3, person4;
		
		//Specializing the Person variables
		person1 = new Doctor(1001, "Chloe", 28, "Neurology", 175.50);
		person2 = new Nurse(1002, "Kai", 29, "Cardiology", "Day");
		person3 = new Surgeon(1003, "Blaze", 30, "Orthopedics", 350.00, "Trauma Reconstruction", 4);
		person4 = new EmergencyDoctor(1004, "Nova", 27, "Critical Care", 220.00);
	}

}
