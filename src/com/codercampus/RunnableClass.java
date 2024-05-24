package com.codercampus;

public class RunnableClass {

	public static void main(String[] args) throws Exception {
		FileService fileService = new FileService();

		fileService.readFile();
		fileService.putAndSortStudentIntoArray();

	}

}
