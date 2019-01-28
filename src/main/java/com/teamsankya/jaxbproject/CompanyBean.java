package com.teamsankya.jaxbproject;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Company")
@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(propOrder= {"id","salary","name","bean"})
public class CompanyBean {

	@XmlElement
	private String cName;
	@XmlElement
	private String cAddress;
	
	@XmlElementWrapper(name="employees")
	private List<EmployeeBean> bean;
	
	

	public List<EmployeeBean> getBean() {
		return bean;
	}

	public void setBean(List<EmployeeBean> bean) {
		this.bean = bean;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	@Override
	public String toString() {
		return "CompanyBean [cName=" + cName + ", cAddress=" + cAddress + ", bean=" + bean + "]";
	}


}
