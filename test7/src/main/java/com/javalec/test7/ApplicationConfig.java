package com.javalec.test7;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("주짓수");
		hobbys.add("테니스");
		hobbys.add("게임");
		
		Student student = new Student("김민규", 26, hobbys);
		student.setHeight(181);
		student.setWeight(76);
		return student;
	}
	
	@Bean
	public Student student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("술");
		hobbys.add("영화");
		
		Student student = new Student("김예슬", 23, hobbys);
		student.setHeight(161);
		student.setWeight(46);
		return student;
	}
}
