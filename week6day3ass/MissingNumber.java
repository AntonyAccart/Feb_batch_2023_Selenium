package week6day3ass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber {
	
	public static void main(String[] args) {

	    
	    int[] arr = {1, 3, 4, 5, 6, 7, 8, 9, 10};

	    // convert the array to a set to remove duplicates
	    Set<Integer> set = new HashSet<Integer>();
	    for (int i = 0; i < arr.length; i++) {
	        set.add(arr[i]);
	    }


	    List<Integer> list = new ArrayList<>(set);
	    Collections.sort(list);

	    // iterate through the set and find the missing number
	    int missingNum = 0;
	    for (int i = 0; i < list.size() - 1; i++) {
	        if (list.get(i + 1) - list.get(i) != 1) {
	            missingNum = list.get(i) + 1;
	        }
	    }

	    System.out.println("The missing number is: " + missingNum);
	}
}