package week2assignement;
import java.util.Arrays;
public class Anagram {

public static void main(String[] args) {
	
	String str1 = "listen";  //o, p, s, t
	 String str2 = "silent";//o, p, s, t
	////length is used to get the string length 
	 int length1 = str1.length();
	 int length2 = str2.length();
	//To check both string length are equal
	 if(length1==length2) {
		 System.out.println("Length are equal");
	 }else {
		 System.out.println("not equal");
	 }
	 //convert the str1 and str 2 to character
	 char[] charArray = str1.toCharArray();
	
	 char[] charArray2 = str2.toCharArray();
	 
	 //sort the character in Ascending order
	 Arrays.sort(charArray);
	 Arrays.sort(charArray2);
	 
	 System.out.println(Arrays.toString(charArray));
	 System.out.println(Arrays.toString(charArray2));
	 //compare both the string 
	 boolean equals = Arrays.equals(charArray, charArray2);
	 System.out.println(equals);
	 //check the two string are equal
	 if(Arrays.equals(charArray, charArray2)) {
		 System.out.println("The given String is Anagram");
	 }else {
		 System.out.println("not Anagram");
	 }
	 
	 
}

}
