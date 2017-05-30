package com.psideris.springBootStarter.model;

import javax.persistence.Entity;

//@Entity
public class Course {

	private String id;
	private String name;
	private String structure;
	 
	public Course() {
	
	}
	
	public Course(String id, String name, String structure) {
		super();
		this.id = id;
		this.name = name;
		this.structure = structure;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
}
