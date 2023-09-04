package collections.comparable_and_comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees=new ArrayList<>();
		
		employees.add(new Employee(1010,"Rajeev",10000.00,LocalDate.of(2010, 7, 10)));
		employees.add(new Employee(1004,"Chris",9000.00,LocalDate.of(2017, 3, 19)));
		employees.add(new Employee(1015,"David",100.00,LocalDate.of(2017, 9, 10)));
		
		System.out.println("Employees : "+employees);
		//Comparator helps in doing comparision based on multiple fields
		
		//Sort by name 
		
		Comparator<Employee> employeeNameComparator=new Comparator<Employee>(){
			@Override
			public int compare(Employee e1,Employee e2){
				return e1.getName().compareTo(e2.getName());    //object's class must implement Comparable interfaces
			}
		};
		Collections.sort(employees,employeeNameComparator);
		System.out.println("EMployees (Sorted by Name) : "+employees);
		
		//Sort by salary
		
		Comparator<Employee> employeeSalaryComparator=new Comparator<Employee>(){
			@Override
			public int compare(Employee e1,Employee e2){
				if(e1.getSalary()<e2.getSalary()){
					return -1;
				}else if(e1.getSalary()>e2.getSalary()){
					return 1;
				}else{
					return 0;
				}
			}
		};
		
		Collections.sort(employees,employeeSalaryComparator);
		System.out.println("EMployees (Sorted by Salary) : "+employees);
		
		
		//Sort by JoiningDate
		
		Comparator<Employee> employeeJoiningDateComparator=new Comparator<Employee>(){
			@Override
			public int compare(Employee e1,Employee e2){
				return e1.getJoiningDate().compareTo(e2.getJoiningDate());  
			}
		};
		
		Collections.sort(employees,employeeJoiningDateComparator);
		System.out.println("EMployees (Sorted by JoiningDate) : "+employees);
		

	}

}
