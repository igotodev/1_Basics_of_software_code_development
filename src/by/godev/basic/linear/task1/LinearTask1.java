package by.godev.basic.linear.task1;

//1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

public class LinearTask1 {
	public static void main(String[] args) {
		double a = 12;
		double b = 7.6;
		double c = 3.1;

		System.out.println("Искомое значение: " + solve(a, b, c));
	}

	public static double solve(double a, double b, double c) {
		return ((a - 3) * b / 2) + c;
	}

}
