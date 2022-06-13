package personalExceptions;

import java.util.Scanner;

public class TextToStudent {
	Scanner sc = new Scanner(System.in);

	public void studentNameSc(Student student) {
		System.out.println("Please enter students first name: ");
		student.setFirstName(sc.nextLine());
	}

	public void studentSurnameSc(Student student) {
		System.out.println("Please enter students last name: ");
		student.setLastName(sc.nextLine());
	}

	public void studentGenderSc(Student student) {
		System.out.println("Please enter MALE if student is male and FEMALE if student is female: ");
		student.setGender(Gender.valueOf(sc.nextLine()));
	}

	public void studentIdSc(Student student) {
		System.out.println("Please enter ID of a student: ");
		student.setId(sc.nextInt());
	}

	public void studentGroupSc(Student student) {
		System.out.println("Please enter Group name of a student: ");
		student.setGroupName(sc.nextLine());
	}

	public void studentAllSc(Student student) {
		System.out.println("Please enter students first name: ");
		student.setFirstName(sc.nextLine());
		
		System.out.println("Please enter students last name: ");
		student.setLastName(sc.nextLine());
		
		System.out.println("Please enter MALE if student is male and FEMALE if student is female: ");
		student.setGender(Gender.valueOf(sc.nextLine()));
		
		System.out.println("Please enter ID of a student: ");
		student.setId(sc.nextInt());
		
		System.out.println("Please enter Group name of a student: ");
		student.setGroupName(sc.nextLine());

	}
}
