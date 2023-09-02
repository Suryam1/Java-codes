package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AddEmployee {
	
	private static Scanner input;
	private int N;
	
	private static final int TOTAL_DATA=4;
	private Map<String, List<String>> map;
	private List<String>list;

	static {
		input = new Scanner(System.in);
	}
	
	
	public AddEmployee(int N) {
		// TODO Auto-generated constructor stub
		N=input.nextInt();
		this.N=N;
	}
	
	public int getN() {
		return N;
	}
	
	public void addEmployee(int total_employees) {
		String emp_id = null;
		map=new HashMap<String, List<String>>();
		for(int i=0;i<total_employees;i++) {
			list = new ArrayList<String>();
			
			emp_id = input.next();
			
			for(int e=0;e<TOTAL_DATA;e++) {
				list.add(input.next());
			}
			map.put(emp_id, list);
		}
	}

	public void showEmployeeData() {
		for(Map.Entry<String, List<String>> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=0;
		AddEmployee obj = new AddEmployee(N);
		
		obj.addEmployee(obj.getN());
		obj.showEmployeeData();
	}

}
