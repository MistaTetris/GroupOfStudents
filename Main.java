package personalExceptions;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Alex", "Ronin", Gender.MALE, 111, "Group_A");
		Student student2 = new Student("Maria", "Sarka", Gender.FEMALE, 112, "Group_A");
		Student student3 = new Student("Donna", "Lumber", Gender.FEMALE, 113, "Group_A");
		Student student4 = new Student("Richard", "Soul", Gender.MALE, 114, "Group_A");
		Student student5 = new Student("Lisbon", "Grey", Gender.MALE, 115, "Group_A");
		Student student6 = new Student("Adita", "Rivera", Gender.FEMALE, 116, "Group_A");
		Student student7 = new Student("Lucy", "Pak", Gender.FEMALE, 117, "Group_A");
		Student student8 = new Student("James", "Goodwin", Gender.MALE, 118, "Group_A");
		Student student9 = new Student("Olga", "Kimeshova", Gender.FEMALE, 119, "Group_A");
		Student student10 = new Student("Thomass", "Roy", Gender.FEMALE, 120, "Group_A");
		Student student11 = new Student("Eden", "Green", Gender.FEMALE, 121, "Group_A");

		Student[] arrOfStudents = { student1, student2, student3, student4, student5, student6, student7, student8, student9,
				student10, student11 };

		Group groupA = new Group();
		groupA.setGroupName("Group_A");
		try {
			for (int i = 0; i < 11; i++) {
				groupA.addStudent(arrOfStudents[i]);
			}
		} catch (GroupOverflowException e) {
			System.out.println("No place in the group.");
		}

		try {
			Student studentSearch = groupA.searchStudentByLastName("Ronan");
			System.out.println(studentSearch);
		} catch (StudentNotFoundException e) {
			System.out.println("Such student does not exists!");
		}

		System.out.println("\n");

		arrOfStudents = groupA.getStudents();

		boolean tf = groupA.removeStudentById(1111);

		System.out.println(tf + "\n");

		for (Student student : arrOfStudents) {
			System.out.println(student);
		}
		System.out.println("\n");

//		Arrays.sort(arrOfStudents, Comparator.nullsLast(new LastNameToLexicalOrderComparator()));
//
//		for (Student student : arrOfStudents) {
//			System.out.println(student);
//		}
		
//		TextToStudent scanner = new TextToStudent();
		
		

	}

}
