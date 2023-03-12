package week2assignement;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		
	
	int[] number={1,5,9,2,6,3,5,4,8,7};

	//sort the Array
	Arrays.sort(number);

	// get the length of the array
	int size=number.length;
	// print second largest number
	
	System.out.println(number[size-2]);
}}
