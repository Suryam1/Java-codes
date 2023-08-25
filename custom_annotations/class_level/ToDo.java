package custom_annotations.class_level;

@ToDoList
public class ToDo {

	public ToDo() {
		// TODO Auto-generated constructor stub
	}

	public void createToDoList() {
		System.out.println("Creating.....");
	}
	
	public void notAllowed() {
		System.out.println("Sorry you are not allowed to do this.");
	}
}
