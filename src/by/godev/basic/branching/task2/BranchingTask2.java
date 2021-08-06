package by.godev.basic.branching.task2;

/*
 * 2. Найти max{min(a, b), min(c, d)}.
 * */

public class BranchingTask2 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;

		a = 5.1;
		b = 3.8;
		c = 3.6;
		d = 4.2;

		System.out.println(getMaxFromTwoMin(a, b, c, d));
	}

	public static double getMaxFromTwoMin(double oneA, double oneB, double twoC, double twoD) {
		return Math.max(Math.min(oneA, oneB), Math.min(twoC, twoD));
	}

}
