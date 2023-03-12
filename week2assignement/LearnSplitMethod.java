package week2assignement;

public class LearnSplitMethod {

public static void main(String[] args) {
	// declare the string
	String  text="I like     chicken      briyani";
	String[] split = text.split("\\s+");
	int length = split.length;
			//print the length
	System.out.println(length);
	// intitalize count=0
	int count=0;
	//incremenrt using for loop from 0 to length of the string
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
		//count=count+1;
		count++;
	}
	
	System.out.println("count"+count);
}
}
