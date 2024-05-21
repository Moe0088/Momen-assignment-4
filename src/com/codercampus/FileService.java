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

// creating students Arrays
	Student[] CompSci = new Student[100];
	Student[] Apmth = new Student[100];
	Student[] Stat = new Student[100];
	{
		// populate an arrays
		int compSciCount = 0;
		int apmthCount = 0;
		int statCount = 0;
		for (Student student : students) {
			if (student.getStudentCourse().contains("CompSci")) {
				CompSci[compSciCount++] = student;
			} else if (student.getStudentCourse().contains("Apmth")) {
				Apmth[apmthCount++] = student;
			} else if (student.getStudentCourse().contains("Stat")) {
				Stat[statCount++] = student;

			}
		}
	}

	// creating a method for sorting
	public void studentSorting(Student[] students, Student[] CompSci, Student[] Apmth, Student[] Stat) {
		Arrays.sort(students , new Comparator<Student>() {

		

			@Override
			public int compare(Student student1, Student student2) {
				// TODO Auto-generated method stub
				return student1.getStudentCourse().compareTo(student2.getStudentName());
			}
		
	});
}
}

