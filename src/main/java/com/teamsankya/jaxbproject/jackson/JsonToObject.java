package com.teamsankya.jaxbproject.jackson;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonToObject {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		StudentBean bean = new StudentBean();
		bean.setId("stu001");
		bean.setName("mehaboob");
		bean.setMarks(75.00);

		ObjectMapper mapper = new ObjectMapper();
		StudentBean studentBean = mapper.readValue(new File("student.json"), StudentBean.class);
		mapper.writerWithDefaultPrettyPrinter();
		System.out.println(studentBean);

	}

}
