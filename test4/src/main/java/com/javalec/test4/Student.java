package com.javalec.test4;

public class Student {
	private String name;
	private String age;
	private String classNum;
	private String major;
	
	public Student(String name,String age,String classNum,String major) {
		this.name = name;
		this.age = age;
		this.classNum = classNum;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getClassNum() {
		return classNum;
	}

	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
}
