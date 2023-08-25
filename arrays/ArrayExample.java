package arrays;

import java.util.Arrays;

public class ArrayExample {

	public ArrayExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		/*
		Declaring an Array variable*/
		
		//String iceCreamNames[];
		//or
		//String[] iceCreamNames;
		
		//int iceCreamPrices[];
		//or
		//int[] iceCreamPrices;
	
		
		/*Instantiating an Array*/
		//String[] iceCreaMNames=new String[5];
		
		//int[] iceCreamPrices=new int[5];
		
		/*Array Literals*/
		//String[] iceCreamArray= {"Mango","Orange","Pineapple","Chocolate","Milk","Fruity"};
		String[] iceCreamNames= {"Mango","Orange","Pineapple","Chocolate","Milk","Fruity"};
		int[] iceCreamPrices= {30,25,35,45,20,40};
		
		
		//Accessing one values from Array
		//System.out.println("Ice-Cream at INDEX[0] : "+iceCreamNames[0]);
		//System.out.println("Ice-Cream at INDEX[3] : "+iceCreamNames[3]);
		
		/*Accessing all values from Array - Iterating*/
		
		/*for(int index=0;index<iceCreamNames.length;index++) {
			System.out.println("Ice-Cream at INDEX["+index+"] : "+ iceCreamNames[index]);
		}*/
		
		
		/*Updating a value at an array index*/
		//System.out.println("Original Vlaue in Ice-Cream at INDEX[4] : "+iceCreamNames[4]);
		
		/*Sorting the icecreams in array*/
		
		for(String iceCream:iceCreamNames) {
			System.out.println(iceCream);
		}
		
		//Arrays.sort(iceCreamNames);
		Arrays.sort(iceCreamNames,2,4);
		System.out.println();
		
		for(String iceCream:iceCreamNames) {
			System.out.println(iceCream);
		}
		

	}

}
