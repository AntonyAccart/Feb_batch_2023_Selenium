package week2assignement;

public class Calculator {
// intialize the values
	int c, d, e, f;

	public void addTwoNumber(int a, int b) {
//arithmatic operation
		c = a + b;

		System.out.println(c);
	}

	public void subTwoNumber(int a, int b) {

		// arithmatic operation
		d = a - b;
		System.out.println(d);
	}

	public void mulTwoNumber(int a, int b) {
		// arithmatic operation
		e = a * b;
		System.out.println(e);
	}

	public void divTwoNumber(int a, int b) {
		// arithmatic operation
		f = a / b;
		System.out.println(f);
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.addTwoNumber(2, 9);
		calc.subTwoNumber(2, 9);
		calc.mulTwoNumber(5, 4);
		calc.divTwoNumber(20, 10);
	}
}
