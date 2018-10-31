package com.javalec.test10;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String config = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("mode(dev,run):");
		String str = scanner.nextLine();
		
		if(str.equals("dev")) {
			config = "dev";
		}else if(str.equals("run")) {
			config = "run";
		}
		scanner.close();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("applicationCTX_dev.xml","applicationCTX_run.xml");
		
		
		ServerInfo info = ctx.getBean("serverInfo", ServerInfo.class);
		System.out.println("IP:"+info.getIp());
		System.out.println("PORT:"+info.getPort());
		ctx.close();
	}

}
