package week2assignement;

import java.util.Arrays;

public class Missingelement {
	public static void main(String[] args) {
		int[] number= {1,4,8,2,3,6,7};
		
		//sort the Array in Ascending order
		Arrays.sort(number);
		//iterate the values from 0 to Array length
		for (int i = 0; i < number.length; i++) {
			//check the conditon using if statement
			if(number[i]!=i+1) {
				System.out.println(i+1);
				break;
			}
		}
	}
	}

