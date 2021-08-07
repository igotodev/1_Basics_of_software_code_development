package by.godev.basic.loop.task6;

/*
 * 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 * */

public class LoopTask6 {

	public static void main(String[] args) {
		char ch;

		for (int i = 33; i < 127; i++) {
			ch = (char) i;
			System.out.println(ch + " = " + i);
		}

	}

}
