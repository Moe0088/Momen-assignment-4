package com.codercampus;

public class Student {
	private String studentId;
	private String studentName;
	private String studentCourse;
	private String studentGrade;

	

	public Student(String studentId, String studentName, String studentCourse, String studentGrade) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCourse = studentCourse;
		this.studentGrade = studentGrade;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

}
