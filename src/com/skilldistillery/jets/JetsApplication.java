package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	private AirField airField = new AirField();
	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		// Program start, AirField gets a list of jets imported into it.
		// Switch menu method, calling others methods with users choice.
		JetsApplication jetsApp = new JetsApplication();

		jetsApp.launchApp();
	}

	private void launchApp() {
	airField.flyAllJets();

	}

//	private void displayUserMenu() {
//		// switch for a menu
//	}



}
