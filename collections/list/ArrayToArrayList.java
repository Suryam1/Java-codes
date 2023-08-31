package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {

	public ArrayToArrayList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String[] array1=new String[]{"Messi","Neymar","Ronaldo","Kroos","Maguire","Ramos","Salah"};
		
		//1. Using Arrays.asList(arrr[]) Method -->returns an object
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(array1));
		System.out.println(list1);
		
		
		//2.Using Collections.addAll(Collection,arr[]) Method  --->returns boolean
		ArrayList<String> list2=new ArrayList<>();
		Collections.addAll(list2,array1);//copies the ele of array1 into list2
		System.out.println(list2);
		
		
		//3.Using ArrayList.addAll(Object o) Method  --> returns boolean value
		ArrayList<String> list3=new ArrayList<>();
		list3.addAll(Arrays.asList(array1));    //converting the array to object using Arrays.asList(arr[])
		System.out.println(list3);

	}


}
