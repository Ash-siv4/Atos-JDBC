package com.qa.garage.controller;

import com.qa.garage.Scan;
import com.qa.garage.dao.CRUDqueries;
import com.qa.garage.domain.Vehicle;

public class Controller implements ContollerMethods {

	 Scan in = new Scan();
	 Vehicle veh = new Vehicle();

	// create an instance of the CRUD queries class to open the connection
	 CRUDqueries query = new CRUDqueries();

	public void createCont() {
		System.out.println("Enter model: ");
		String mod = in.getString();
		veh.setModel(mod);
		System.out.println("Enter mileage: ");
		int miles = in.getInt();
		in.getString();
		System.out.println("Enter vehicle type: ");
		String vType = in.getString();
		System.out.println("Enter doors: ");
		int door = in.getInt();
		in.getString();
		query.create(new Vehicle(mod, miles, vType, door));
	}

	public void readCont() {
		query.read();
	}

	public void updateCont() {
		System.out.println("Enter id of record to update: ");
		int uid = in.getInt();
		in.getString();// capture enter key
		System.out.println("Enter the new model of the vehicle: ");
		String nModel = in.getString();
		query.update(uid, nModel);
	}

	public void deleteCont() {
		System.out.println("Enter id of record to delete: ");
		int id = in.getInt();
		in.getString();// capture enter key
		query.delete(id);
	}

	
	public void terminate() {
		query.closeConn();
	}
}
