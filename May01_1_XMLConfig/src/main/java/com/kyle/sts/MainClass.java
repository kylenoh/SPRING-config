package com.kyle.sts;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		String configLoc ="classpath:ApplicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyCalculator myCalculator = ctx.getBean("myCalculator",MyCalculator.class);
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
		ctx.close();
	}
}
