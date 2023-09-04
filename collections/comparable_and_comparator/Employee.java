package collections.comparable_and_comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private Double salary;
	
	private LocalDate joiningDate;
	public Employee(int id,String name,Double salary,LocalDate joiningDate) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.joiningDate=joiningDate;
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	@Override
	public int compareTo(Employee anotherEmployee){
		return this.getId()-anotherEmployee.getId();
		//return this.getName().compareTo(anotherEmployee.getName());
	}
	
	//Two employees are equal if their IDs are equal
	@Override
	public boolean equals(Object o){
		if(this==o) return true;
		if(o==null||getClass()!=o.getClass()) return false;
		Employee employee=(Employee) o;
		return id==employee.id;
	}
	@Override
	public String toString(){
		return "{id:"+id+" name:"+name+" salary:"+salary+" joiningDate:"+joiningDate+"}";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees=new ArrayList<>();
		
		employees.add(new Employee(1010,"Rajeev",10000.00,LocalDate.of(2010, 7, 10)));
		employees.add(new Employee(1004,"Chris",9000.00,LocalDate.of(2017, 3, 19)));
		employees.add(new Employee(1015,"David",100.00,LocalDate.of(2017, 9, 10)));
		
		System.out.println("Employees(Before Sorting)"+employees);  
		//if we don't override toString method it will print memory references of these fields
		
		
		for(Employee emp:employees){
			System.out.println(emp.getId()+"-"+emp.getName()+"-"+emp.getSalary()+"-"+emp.getJoiningDate());
		}
		
		
		//if we don't emplement Comparable interface we cannot use this method as we are comparing user defined data
		//This will use the compareTo() method of "Employee" class to  compare two employees and sort them.
		Collections.sort(employees);  
		
		System.out.println("Employees(After Sorting) "+employees);
		for(Employee emp:employees){
			System.out.println(emp.getId()+"-"+emp.getName()+"-"+emp.getSalary()+"-"+emp.getJoiningDate());
		}

	}

}
