package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		airField.setJets(jetsInfo);
		System.out.println(jetsInfo);
	}
	
	private void displayUserMenu() {
		//switch for a menu
	}
	
	private List<String> readNamesFromFile() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("JetList.txt"))) {
			String jetLine;
			while ((jetLine = bufIn.readLine()) != null) {
				jetsInfo.add(jetLine);
			}
			bufIn.close();
		} catch (IOException e) {
			System.err.println(e);
		}
		return jetsInfo;
	}
	

}
