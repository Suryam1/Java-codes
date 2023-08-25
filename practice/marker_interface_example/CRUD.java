package practice.marker_interface_example;

public class CRUD {

	Employee obj;
	
	public CRUD() {
		// TODO Auto-generated constructor stub
		obj=new Employee();
	}
	
	
	public int addEmployees(String id,String name) {
		if(obj instanceof Insertable) {
			obj.setId(id);
			obj.setName(name);
			return 1;
		}
		return 0;
	}
	
	public int showEmployees() {
		if(obj instanceof Readtable) {
			System.out.println(obj.getSerial_no()+". "+obj.getId()+" - "+obj.getName());
			return 1;
		}
		return 0;
	}
	
	public int deleteEmployee(String id) {
		if(obj instanceof Deletable) {
			System.out.println("Employee is Successfully Deleted with id : "+id);
			return 1;
		}
		return 0;
	}
	
	public int updateEmployee(String id,String name) {
		if(obj instanceof Updatable) {
			obj.setId(id);
			obj.setName(name);
			return 1;
		}
		return 0;
	}

}
