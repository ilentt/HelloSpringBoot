package com.ilenlab.springboot.model;

public class Employee {
	private String no;
	private String name;
	private String position;

	public Employee() {
	}

	public Employee(String no, String name, String position) {
		super();
		this.no = no;
		this.name = name;
		this.position = position;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
