package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	@Override
	public void fight() {
		System.out.println(" is: PREPARING FOR BATTLE! MISSILES ENGAGED!");
		System.out.println();
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public String toString() {
		return "FighterJet [Model: " + getModel() + ", Speed: " + getSpeed() + ", Range: " + getRange()
				+ ", Price: $" + fm.format(getPrice()) + "]";
	}
	
	

	
	
	
	
	

}
