package com.nn.week5.lab3;

public class Surgeon extends Doctor {
	public String surgeryType;
	public int operatingRoom;
	
	public Surgeon(int personId, String name, int age, String specialization, double consultationFee,
			String surgeryType, int operatingRoom) {
		super(personId, name, age, specialization, consultationFee);
		this.surgeryType = surgeryType;
		this.operatingRoom = operatingRoom;
	}
	
	public void performSurgery() {
		// logic goes here
		System.out.println(this.getName() + " is performing surgical duties.");
	}
	
	@Override
	public void performDuties() {
		//logic goes here
		System.out.println(this.getName() + " is performing " + this.getSurgeryType() + " surgery in Operating Surgery " + this.getOperatingRoom());
	}

	public String getSurgeryType() {
		return surgeryType;
	}

	public void setSurgeryType(String surgeryType) {
		this.surgeryType = surgeryType;
	}

	public int getOperatingRoom() {
		return operatingRoom;
	}

	public void setOperatingRoom(int operatingRoom) {
		this.operatingRoom = operatingRoom;
	}
	
}
