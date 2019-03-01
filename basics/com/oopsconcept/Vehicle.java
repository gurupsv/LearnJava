package com.oopsconcept;

public abstract class Vehicle {

	private boolean engineStatus;
	public abstract boolean startEngine();
	public void stopEngine() {
		engineStatus=false;
	}
	
}
