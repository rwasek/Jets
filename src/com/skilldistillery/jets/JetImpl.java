package com.skilldistillery.jets;

public class JetImpl extends Jet {

	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String toString() {
		return "Custom Jet [Model: " + getModel() + ", Speed: " + getSpeed() + ", Range: " + getRange()
				+ ", Price: " + getPrice() + "]";
	}
	
	
	

	
	
}
