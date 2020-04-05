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
		while (true) {
			displayUserMenu();
			System.out.println();
		}
	}

	private void displayUserMenu() {
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to Fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");
		int choice = kb.nextInt();

		switch (choice) {

		case 1:
			System.out.println();
			airField.listFleet();
			break;
			
		case 2:
			System.out.println();
			airField.flyAllJets();
			break;
			
		case 3:
			System.out.println();
			airField.fastestJet();
			break;
			
		case 4:
			System.out.println();
			airField.longestRangeJet();
			break;
			
		case 5:
			System.out.println();
			airField.startLoadCargo();
			break;
			
		case 6:
			System.out.println();
			airField.startDogFight();
			break;
			
		case 7:
			System.out.println("Lets create a simple Jet!");
			System.out.println("Please enter a model name: ");
			String model = kb.nextLine() + kb.nextLine();
			System.out.println("Please enter the speed in MPH: ");
			double speed = kb.nextDouble();
			System.out.println("Please enter the range: ");
			int range = kb.nextInt();
			System.out.println("Please enter the unit price in US dollars: ");
			long price = kb.nextLong();
			JetImpl userCreated = new JetImpl(model, speed, range, price);
			airField.parkJet(userCreated);
			break;
			
		case 8:
			airField.removeJet();
			break;
		case 9:
			System.out.println("Exiting the Program, Goodbye.");
			System.exit(0);

		}
	}

}
