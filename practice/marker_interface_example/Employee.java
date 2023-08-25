package practice.marker_interface_example;

public class Employee implements Insertable,Deletable,Updatable,Readtable {

	private Integer serial_no=0;
	
	private String id;
	private String name;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Integer getSerial_no() {
		return ++serial_no;
	}
	public void setSerial_no(Integer serial_no) {
		this.serial_no = serial_no;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
