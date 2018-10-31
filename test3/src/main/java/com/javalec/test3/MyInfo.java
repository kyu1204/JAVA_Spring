package com.javalec.test3;

import java.util.ArrayList;

public class MyInfo {
	private String name;
	private int age;
	private double weight;
	private double height;
	private ArrayList<String> hobbys;
	private BMICalculator bmiCalculator;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}

	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}
	
	public void bmiCalculator() {
		bmiCalculator.bmiCalculator(height, weight);
	}

	public void getInfo() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("키:"+height);
		System.out.println("몸무게:"+weight);
		System.out.println("취미:"+hobbys);
		bmiCalculator();
	}
}
