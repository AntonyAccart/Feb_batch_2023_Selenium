package week2assignement;

public class Palindrome {
	public static void main(String[] args) {
		// declare the string which we want to check
		String str = "i";
		//declare the empty string
		String rev = "";
		//covert the string to array
		char[] charArray = str.toCharArray();
		//use for loop in decrement way from length of the array to 0
		for (int i = charArray.length - 1; i >= 0; i--) {
			
			rev = rev + charArray[i];
		}
//chechk the if condition with equalsignorecase method
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		} else
			System.out.println("not a palindrome");

	}
}
