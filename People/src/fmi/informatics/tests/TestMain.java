package fmi.informatics.tests;

import fmi.informatics.people.Student;

public class TestMain {

	public static void main(String[] args) {
		Student student = new Student();
		
		StudentTest.getTypicalDrinkTest(student);
	}
}
