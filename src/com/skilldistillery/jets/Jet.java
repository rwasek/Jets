package com.skilldistillery.jets;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public abstract class Jet {
	
	NumberFormat fm = NumberFormat.getInstance();
	DecimalFormat df = new DecimalFormat("#.##");
	
	private String model;
	private double speed; // in miles per hour
	private int range;
	private long price;

	public Jet() {
		// default constructor
	}

	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public void fly() {
		System.out.println(this.model + " is taking off from the Air Field, at a top speed of " + this.speed
				+ " MPH it can fly " + this.range + " miles and has " + df.format(this.range / this.speed)
				+ " hours until it runs out of fuel. It costs $" + fm.format(this.price) + " per unit!");
		System.out.println("The " + this.model + " also flys at " + df.format(getSpeedInMach(this.speed)) + "x the speed of sound!");
	}

	public double getSpeedInMach(double speed) {
		double machSpeed = this.speed / 767;
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
