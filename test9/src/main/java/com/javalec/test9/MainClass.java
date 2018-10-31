package com.javalec.test9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		AdminConnection connection = ctx.getBean("adminConnection", AdminConnection.class);
		
		System.out.println("ID:"+connection.getAdminId());
		System.out.println("PW:"+connection.getAdminPw());
		System.out.println("SUB_ID:"+connection.getSub_adminId());
		System.out.println("SUB_PW:"+connection.getSub_adminPw());
		
		ctx.close();
	}
}
