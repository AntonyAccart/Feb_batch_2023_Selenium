package week2assignement;

public class SumofDigit {

	public static void main(String[] args) {
		// intitalize sum=0
		int sum=0;
		//increment the value from O by intializing i using for loop till the number we want to know.
				for (int i = 0; i <= 55; i++) {
				// if condition is used to check
					if(i%2==1) {
						sum=sum+i;
			         }
			     }
			     System.out.println("Sum of odd digit numbers from 1 to 2 is " + sum);
			 }
			
}
