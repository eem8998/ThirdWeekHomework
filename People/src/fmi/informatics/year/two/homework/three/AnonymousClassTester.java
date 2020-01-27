package fmi.informatics.year.two.homework.three;

import fmi.informatics.interfaces.Adaptable;
import fmi.informatics.people.Student;

public class AnonymousClassTester {
	
	public static void main(String[] args) {
		AnonymousClassTester tester = new AnonymousClassTester();
		tester.testAnonymousClass();
		
		try {
			tester.studentNameInstanceTest();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void studentNameInstanceTest() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		//System.out.println(Student.class.getName());
			Student testInstance = (Student)Class.forName(Student.class.getName()).newInstance();
			testInstance.setName("Tosho");
			testInstance.setEgn(333);
			testInstance.setUniversity("PU");
			testInstance.setSpeciality("INF");
			testInstance.setFacNumber(331);
			System.out.println("Student created!");
			System.out.printf("%s %d %s %s %d", 
					testInstance.getName(), testInstance.getEgn(), 
					testInstance.getUniversity(), testInstance.getSpeciality(), 
					testInstance.getFacNumber());
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
