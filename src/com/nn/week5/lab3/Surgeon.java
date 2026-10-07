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
	}
	
	@Override
	public void performDuties() {
		//logic goes here
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
