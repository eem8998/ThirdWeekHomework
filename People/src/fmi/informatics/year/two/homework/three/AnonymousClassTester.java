package fmi.informatics.year.two.homework.three;

import fmi.informatics.interfaces.Adaptable;
import fmi.informatics.people.Student;

public class AnonymousClassTester {
	
	public static void main(String[] args) {
		AnonymousClassTester tester = new AnonymousClassTester();
		tester.testAnonymousClass();
		tester.studentNameInstanceTest();
	}

	public void studentNameInstanceTest() {
		System.out.println(Student.class.getName()); //Не знам как да го направя, помощ!
//		try {
//			Class testForName = Class.forName(Student);
//			Student testInstance = (Student)testForName.newInstance();
//			testInstance.setName("Tosho");
//			testInstance.setEgn(333);
//			testInstance.setUniversity("PU");
//			testInstance.setSpeciality("INF");
//			testInstance.setFacNumber(331);
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
	
	public void testAnonymousClass() {
		System.out.println(anonymous.getClass().getName());
		anonymous.think();
		anonymous.study();
		anonymous.act();
		
	}
	
	Adaptable anonymous = new Adaptable() {
		
		@Override
		public void think() {
			System.out.println("Testing 'think' method");
		}
		
		@Override
		public void study() {
			System.out.println("Using 'study' method");
		}
		
		@Override
		public void act() {
			System.out.println("Act act act");
		}
	};

}
