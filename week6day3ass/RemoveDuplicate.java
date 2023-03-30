package week6day3ass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;



public class RemoveDuplicate {
public static void main(String[] args) {
	int[] num= {1,2,3,4,5,6,6,2,4,};
	
	Set<Integer> val=new LinkedHashSet<Integer>();
	
	for (int i = 0; i < num.length; i++) {
		if(!val.add(num[i])) {
			System.out.println(num[i]);
		}
	}
	
	System.out.println(val);
	
	
	
}
}