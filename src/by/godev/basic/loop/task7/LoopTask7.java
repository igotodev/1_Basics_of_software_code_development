package by.godev.basic.loop.task7;

import java.util.Scanner;

/*
 * 7. Для каждого натурального числа в промежутке от m до n вывести все делители, 
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 * */

public class LoopTask7 {

	public static void main(String[] args) {
		int first;
		int last;

		System.out.print("Пожалуйста, введите начало промежутка: ");
		first = getIntFromConsole();
		System.out.print("Пожалуйста, введите конец промежутка: ");
		last = getIntFromConsole();

		if (first > last) {
			int mid;

			mid = first;
			last = first;
			first = mid;
		}

		for (int i = first; i <= last; i++) {
			int d = 0;

			System.out.print("Дилители числа " + i + ": ");
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.print(j + ", ");
					d++;
				}
			}
			System.out.print("\n");

			if (d == 0) {
				System.out.println("Кроме самого числа " + i + " и единицы делителей нет.");
			}
		}

	}

	public static int getIntFromConsole() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int num;
		while (!scan.hasNextInt()) {
			System.out.println("Пожалуйста, введите целое число!");
			scan.next();
		}
		num = scan.nextInt();

		return num;
	}

}
