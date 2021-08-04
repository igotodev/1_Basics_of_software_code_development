package by.godev.basic.linear.task3;

/*
 * 3. Вычислить значение выражения по формуле 
 * (все переменные принимают действительные значения):
 * 
 * (sin x + cos y / cos x − sin y ) * tg (x * y)
 * 
 * */

public class LinearTask3 {

	public static void main(String[] args) {
		double x = 22.2;
		double y = 16;

		System.out.println("Искомое значение: " + solve(x, y));

	}

	public static double solve(double x, double y) {
		double part1;
		double part2;

		part1 = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y));
		part2 = Math.tan(x * y);

		return part1 * part2;
	}

}
