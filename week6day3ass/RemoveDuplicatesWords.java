package week6day3ass;

import java.util.HashSet;

public class RemoveDuplicatesWords {

public static void main(String[] args) {
	String text = "We learn java basics as part of java sessions in java week1";
	System.out.println("Original text: " + text);
	String[] split = text.split(" ");
	String removeduplicate = "";
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
			removeduplicate = removeduplicate + split[i] + " ";
		}
	}

	System.out.println("sentence without duplicate: " + removeduplicate);
}}