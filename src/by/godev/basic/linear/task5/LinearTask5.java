package by.godev.basic.linear.task5;

import java.util.Scanner;

/*
 * 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
 * Вывести данное значение длительности в часах, минутах и секундах 
 * в следующей форме: ННч ММмин SSc.
 * */

public class LinearTask5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int t = 0;

		System.out.print("Пожалуйста, введите секунды: \n>> ");
		if (!scan.hasNextInt()) {
			System.out.println("Некорректный ввод.\nНужно вводить натуральное число!");
			System.exit(1);
		} else {
			t = scan.nextInt();
		}

		System.out.println(t + " секунд это " + convertSecToTime(t));

	}

	public static String convertSecToTime(int t) {
		String output = new String();

		int min;
		int hour;
		int sec;

		hour = t / 3600;
		min = (t - (hour * 3600)) / 60;
		sec = t % 60;

		output = hour + "ч " + min + "м " + sec + "с";
		return output;
	}

}
