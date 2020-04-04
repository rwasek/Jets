package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class JetsApplication {
	
	private AirField airField = new AirField();
	private Scanner kb = new Scanner(System.in);
	List<String> jetsInfo = new ArrayList<>();

	public static void main(String[] args) {
		// Program start, AirField gets a list of jets imported into it.
		// Switch menu method, calling others methods with users choice.
		JetsApplication jetsApp = new JetsApplication();
		
		jetsApp.launchApp();
	}
	
	
	private void launchApp() {
		readNamesFromFile();
		for (int i = 0; i < airField.jets.size(); i++) {
			System.out.println(airField.jets.get(i).toString());
		} 
	}
	
	private void displayUserMenu() {
		//switch for a menu
	}
	
	
	private List<String> readNamesFromFile() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("JetList.txt"))) {
			String jetLine;
			while ((jetLine = bufIn.readLine()) != null) {
				String[] jets = jetLine.split(",");
				String jetName = jets[0];
				double jetSpeed = Double.parseDouble(jets[1].trim());
				int jetRange = Integer.parseInt(jets[2].trim());
				long jetPrice = Long.parseLong(jets[3].trim());
				JetImpl jet1 = new JetImpl(jetName, jetSpeed, jetRange, jetPrice);
				airField.jets.add(jet1);
				jetsInfo.add(jets[0]);
				
			}
			bufIn.close();
		} catch (IOException e) {
			System.err.println(e);
		}
		return jetsInfo;
	}
	

	}
	
	
	


