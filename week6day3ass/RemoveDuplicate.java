package week6day3ass;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
public static void main(String[] args) {
	String text = "PayPal India";
	
	String txt = text.replaceAll("\\s", "");
	String lowerCase = txt.toLowerCase();
	char[] charArray = lowerCase.toCharArray();
    Set<Character> charSet = new LinkedHashSet<Character>();
    Set<Character> dupChar = new LinkedHashSet<Character>();
for (Character charac : charArray) {
	boolean add = charSet.add(charac);
	if(add==false) {
		dupChar.add(charac);
	}
}
System.out.println("Actual text"+charSet);
System.out.println("Duplicated text"+dupChar);
List<Character> list = new ArrayList<Character>(charSet);
List<Character> list1 = new ArrayList<Character>(dupChar);
for (int i = 0; i < list.size(); i++) {
	for (int j = 0; j < list1.size(); j++) {
		if(list.get(i)==list1.get(j)) {
			list.remove(list.get(i));
		}
	}
}
System.out.println("Unique text"+list);

}
}
