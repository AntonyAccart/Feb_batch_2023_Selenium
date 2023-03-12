package week2assignement;

public class EqualMethod {
	public static void main(String[] args) {
		String text = "Test";
		text = "leaf";
		System.out.println(text);

		String m1 = "antony";
		String m2 = "antony";

		// a==b .equal
		// if condtion with == will check without case senstive
		if (m1 == m2) {
			System.out.println("Both are equal");
		} else {
			System.out.println("not equal");
		}

		String text1 = new String("Antony");
		String text2 = new String("antony");
		//check the if condtion
		if (m1 == m2) {
			boolean equals = text1.equals(text2);
			System.out.println(equals);
			// if condtion with .equal will check without case senstive
			if (text1.equals(text2)) {
				System.out.println("Both are equal");
			} else {
				System.out.println("not equal");
			}

		}
	}
}