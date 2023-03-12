package week2assignement;

public class PrintDuplicate {
	public static void main(String[] args) {
		//create array
		int[] arr= {2,3,4,5,2,3,2,4,89};
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			
		
		count=1;
		for (int j = i-2; i < arr.length; j++) {
			
			if(arr[i]==arr[j])
				count++;
			
		}
	}
}}