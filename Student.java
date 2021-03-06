package personalExceptions;

public class Student extends Human {
	private int id;
	private String groupName;

	public Student(String firstName, String lastName, Gender gender, int id, String groupName) {
		super(firstName, lastName, gender);
		this.id = id;
		this.groupName = groupName;
	}

	public Student(String firstName, String lastName, Gender gender) {
		super(firstName, lastName, gender);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", groupName=" + groupName + "]";
	}

}
