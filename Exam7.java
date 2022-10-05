package com.nissan.bean;

//encapsulation
public class Exam7 {

	//instance variables
	private String name;
	private int id;
	
	//default constructor
	public Exam7() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Exam7(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	//setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//override toString()
	@Override
	public String toString() {
		return "Exam7 [name=" + name + ", id=" + id + "]";
	}
	
	
	
}
