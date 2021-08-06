package by.godev.basic.branching.task5;

/*
 * 5. Вычислить значение функции: x^2-3x+9, если x <= 3; 1/((x^3)+6), если x > 3.
 * */

public class BranchingTask5 {

	public static void main(String[] args) {
		double x = 2;

		if (x <= 3) {
			System.out.println("F(" + x + ") = " + ((Math.pow(x, 2) - 3 * x + 9)));
		} else if (x > 3) {
			System.out.println("F(" + x + ") = " + (1 / (Math.pow(x, 3) + 6)));
		}
	}

}
