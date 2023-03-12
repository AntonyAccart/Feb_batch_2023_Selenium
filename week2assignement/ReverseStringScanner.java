package week2assignement;

import java.util.Scanner;

public class ReverseStringScanner {


public static void main(String[] args) {
	// use scanner clas to get the input from the user
	Scanner text =new Scanner(System.in);
	System.out.println("enter text");
	String nextline=text.next();
	//covert the string to the character array
	char[] character=nextline.toCharArray();
	// use for loop by dincrement value from length of the character to 0
	for (int i = character.length-1;i>=0; i--) {
		System.out.println(character[i]);
	}
}
}
