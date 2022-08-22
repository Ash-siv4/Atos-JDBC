package com.qa.garage.controller;

import java.util.Scanner;

import com.qa.garage.dao.CRUDqueries;
import com.qa.garage.domain.Vehicle;

public class Controller {
	private static Scanner sc = new Scanner(System.in);
	Vehicle veh;

	// create an instance of the CRUD queries class to open the connection
	CRUDqueries q = new CRUDqueries();

	public void createCont() {
		System.out.println("Enter model: ");
		String mod = sc.nextLine();
		veh.setModel(mod);
		System.out.println("Enter mileage: ");
		int miles = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter vehicle type: ");
		String vType = sc.nextLine();
		System.out.println("Enter doors: ");
		int door = sc.nextInt();
		sc.nextLine();
		q.create(new Vehicle(mod, miles, vType, door));
	}

}
