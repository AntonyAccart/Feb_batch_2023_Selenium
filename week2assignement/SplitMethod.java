package week2assignement;

public class SplitMethod {

	public static void main(String[] args) {
		String text = "Amazon has 20,000 employees in chennai";

 //replace the text
		 String replaceAll = text.replaceAll("[^0-9]", "");
		 //replace the number
		 //String replaceAll=text.replaceAll("[0,9]","");
		 //replace the text
		 //String replaceAll=text.replaceAll("[\\D]","");
	 //replace the number
	//String replaceAll=text.replaceAll("[\\d]","");
		// String replaceAll=text.replaceAll("[[^A-z a-z]","");
		System.out.println(replaceAll);
//System.out.println(replaceAll);
//System.out.println(replaceAll);
//System.out.println(replaceAll);
//System.out.println(replaceAll);

//System.out.println(replaceAll);
	}
}
