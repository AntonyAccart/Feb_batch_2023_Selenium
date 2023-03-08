package week3day2ass;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics a part of java session in java class";
		String[] split = text.split(" ");
		String noDuplicates = "";
		for (int i = 0; i < split.length; i++) {
			int count = 0;
			for (int j = i+1; j < split.length; j++) {
				String nill = "";
				if(split[i].equals(split[j])) {
					count++;
					split[j] = nill;
				}
			}
			if(count==0 && split[i]!="nill") {
				noDuplicates = noDuplicates + split[i] + " ";
			}
		}
		System.out.println("Sentence: " + text);
		System.out.println("Senetence without duplicant: " + noDuplicates);
	}

}
