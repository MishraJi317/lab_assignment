package com.ashish.newApp.annotExample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class car1 {
	
	@Id
	private int year;
	public int getYear() {
		return year;
	}
	
	
	public void setYear(int year) {
		this.year = year;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return Model;
	}
	
	public void setModel(String model) {
		Model = model;
	}
	@Column
	private String brand;
	@Column
	private String Model;


}
