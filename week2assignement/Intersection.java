package week2assignement;

public class Intersection {

	public static void main(String[] args) {
		// create array1
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		// create array2
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };
//intitlaze the for loop for array 1
		for (int i = 0; i < arr1.length; i++) {
			// intiliaze the for loop for array2
			for (int j = 0; j < arr2.length; j++) {
				// chechk the condition
				if (arr1[i] == arr2[j]) {
					System.out.print(arr1[i] + " ");
				}
			}
		}
	}
}
