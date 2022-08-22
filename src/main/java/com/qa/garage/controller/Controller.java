package com.qa.garage.controller;

import com.qa.garage.Scan;
import com.qa.garage.dao.CRUDqueries;
import com.qa.garage.domain.Vehicle;

public class Controller implements ContollerMethods<Vehicle> {

	 Scan in = new Scan();
	 Vehicle veh = new Vehicle();

	// create an instance of the CRUD queries class to open the connection
	 CRUDqueries query = new CRUDqueries();

	public Vehicle createCont() {
		System.out.println("Enter model: ");
		veh.setModel(in.getString());
		System.out.println("Enter mileage: ");
		veh.setMileage(in.getInt());
		in.getString();
		System.out.println("Enter vehicle type: ");
		veh.setVehicleType(in.getString());
		System.out.println("Enter doors: ");
		veh.setDoors(in.getInt());
		in.getString();
		System.out.println(veh.toString());
		return query.create(veh);
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
