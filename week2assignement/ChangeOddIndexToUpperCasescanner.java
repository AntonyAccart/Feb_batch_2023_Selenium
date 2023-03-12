package week2assignement;

import java.util.Scanner;

public class ChangeOddIndexToUpperCasescanner {

	public static void main(String[] args) {
		//scanner class is used to get the input from user
		Scanner text=new Scanner (System.in);
		System.out.println("enter the input sentence");
		String input =text.next();
	//converting thse string into character array
		char[] charArray = input.toCharArray();
	//incrememnt the i from 0 to length of the array using for loop	
		for (int i = 0; i < charArray.length; i++) {
		//check the if condtion	
			if(i%2!=0) {
				//touppercase method is used 
				char name= Character.toUpperCase(charArray[i]);
				System.out.print(name);
				}
			else {
				System.out.print(charArray[i]);
			}
		}
		
	}
	}