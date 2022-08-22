package com.qa.garage;

import com.qa.garage.controller.Controller;

public class Choice {

	Scan in = new Scan();
	Controller cont = new Controller();

	public void options() {

		// Ask for user input on the CRUD choice in the getInput method and store the
		// result in the crud variable
//		String crud = in.getInput();
		System.out.println("Enter CRUD choice: ");
		String crud = in.getString();

		// try-finally block so the finally block can close the connection
		try {
			// do-while loop to start the loop and present the options to interact with the
			// database
			do {
				// switch case to match which CRUD operation to perform
				switch (crud.toLowerCase()) {
				case "create":
					cont.createCont();
					break;
				case "read":
					cont.readCont();
					break;
				case "update":

					cont.updateCont();
					break;
				case "delete":
					cont.deleteCont();
					break;
				default:
					System.out.println("Invalid CRUD choice");
				}
				// check if user wants to continue or break out of the loop
				System.out.println("Would you like to continue? (y/n)");
				String quit = in.getString();
				if (quit.toLowerCase().equals("y")) {
//					crud = in.getInput();
					crud = in.getString();
				} else if (quit.toLowerCase().equals("n")) {
					crud = "quit";
				} else {
					System.out.println("Please enter 'y' or 'n'");
				}

			} while (!crud.equals("quit"));
			System.out.println("Goodbye!");
		} finally {
			cont.terminate();
		}
	}

}
