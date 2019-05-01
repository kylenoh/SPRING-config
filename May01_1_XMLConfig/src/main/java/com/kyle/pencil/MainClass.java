package com.kyle.pencil;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		String configLoc = "classpath:ApplicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		Pencil pencil = ctx.getBean("pencil",Pencil.class);
		pencil.use();
		ctx.close();
	}
}
