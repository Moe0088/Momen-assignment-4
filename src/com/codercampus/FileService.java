package com.codercampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

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

	for(Student student:students) {
		if (student.getStudentGrade().contains("CompSci")) {
			System.out.println(student.getStudentName());

		} else if (student.getStudentGrade().contains("Apmth")) {
			System.out.println(student.getStudentName());
		} else {
			System.out.println(student.getStudentName());

		}
		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student student1, Student student2) {
				
				return student1.getClass().compareTo(student2.getClass());
			}
			
		}
}}
}
