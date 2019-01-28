package com.teamsankya.jaxbproject.jackson;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ObjectToJson {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		
		StudentBean  bean=new StudentBean();
		bean.setId("stu001");
		bean.setName("mehaboob");
		bean.setMarks(75.00);
		
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("student.json"),bean);
		mapper.writerWithDefaultPrettyPrinter();

		
		
		
	}
	
	

}
