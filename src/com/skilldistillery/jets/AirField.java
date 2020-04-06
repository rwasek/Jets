package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class AirField {
	NumberFormat fm = NumberFormat.getInstance();
	private List<Jet> jets;

	public AirField() {
		jets = new ArrayList<>();
		readNamesFromFile();
	}

	public void removeJet() {

		Scanner kb = new Scanner(System.in); // closing the scanner here causes bugs!
		System.out.println("\t\t\t\t      Jet Removal: ");
		System.out.println();
		System.out.println("\\-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~/VIII\\-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\\");
		System.out.println();
		System.out.println("Which jet would you like to remove from the Fleet?:");
		System.out.println();
		for (int i = 0; i < jets.size(); i++) {
			System.out.println(i + 1 + ": " + this.jets.get(i));
			System.out.println();
		}
		
		int choice = kb.nextInt();
		jets.remove(choice - 1);
		System.out.println("\nThe jet in spot " + choice + " has now been removed from the Fleet!");
		
	}


	public void parkJet(Jet jet) {
		// receive a jet and add it to the jet list .. jets.add(name of jet)
		this.jets.add(jet);
	}

	public void listFleet() {
		
		System.out.println("\t\t\t\t    The Jet Fleet: ");
		System.out.println();
		System.out.println("\\-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~/I\\-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\\");
		System.out.println();
		for (int i = 0; i < jets.size(); i++) {
			System.out.println(this.jets.get(i));
			System.out.println();
		}

	}

	public void flyOneJet() {

		Scanner kb = new Scanner(System.in); // closing the scanner here causes bugs!
		System.out.println("\t\t\t\t      Solo Flight: ");
		System.out.println();
		System.out.println("\\-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~/IX\\-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\\");
		System.out.println();
		System.out.println("Which jet would you like to fly?:");
		System.out.println();
		for (int i = 0; i < jets.size(); i++) {
			System.out.println(i + 1 + ": " + this.jets.get(i));
			System.out.println();
		}
		
		int choice = kb.nextInt();
		System.out.println("\n\t\t\t\t    SOLO FLIGHT ENGAGED!\n");
		jets.get(choice - 1).fly();
		
	}
	
	public void flyAllJets() {
		// loop through the jet array and call their fly methods
		System.out.println("\t\t\t     Fleet Preparing For Take Off: ");
		System.out.println();
		System.out.println("\\-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~/II\\-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\\");
		System.out.println();
		for (Jet jet : jets) {
			jet.fly();
			System.out.println();
		}
	}

	public void fastestJet() {
		System.out.println("\t\t\t     The Fastest Jet Of The Fleet: ");
		System.out.println();
		System.out.println("\\-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~/III\\-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\\");
		System.out.println();
		
		Jet prior = this.jets.get(0);

		Jet fastest = this.jets.get(0);

		for (int i = 0; i < jets.size(); i++) {
			
			Jet jet = this.jets.get(i);
			if (jet != null) {
				
				if (prior.getSpeed() > this.jets.get(i).getSpeed()) {
					prior = this.jets.get(i);
				}
				if (fastest.getSpeed() < this.jets.get(i).getSpeed()) {
					fastest = this.jets.get(i);
				}
			}
		}
		System.out.println("The fastest jet is: " + fastest);
	}

	public void longestRangeJet() {
		System.out.println("\t\t\t     The Jet With The Longest Range: ");
		System.out.println();
		System.out.println("\\-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~/IV\\-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\\");
		System.out.println();
		
		Jet prior = this.jets.get(0);
		Jet longestRangeJet = this.jets.get(0);

		for (int i = 0; i < jets.size(); i++) {
			Jet jet = this.jets.get(i);
			
			if (jet != null) {
				if (prior.getRange() > this.jets.get(i).getRange()) {
					prior = this.jets.get(i);
					
				}
				if (longestRangeJet.getRange() < this.jets.get(i).getRange()) {
					longestRangeJet = this.jets.get(i);
				}
			}
		}
		System.out.println("The jet with the longest range is: " + longestRangeJet);
	}
	
	public void startLoadCargo() {
		System.out.println("\t\t\t         Load All Cargo Jets: ");
		System.out.println();
		System.out.println("\\-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~/V\\-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\\");
		System.out.println();
		for (Jet jet : jets) {
			if (jet instanceof CargoCarrier) {
				System.out.print(jet.getModel());
				((CargoCarrier) jet).loadCargo();
			}
		}
	}

	public void startDogFight() {
		System.out.println("\t\t\t\t   Start Dog Fight: ");
		System.out.println();
		System.out.println("\\-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~/VI\\-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~\\");
		System.out.println();
		for (Jet jet : jets) {
			if (jet instanceof CombatReady) { // for combat vs cargo
				System.out.print(jet.getModel());
				((CombatReady) jet).fight();
			}
		}
	}


	private void readNamesFromFile() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("JetList.txt"))) {
			
			String jetLine;
			while ((jetLine = bufIn.readLine()) != null) {

				String[] jets = jetLine.split(",");

				String jetName = jets[0];
				double jetSpeed = Double.parseDouble(jets[1].trim());
				int jetRange = Integer.parseInt(jets[2].trim());
				long jetPrice = Long.parseLong(jets[3].trim());

				if (jetName.charAt(0) == 'F') {

					FighterJet newFighterJet = new FighterJet(jetName, jetSpeed, jetRange, (jetPrice));
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
