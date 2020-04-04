package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private double speed; // in miles per hour
	private int range;
	private long price;
	
	
	public Jet() {
		//default constructor
	}
	
	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly() {
		// prints out the jets details and the amount of time the jet can fly until it runs out of fuel (range/speed?)
		// print out getSpeedInMach w/ speed in MPH
	}
	
	public double getSpeedInMach(double speed) {
		double machSpeed = this.speed/767;
		return machSpeed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
}
