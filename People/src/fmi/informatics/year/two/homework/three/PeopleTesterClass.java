package fmi.informatics.year.two.homework.three;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

//import fmi.informatics.composition.RichStudent;
import fmi.informatics.composition.RichStudent2;
import fmi.informatics.people.Person;
import fmi.informatics.people.Professor;
import fmi.informatics.people.Student;

public class PeopleTesterClass {

	public static void main(String[] args) {
		testAddingArray();
		studentGeneratorTest(5);
	}
	
	public static void studentGeneratorTest(int generateStudents) {
		ArrayList<Student> students = new ArrayList<Student>();
		int generatedStudents = 0;
		try {
			for(int i = 0; i < generateStudents; i++) {
				students.add(studentGenerator());
				generatedStudents++;
				System.out.println("Student No " + (i+1) + ": " + students.get(i).toString());
			}
		} catch (Exception e) {
			System.err.println("somehow got an error");
		} finally {
			System.out.printf("Expected result of generated students is: %d and the total generated students are: %d",generateStudents , generatedStudents);
		}
	}
	
	public static Student studentGenerator() {

		String[] names = {"Ivan", "Mariya", "Stoyan", "Petyr", "Petya", "Lilly"};
		String[] specialities = {"Informatics", "STD", "BIT", "Mathematics"};
		String[] universities = {"PU", "NBU", "SU", "UHT"};
		int arrayIndex = ThreadLocalRandom.current().nextInt(0, names.length);
		String name = names[arrayIndex];
		
		arrayIndex = ThreadLocalRandom.current().nextInt(0, specialities.length);
		String speciality = specialities[arrayIndex];
		
		arrayIndex = ThreadLocalRandom.current().nextInt(0, universities.length);
		String university = universities[arrayIndex];
		
		int facNumber = ThreadLocalRandom.current().nextInt(111111, 999999);
		
		int egn = ThreadLocalRandom.current().nextInt(111111, 999999);
		
		return new Student(name, egn, university, speciality, facNumber);
	}

	
	private static void testAddingArray() {
		ArrayList<Person> test1 = new ArrayList<Person>();
		Student testStudent1 = new Student("Gosho", 132, "PU", "INF", 133);
		Student testStudent2 = new Student("Kiro", 1333, "PU", "INF", 121);
		Student testStudent3 = new Student("Pesho", 1222, "PU", "SE", 122);
		Student testStudent4 = new Student("Tanya", 1112, "PU", "BIT", 111);
		Student testStudent5 = new Student("Tedo", 111, "PU", "BIT", 100);

		Professor testProfessor1 = new Professor("Head", "George", true, 43, 165, 80);
		Professor testProfessor2 = new Professor("Staff", "Peter", true, 36, 183, 74);
		Professor testProfessor3 = new Professor("Assistant", "Victorya", false, 27, 170, 57);
		Professor testProfessor4 = new Professor("Head-Assistant", "Elena", false, 25, 174, 59);

		RichStudent2 testRichStudent1 = new RichStudent2("Gogi", 992, "PU", "SE", 333);
		RichStudent2 testRichStudent2 = new RichStudent2("Stefan", 922, "PU", "SE", 550);
		RichStudent2 testRichStudent3 = new RichStudent2("Tosho", 888, "PU", "INF", 444);

		
		test1.add(testStudent1);
		test1.add(testStudent2);
		test1.add(testStudent3);
		test1.add(testStudent4);
		test1.add(testStudent5);
		
		test1.add(testProfessor1);
		test1.add(testProfessor2);
		test1.add(testProfessor3);
		test1.add(testProfessor4);

		test1.add(testRichStudent1);
		test1.add(testRichStudent2);
		test1.add(testRichStudent3);

//		RichStudent testRandomPerson1 = new RichStudent("Kris", 999, "PU", "INF", 999);
//		RichStudent testRandomPerson2 = new RichStudent("Rado", 669, "PU", "INF", 966);
//		test1.add(testRandomPerson1);
//		test1.add(testRandomPerson2);  //Гърмят с грешка понеже не са от тип Person
		
		People.showStats(test1);
	}
	
}
