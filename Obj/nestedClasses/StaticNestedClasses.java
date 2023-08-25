package Obj.nestedClasses;

public class StaticNestedClasses {
	
	//NON STATIC CLASS
	//private String companyName;
	
	/*
	public class CandidateInfo {
		
		private String name;
		private int age;
		
		private String getName() {
			return name;
		}
		private void setName(String name) {
			this.name = name;
		}
		
		private int getAge() {
			return age;
		}
		private void setAge(int age) {
			this.age = age;
		}
		
		private String getCompanyName() {
			return companyName;
		}
		private void setCompanyName(String _companyName) {
			companyName=_companyName;
		}
		
	}
	*/
	

	//STATIC CLASS
	static private String companyName;
	
	public static class CandidateInfo {
			
			private String name;
			private int age;
			
			private String getName() {
				return name;
			}
			private void setName(String name) {
				this.name = name;
			}
			
			private int getAge() {
				return age;
			}
			private void setAge(int age) {
				this.age = age;
			}
			
			private String getCompanyName() {
				return companyName;
			}
			private void setCompanyName(String _companyName) {
				companyName=_companyName;
			}
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNestedClasses obj=new StaticNestedClasses();
		
		//CandidateInfo objCI= obj.new CandidateInfo();				//IN CASE OF NON-STATIC
		
		CandidateInfo objCI=new CandidateInfo();					//IN CASE OF STATIC
		
		
		objCI.setCompanyName("Infosys");
		objCI.setName("Suryam");
		objCI.setAge(21);
		
		System.out.println("Company Name : "+objCI.getCompanyName());
		System.out.println("Name : "+objCI.getName());
		System.out.println("Age : "+objCI.getAge());
	}

}
