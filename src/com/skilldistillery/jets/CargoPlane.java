package com.skilldistillery.jets;


public class CargoPlane extends Jet implements CargoCarrier {
	
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void loadCargo() {
		System.out.println(" is loading cargo for transport!");
		System.out.println();
	}


	@Override
	public String toString() {
		return "CargoPlane [Model: " + getModel() + ", Speed: " + getSpeed() + ", Range: " + getRange() + ", Price: $"
				+ fm.format(getPrice()) + "]";
	}

}
