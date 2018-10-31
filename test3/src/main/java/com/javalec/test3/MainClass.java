package com.javalec.test3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		
		MyInfo info = ctx.getBean("myInfo",MyInfo.class);
		info.getInfo();
		ctx.close();
	}

}
