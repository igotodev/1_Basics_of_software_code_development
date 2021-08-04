package by.godev.basic.linear.task6;

import java.util.Scanner;

/*
 * 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае:
 * 
 * (рисунок с изображением закрашенной области)  
 * https://raw.githubusercontent.com/Java0Tutor/1_Basics_of_software_code_development/master/Practice%20(tasks).pdf
 * */

public class LinearTask6 {

	public static void main(String[] args) {
		int x;
		int y;

		System.out.print("Пожалуйста, введите x\n>> ");
		x = getIntFromConsole();
		System.out.print("Пожалуйста, введите y\n>> ");
		y = getIntFromConsole();

		System.out.println(checkInclude(x, y));

	}

	public static int getIntFromConsole() {
		// игнорирует предупреждение о закрытии потока System.in
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int num;
		
		while (!scan.hasNextInt()) {
			System.out.println("Неверный ввод. " + "Программа использует натуральные числа." + "\nПопробуйте еще раз!");
			scan.next();
			System.out.print(">> ");
		}
		
		num = scan.nextInt();
		return num;
	}

	public static boolean checkInclude(int x, int y) {
		if ((y <= 4 && y > 0 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4)) {
			return true;
		}
		return false;
	}

}
