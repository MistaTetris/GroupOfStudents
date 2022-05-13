package personalExceptions;

import java.util.Arrays;

public class Group {
	private String groupName;
	private Student[] students = new Student[10];

	public void addStudent(Student student) throws GroupOverflowException {
		for (int i = 0; i < 10; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
			if(i==9 && students[i]!=null) {
				throw new GroupOverflowException();
			}
		}
	}

	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
		Integer cnt = null;
		for(int i=0; i<10; i++) {
			if(students[i]!= null && students[i].getLastName() == lastName) {
				cnt=i;
				break;
			}
		}
		
		if(cnt==null) {
			throw new StudentNotFoundException();
		}
		return students[cnt];
	}

	public boolean removeStudentById(int id) {
		boolean tf = false;
			for(int i=0; i<10; i++) {
				if(students[i]!=null && students[i].getId() == id) {
					students[i] = null;
					tf = true;
					return tf;
				}
			}
		return tf;
	}

	public Group(String groupName, Student[] students) {
		super();
		this.groupName = groupName;
		this.students = students;
	}

	public Group() {
		super();
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", students=" + Arrays.toString(students) + "]";
	}
	
	
}
