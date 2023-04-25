package com.example.Car.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
	@Id
	private int Carid;
	private String carname;
	private int CarCC;
	private int Carmileage;
	Car(){}
	public int getCarid() {
		return Carid;
	}
	public void setCarid(int carid) {
		Carid = carid;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public int getCarCC() {
		return CarCC;
	}
	public void setCarCC(int carCC) {
		CarCC = carCC;
	}
	public int getCarmileage() {
		return Carmileage;
	}
	public void setCarmileage(int carmileage) {
		Carmileage = carmileage;
	}
	public Car(int carid, String carname, int carCC, int carmileage) {
		super();
		Carid = carid;
		this.carname = carname;
		CarCC = carCC;
		Carmileage = carmileage;
	}
	
}
