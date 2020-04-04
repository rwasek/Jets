package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.List;

public class AirField {
	// Empty <List> of Jets
	public List<Jet> jets;
	
	
	public AirField() {
		jets = new ArrayList<>();
	}
	
	public AirField(List<Jet> jets) {
		this.jets = jets;
	}
	
	public void addJet(Jet jetOne) {
		jets.add(jetOne);
	}

	public Jet getJet(int jetOne) {
		return jets.get(jetOne);
		
	}


}
