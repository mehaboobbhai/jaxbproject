package com.teamsankya.jaxbproject.jackson;

public class StudentBean {

	private String id;
	private String name;
	private double marks;

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

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}
