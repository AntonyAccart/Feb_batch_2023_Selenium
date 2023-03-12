package week2assignement;

import java.util.Scanner;

public class ReversetheString {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="antonyaccart";
		int length = str.length();
		System.out.println(length);
		char[] character= str.toCharArray();
		for(int i=character.length-1;i>=0;i--)
		{
			System.out.print(character[i]);
		}
		String str2="accart";
		String upperCase = str2.toUpperCase();
        System.out.println(upperCase);
        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase);
	}

}
