package week3day2ass;

public class ChangeOddIndexToUpperCase {


public static void main(String[] args) {
	
	
	String text = "changeme";
	
	char[] charArray = text.toCharArray();
	
	for (int i = 0; i < charArray.length; i++) {
		
		if(i%2!=0) {
			
			char name= Character.toUpperCase(charArray[i]);
			System.out.print(name);
			}
		else {
			System.out.print(charArray[i]);
		}
	}
	
}
}
