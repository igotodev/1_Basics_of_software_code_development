package by.godev.basic.loop.task4;

/*
 * 4. Составить программу нахождения произведения квадратов первых двухсот чисел. 
 * */

public class LoopTask4 {

	public static void main(String[] args) {
		long multi = 1;

		for (int i = 1; i <= 200; i++) {
			multi *= Math.pow(i, 2);
			if (multi < 1 || multi == 9223372036854775807L) {
				System.out.println("Превышена вместимость переменной типа long");
				System.exit(1);
			}
		}

		System.out.println("Произведение квадратов первых двухста чисел равна " + multi);
	}

}
