package com.xworkz.Fish;

import java.util.Date;

public class CameraDTO {
public int id;
public String brand;
public String model;
public int cost;
public String manufacturedDate;
Date date=new Date();
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public String getManufacturedDate() {
	return manufacturedDate;
}
public void setManufacturedDate(String manufacturedDate) {
	this.manufacturedDate = manufacturedDate;
}
@Override
public String toString() {
	return "CameraDTO [id=" + id + ", brand=" + brand + ", model=" + model + ", cost=" + cost + ", manufacturedDate="
			+ manufacturedDate + "]";
}
/**
 * @param id
 * @param brand
 * @param model
 * @param cost
 * @param manufacturedDate
 */
public CameraDTO(int id, String brand, String model, int cost, String manufacturedDate) {
	super();
	this.id = id;
	this.brand = brand;
	this.model = model;
	this.cost = cost;
	this.manufacturedDate = manufacturedDate;
}

}
