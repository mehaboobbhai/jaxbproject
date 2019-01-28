package com.teamsankya.jaxbproject;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/*@XmlRootElement(name="Employee")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder= {"salary","name","id","cbean"})*/

//@XmlType(propOrder= {"name","xmlName","id","ebean","bean"})


@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeBean {

	@XmlAttribute
	private String id;
	@XmlElement
	private String name;
	@XmlElement
	private double salary;
	
	@XmlElementWrapper(name="positions")
	private List<PositionBean> positionBean;
	
	



	public List<PositionBean> getPositionBean() {
		return positionBean;
	}

	public void setPositionBean(List<PositionBean> positionBean) {
		this.positionBean = positionBean;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", salary=" + salary + ", positionBean=" + positionBean
				+ "]";
	}


}
