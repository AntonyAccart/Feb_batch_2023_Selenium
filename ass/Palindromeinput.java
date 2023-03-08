package week3.day2.ass;

import java.util.Scanner;

public class Palindromeinput {
public static void main(String[] args) {
	Scanner user =new Scanner(System.in);
			System.out.println("enter the word");
	String input=user.nextLine();
	char[] character=input.toCharArray();
	String reverse="";
for (int i = 0;  i< character.length; i++) {
	reverse=reverse+character[i];
	
}

if(input.equals(reverse)) {
	System.out.println(input+ " is a palindrome");
}
else
{System.out.println(input+"not a palindrome");
}
}
}
