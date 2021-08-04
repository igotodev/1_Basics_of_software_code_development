package by.godev.basic.linear.task2;

/* 2. Вычислить значение выражения по формуле 
 * (все переменные принимают действительные значения):
 * 
 * ( b + √(b^2 + 4 * a * c) / 2 * a) - a^3 * c + b^-2
 * 
 * */
public class LinearTask2 {

	public static void main(String[] args) {
		double a = 1;
		double b = 21.1;
		double c = 2.6;

		double result = solve(a, b, c);
		System.out.println("Искомое значение: " + result);

	}

	public static double solve(double a, double b, double c) {
		if (a == 0) {
			System.out.println("По всей видимости произошла опечатка, " + "на 0 делить нельзя!");
			System.exit(1);
		}

		double part1;
		double part2;

		part1 = b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c));
		part2 = Math.pow(a, 3) * c + Math.pow(b, -2);

		return part1 - part2;

	}

}
