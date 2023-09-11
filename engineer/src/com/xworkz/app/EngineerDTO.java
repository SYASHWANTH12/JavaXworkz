package com.xworkz.app;

import java.io.Serializable;

public class EngineerDTO implements Serializable {
	int id;
	String name;
	String collageName;
	
	public EngineerDTO() {
		
		
	}
	
	public EngineerDTO(int id,String name,String collageName) {
		this.id=id;
		this.name=name;
		this.collageName=collageName;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	public String toString() {
		return "EnginnerDTO[id=" +id+ "name=" +name+ "collegeName="+collageName+"]";
	}

}
