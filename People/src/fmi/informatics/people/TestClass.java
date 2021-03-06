package fmi.informatics.people;

import java.util.ArrayList;
import java.util.List;

import fmi.informatics.composition.RichStudent2;

public class TestClass {

	public static void main(String[] args) {
		// testGenerator();
		// testAnonymousClasses();
		testRTTI();
	}
	
	// ������������ �� ���������� �� ��������
	public static void testGenerator() {
		List<Student> students = new ArrayList<>();
		
		for(int i = 0; i <= 6; i++) {
			Student student = Student.StudentGenerator.make();
			students.add(student);
		}

		for(Student student: students) {
			System.out.println(student);
		}
	}
	
	// ������ �� �������� ����
	// ����������� ������� � ���� RichStudent2 ��������� �������� ���� ��� ������ ��������������. 
	// ����������, �� ������ goBar() �� �������� ����� �� ����� ������ ��� � ��������.
	public static void testAnonymousClasses() {
		Student student = new Student("Pesho", 123, "PU", "5698", 2569) {
			@Override
			public String getTypicalDrink(){
				return "50 years Black Johny";
			}
		};
		student.goBar();
		
		RichStudent2 richStudent = new RichStudent2("Pesho", 1234, "PU", "5698", 2569);
		richStudent.goBar();
	}
	
	// ������ �� RTTI
	// ���������� ��������� Person, Student � Professor �� ������������ � ��������� instanceof
	@SuppressWarnings("rawtypes")
	public static void testRTTI() {
		Person person = Student.StudentGenerator.make();
		
		// ������ �� ���������� RTTI � instanceof
		if(person instanceof Student) {
			String name = person.getName();
			String speciality = ((Student) person).getSpeciality();
			System.out.println("I'm " + name + " and I'm studying " + speciality);
		}
		
		// ������ �� RTTI ��� instanceof
		// ������������ �� instanceof e ��-����� � ��������� ������
		Class studentClass = Student.class;
		if(person.getClass().isAssignableFrom(studentClass)) {
			String speciality = ((Student) person).getSpeciality();
			System.out.println("I'm studying " + speciality);
		}
		
		if(person.getClass().equals(Student.class)) {
			String speciality = ((Student) person).getSpeciality();
			System.out.println("I'm studying " + speciality);
		}
	}
}
