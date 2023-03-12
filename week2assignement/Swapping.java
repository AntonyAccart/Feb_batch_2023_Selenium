package week2assignement;

public class Swapping {
	public static void main(String[] args) {
		// intialaze a and b
		int a = 10;
		int b = 20;
//		int temp= a;
//		a=b;
//		b=temp;
//		System.out.println(a);
		// System.out.println(b);
		// using the operation
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);

	}

}
