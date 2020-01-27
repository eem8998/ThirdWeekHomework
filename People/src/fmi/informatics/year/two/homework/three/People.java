package fmi.informatics.year.two.homework.three;

import java.util.ArrayList;

import fmi.informatics.composition.RichStudent2;
import fmi.informatics.people.Person;
import fmi.informatics.people.Professor;
import fmi.informatics.people.Student;

public class People {
	
	public static void showStats(ArrayList<Person> people) {
		int professors = 0;
		int students = 0;
		int richStudents = 0;
		int totalPeople = people.size();
		
		for(int i = 0; i < people.size(); i++) {
			
			if(people.get(i) instanceof Professor) {
				professors++;
			}else if(people.get(i) instanceof RichStudent2) { //Важно! Ако се използва Student преди RichStudent2 пуска RichStudent2 в students, заради онаследяването
				richStudents++;
			}else if(people.get(i) instanceof Student) {
				students++;
			}
		}
		
		System.out.printf("Out of %d people, there are:\n%d professors\n%d students\n%d rich students\n\n", totalPeople, professors, students, richStudents);
		
		for(Person studyingStudents : people) {	//Исках да опитам for-each цикъл, не знам как работи точно...
			if(studyingStudents instanceof Student) {
				studyingStudents.study();
			}
		}
	}
	
}
