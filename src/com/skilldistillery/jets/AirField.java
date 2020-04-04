package com.skilldistillery.jets;

import java.util.List;

public class AirField {
	// Empty <List> of Jets
	private List<String> jets;
	
	
	public AirField() {
		
	}
	
	public AirField(List<String> jets) {
		super(); // this isnt needed right?
		this.jets = jets;
	}




	public List<String> getJets() {
		return jets;
	}


	public void setJets(List<String> jets) {
		this.jets = jets;
	}
	
	
	



}
