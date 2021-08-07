package by.godev.basic.loop.task1;

import java.util.Scanner;

/*
 * 1. Напишите программу, где пользователь вводит любое  целое  положительное число. 
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 * */

public class LoopTask1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		long x;
		long sum = 0;

		System.out.print("Пожалуйста, вводите целое положительное число: ");
		while (!scan.hasNextLong()) {
			System.out.println("Неверный ввод. Пожалуйста, вводите целое число!");
			System.out.print("Пожалуйста, вводите целое положительное число: ");
			scan.next();
		}

		x = scan.nextLong();
		if (x < 0) {
			System.out.println("Ошибка! Число должно быть положительным!");
			System.exit(1);
		}

		for (int i = 1; i < x; i++) {
			sum += i;
		}
		System.out.println("Сумма все чисел от 1 до " + x + " равна " + sum);
	}

}
