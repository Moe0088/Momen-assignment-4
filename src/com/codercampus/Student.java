package com.codercampus;

public class Student{
	private String studentName;
	private String studentCourse;
	private String  studentId;
	private String studentGrade;

	public Student(String studentName, String studentCourse, String studentId, String studentGrade) {

		this.studentName = studentName;
		this.studentCourse = studentCourse;
		this.studentId = studentId;
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
