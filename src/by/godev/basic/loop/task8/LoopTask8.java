package by.godev.basic.loop.task8;

import java.util.Arrays;

/*
 * 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 * */

public class LoopTask8 {

	public static void main(String[] args) {
		int[] firstArr = new int[] {};
		int[] secondArr = new int[] {};

		int a;
		int b;

		a = 10544378;
		b = 695872;

		firstArr = arrIntFromDigits(a);
		secondArr = arrIntFromDigits(b);

		System.out.print("В обоих числа присутствуют числа: ");
		for (int i = 0; i < firstArr.length; i++) {
			for (int j = 0; j < secondArr.length; j++) {
				if (firstArr[i] == secondArr[j]) {
					System.out.print(firstArr[i] + ", ");
				}
			}
		}
		System.out.print("\n");
	}

	public static int[] arrIntFromDigits(int a) {
		int[] arr = new int[] {};

		while (a != 0) {
			arr = Arrays.copyOf(arr, arr.length + 1);
			arr[arr.length - 1] = a % 10;
			a = a / 10;
		}
		return arr;
	}

}