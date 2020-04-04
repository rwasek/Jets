package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	// Empty <List> of Jets
	private List<Jet> jets;

	public AirField() {
		jets = new ArrayList<>();
		readNamesFromFile();
	}

	public void parkJet(Jet jet) {
		// receive a jet and add it to the jet list .. jets.add(name of jet)
		this.jets.add(jet);
	}
	
	public void listFleet() {
		for (int i = 0; i < jets.size(); i++) {
			System.out.println(this.jets.get(i));
		}
		
	}

	public void flyAllJets() {
		// loop through the jet array and call their fly methods
		for (Jet jet : jets) {
			jet.fly();
		}
	}

//	public void displayCombatJets() {
//		for (Jet jet : jets) {
//			if (jet instanceof CombatReady) { // for combat vs cargo
//				System.out.println();
//			}
//		}
		
			
			
		
	
	


	private void readNamesFromFile() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("JetList.txt"))) {
			String jetLine;
			while ((jetLine = bufIn.readLine()) != null) {
				String[] jets = jetLine.split(",");
				String jetName = jets[0];
				double jetSpeed = Double.parseDouble(jets[1].trim());
				int jetRange = Integer.parseInt(jets[2].trim());
				long jetPrice = Long.parseLong(jets[3].trim());
				// if statement here for types of jets to split them up.
				if (jetName.charAt(0) == 'F') {
					FighterJet newFighterJet = new FighterJet(jetName, jetSpeed, jetRange, jetPrice);
					parkJet(newFighterJet);
				} else if (jetName.charAt(0) == 'C') {
					CargoPlane newCargoJet = new CargoPlane(jetName, jetSpeed, jetRange, jetPrice);
					parkJet(newCargoJet);
				} else {
					JetImpl jet1 = new JetImpl(jetName, jetSpeed, jetRange, jetPrice);
					parkJet(jet1); // call parkJet method
				}

			}
			bufIn.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}





	

}
