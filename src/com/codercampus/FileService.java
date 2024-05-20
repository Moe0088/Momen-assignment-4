package com.codercampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileService {

	Student[] students = new Student[1000];

	public Student[] readFile() throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader("student-master-list.csv"));
		String line;
		int i = 0;
		while ((line = reader.readLine()) != null) {
			String[] parts = line.split(",");
			students[i] = new Student(parts[0], parts[1], parts[2], parts[3]);
			i++;
		}

		reader.close();

		return students;
	}

	Student[] CompSci = new Student[100];
	Student[] Apmth = new Student[100];
	Student[] Stat = new Student[100];
//	for (Student student : students) {
//		if(student.getStudentGrade().contains("CompSci"))
//	}

}
