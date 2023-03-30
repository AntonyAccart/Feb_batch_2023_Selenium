package week6day3ass;
import java.util.*;
public class FindSecondLargest {
	

	
	    public static void main(String[] args) {
	        int[] data = {3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7};

	        
	        Set<Integer> set = new TreeSet<>();

	        
	        for (int i = 0; i < data.length; i++) {
	            set.add(data[i]);
	        }

	        List<Integer> list = new ArrayList<>(set);

	       
	        System.out.println(list.get(list.size() - 2));
	    }
	}


