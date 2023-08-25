package oop.encapsulation;

public class EncapsulationExample2 {
	private String collegeCode;
	private String studentName;
	private String studentCode;

	public String getCollegeCode() {
		return collegeCode;
	}

	public void setCollegeCode(String collegeCode) {
		this.collegeCode = collegeCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}
	
	protected void getStudentDetails() {
		System.out.println("College Code : "+collegeCode);
		System.out.println("Student Name : "+studentName);
		System.out.println("Student Code : "+studentCode);
	}

	EncapsulationExample2() {
		// TODO Auto-generated constructor stub
		System.out.println("No-Argumented Constructor");
	}

}
