package com.kyle.student;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String configLoc = "classpath:ApplicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		StudentInfo studentinfo = ctx.getBean("studentInfo",StudentInfo.class);
		studentinfo.getStudentInfo();
		ctx.close();
	}
}
