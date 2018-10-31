package com.javalec.test4;

public class StudentInfo {
	private Student student;
	
	public StudentInfo(Student student) {
		this.student = student;
	}
	
	public void getStudentInfo() {
		System.out.println(this.student.getName());
		System.out.println(this.student.getAge());
		System.out.println(this.student.getClassNum());
		System.out.println(this.student.getMajor());
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
}
