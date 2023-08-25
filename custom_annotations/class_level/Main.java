package custom_annotations.class_level;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToDo obj = new ToDo();
		if(obj.getClass().isAnnotationPresent(ToDoList.class)) {
			obj.createToDoList();
		}
		else {
			obj.notAllowed();
		}
	}

}
