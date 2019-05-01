package com.kyle.student;

public class Student {
	private String name;
	private String age;
	private String grade;
	private String classNum;
	
	public Student(String name, String age, String grade, String classNum) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNum = classNum;
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	
	
}
