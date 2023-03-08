package week3.day2.ass;

public class Palindrome {
	public static void main(String[] args) {
		String str = "madam";
		// declare the empty string
		String rev = "";
		// convert the string into character array
		char[] charArray = str.toCharArray();
       //iterate the loop using reverse for loop
		for (int i = charArray.length - 1; i >= 0; i--) {
			// store the value in new rew string
			rev = rev + charArray[i];
		}

		if (str.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}
}
