package arrays;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Arrays.sort(array);
 * Arrays.sort(array,fromInde,toIndex);
 * 
 * Arrays.fill(array,value);
 * Arrays.fill(array,fromIndex,toIndex,value);
 * 
 * Arrays.binarySearch(array,key);
 * Arrays.binarySearch(array,fromIndex,toIndex,key);
 * 
 * Arrays.equals(array_1,array_2);
 * Arrays.equals(array_1,fromIndex_1,toIndex_1,array_2,fromIndex_2,toIndex_2);
 * 
 * Arrays.rangeChcek();
 * 
 * Arrays.sort(objectArray,fromIndex,toIndex);
 * 
 * Arrays.hashCode(array);
 * Arrays.deepHashCode(array);      //Returns a hash code based on the "deep contents" of the specified
 * 									//array. If the array contains other arrays as elements, the
 * 									//hash code is based on their contents and so on.
 * 
 * 
 * 
 * 
 * 
 */


public class ArrayClassMethords {
	
	public ArrayClassMethords() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value of N : ");
		int n=input.nextInt();
		int[] arr =new int [n];
		for(int index=0;index<arr.length;index++) {
			arr[index]=input.nextInt();
		}
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayClassMethords obj =new ArrayClassMethords();
		
	}

}
