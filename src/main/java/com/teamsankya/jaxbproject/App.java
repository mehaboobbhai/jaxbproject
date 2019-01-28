package com.teamsankya.jaxbproject;

import java.io.File;
import java.util.Arrays;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;


public class App 
{
    public static void main( String[] args ) throws JAXBException, SAXException
    {
    	PositionBean pbean=new PositionBean();
    	pbean.setpName("developer");
    	
    	
    	PositionBean pbean1=new PositionBean();
    	pbean1.setpName("testing");
    	
    	EmployeeBean bean=new EmployeeBean();
    	bean.setId("emp001");
    	bean.setName("mehaboob");
    	bean.setSalary(1000.00);
    	bean.setPositionBean(Arrays.asList(pbean));
    
    	EmployeeBean bean1=new EmployeeBean();
    	bean1.setId("emp002");
    	bean1.setName("salman");
    	bean1.setSalary(2000.00);
    	bean1.setPositionBean(Arrays.asList(pbean1));
    	
    	CompanyBean  companyBean=new CompanyBean();
    	companyBean.setcName("wipro");
    	companyBean.setcAddress("manyata tech park");
    	companyBean.setBean(Arrays.asList(bean,bean1));
    	
    	
    	/**
    	 * 
    	 * Here we are doing marshalling as well as schema generating.....with xsd
    	 * 
    	 */
    	
    	
    	JAXBContext context=JAXBContext.newInstance(CompanyBean.class);
    	Marshaller marshaller=context.createMarshaller();
    	
    	SchemaFactory factory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema=factory.newSchema(new File("simple1.xsd"));
		marshaller.setSchema(schema);
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    	
      	marshaller.marshal(companyBean, System.out);
		marshaller.marshal(companyBean, new File("simple.xml"));
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    	
    }
}
