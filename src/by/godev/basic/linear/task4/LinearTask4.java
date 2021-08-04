package by.godev.basic.linear.task4;

/*
 * 4. Дано действительное число R вида nnn.ddd 
 * (три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 * */

public class LinearTask4 {

	public static void main(String[] args) {
		double t = 123.456;

		int whole;
		double afterPoint;
		double inverted;

		whole = (int) t; // 123
		afterPoint = (t - whole) * 1000; // 0.456 * 1000 = 456.00

		// приведение afterPoint к int для усечения погрешности double
		inverted = ((int) afterPoint) + ((double) whole / 1000); // 456 + 0.123

		System.out.println("Искомое число: " + inverted);
	}

}
