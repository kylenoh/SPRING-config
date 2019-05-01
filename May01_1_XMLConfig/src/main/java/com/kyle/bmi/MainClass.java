package com.kyle.bmi;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String configLoc = "classpath:ApplicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyInfo myinfo = ctx.getBean("myinfo",MyInfo.class);
		myinfo.getinfo();
		ctx.close();
	}
}
