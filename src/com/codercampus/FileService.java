package com.codercampus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class FileService {

	Student[] students = new Student[100];

	public Student[] readFile() throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader("student-master-list.csv"));
		String line;
		int i = 0;
		reader.readLine();
		while ((line = reader.readLine()) != null) {
			String[] parts = line.split(",");

			students[i] = new Student(parts[0], parts[1], parts[2], parts[3]);
			i++;
		}

		reader.close();

		return students;

	}

// creating students Arrays in a method
	public void putAndSortStudentIntoArray() throws IOException {
		Student[] CompSci = new Student[34];
		Student[] Apmth = new Student[33];
		Student[] Stat = new Student[33];
		{
			// populate an arrays
			int compSciCount = 0;
			int apmthCount = 0;
			int statCount = 0;

			for (Student student : students) {

//Separate them into specific classes
				if (student != null) {
					System.out.println("Checking course for student: " + student.getStudentName() + " - "
							+ student.getStudentCourse());
					if (student.getStudentCourse().contains("COMPSCI")) {
						CompSci[compSciCount++] = student;
					} else if (student.getStudentCourse().contains("APMTH")) {
						Apmth[apmthCount++] = student;
					} else if (student.getStudentCourse().contains("STAT")) {
						Stat[statCount++] = student;
					} else {
						System.out.println("Course not recognized for student: " + student.getStudentName());
					}
				}
			}
		}
		sortStudents(CompSci);
		sortStudents(Apmth);
		sortStudents(Stat);
		writeToFile(CompSci, "course1.csv");
		writeToFile(Apmth, "course2.csv");
		writeToFile(Stat, "course3.csv");
	}

	// creating a method for sorting
	public void sortStudents(Student[] students) {
		Arrays.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student student1, Student student2) {
				Integer grade1 = convertGraderAsanInt(student1);
				Integer grade2 = convertGraderAsanInt(student2);
				return Integer.compare(grade2, grade1);
			}

// This method is the compare an int to an integer
			private Integer convertGraderAsanInt(Student student) {
				if (student == null) {
					return 0;
				}
				return Integer.parseInt(student.getStudentGrade());
			}

		});
	}

//creating method to write into a file

	public static void writeToFile(Student[] students, String fileName) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			writer.write("Student ID,Student Name,Course,Grade\n");
			for (Student student : students) {
				if (student != null) {
					writer.write(student.getStudentId() + "," + student.getStudentName() + ","
							+ student.getStudentCourse() + "," + student.getStudentGrade() + "\n");
				}

			}
		}
	}
}