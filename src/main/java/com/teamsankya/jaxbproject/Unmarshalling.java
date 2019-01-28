package com.teamsankya.jaxbproject;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class Unmarshalling {

	public static void main(String[] args) throws JAXBException, SAXException {

		JAXBContext context = JAXBContext.newInstance(CompanyBean.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema = factory.newSchema(new File("mehaboob1.xsd"));
		unmarshaller.setSchema(schema);
		CompanyBean companyBean = (CompanyBean) unmarshaller.unmarshal(new File("simple.xml"));
		System.out.println(companyBean);
	}

}
