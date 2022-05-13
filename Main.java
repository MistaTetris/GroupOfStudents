package personalExceptions;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Alex", "Ronin", Gender.MALE, 111, "Group_A");
		Student student2 = new Student("Maria", "Sarka", Gender.FEMALE, 112, "Group_A");
		Group groupA = new Group();
		groupA.setGroupName("Group_A");
		try {
			groupA.addStudent(student1);
			for (int i = 0; i < 10; i++) {
				if(i%2==0) {
					groupA.addStudent(student2);
				}else{
					groupA.addStudent(student1);}
			}
		} catch (GroupOverflowException e) {
			System.out.println("No place in the group.");
		}
		
		try {
			Student studentSearch = groupA.searchStudentByLastName("Ronin");
			System.out.println(studentSearch);
		} catch (StudentNotFoundException e) {
			System.out.println("Such student does not exists!");
		}

		System.out.println("\n");
		
		Student[] students = groupA.getStudents();
		
		boolean tf = groupA.removeStudentById(111);
		
		System.out.println(tf+"\n");

//		tf = groupA.removeStudentById(114);
//		
//		System.out.println(tf+"\n");
		
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}

}
