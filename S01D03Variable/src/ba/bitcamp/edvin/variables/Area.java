package ba.bitcamp.edvin.variables;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 7;

		int multiplication = a * b;
		// this calculates area of rectangle
		int plus = a + b;
		// this calculates volume of rectangle
		System.out.println("volume of rectangle: " + plus);
		System.out.println("area of rectangle: " + multiplication);

		int r = 5;
		double pi = 3.14;

		double area = r * r * pi;
		// the formula for calculating area of circle is r*r*pi

		System.out.println("area of circle " + area);

		double longNumber = 10.0 / 3;
		System.out.println("Long number: " + longNumber);
		int num = 3;
		int num1 = 4;
		System.out.printf("Ovdje je broj 1: %d i ovdje je broj 2: %d\nDouble %.1f", num,
				num1, longNumber);

	}

}
