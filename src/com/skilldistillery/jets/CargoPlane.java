package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	@Override
	public void loadCargo() {
		System.out.println(" is: Loading cargo for transport!");
	}

	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String toString() {
		return "CargoPlane [Model: " + getModel() + ", Speed: " + getSpeed() + ", Range: " + getRange() + ", Price: "
				+ getPrice() + "]";
	}

}
