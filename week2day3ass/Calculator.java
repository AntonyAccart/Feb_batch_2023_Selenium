package week2day3ass;

public class Calculator {
	int c, g;
	double k;
	float z;

	public void additionTwoNumber(int a, int b) {
		c = a + b;
		System.out.println(c);
	}

	public void subtractionTwoNumber(int e, int f) {
		g = e - f;

		System.out.println(g);
	}

	public void multipleTwoNumber(double i, double j) {
		k = i * j;
		System.out.println(k);

	}

	public void divideTwoNumber(float x, float y) {
		z = x / y;
		System.out.println(z);

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.additionTwoNumber(10, 20);
		calc.subtractionTwoNumber(90, 20);
		calc.multipleTwoNumber(2, 2);
		calc.divideTwoNumber(33, 11);

	}
}
