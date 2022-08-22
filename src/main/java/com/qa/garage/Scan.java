package com.qa.garage;

import java.util.Scanner;

public class Scan {

	private static Scanner sc = new Scanner(System.in);

//	public String getInput() {
//		System.out.println("Enter CRUD choice: ");
//		return sc.nextLine();
//	}

	public String getString() {
		return sc.nextLine();
	}

	public int getInt() {
		return sc.nextInt();
	}
}
