package by.godev.basic.branching.task4;

/*
 * 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
 * Определить, пройдет ли кирпич через отверстие.
 * */

public class BranchingTask4 {

	public static void main(String[] args) {
		double a;
		double b;

		double x;
		double y;
		double z;

		a = 3.1;
		b = 3.2;

		x = 3.2;
		y = 4;
		z = 3.1;

		// ab(xy xz yz) ba(xy xz yz)
		if (((a >= x) && (b >= y)) || ((a >= x) && (b >= z)) || ((a >= y) && (b >= z)) || ((b >= x) && (a >= y))
				|| ((b >= x) && (a >= z)) || ((b >= y) && (a >= z))) {
			System.out.println("Все впорядке. Кирпич проходит.");
		} else {
			System.out.println("Отверстие слишком мало. Кирпич не проходит.");
		}

	}
}
