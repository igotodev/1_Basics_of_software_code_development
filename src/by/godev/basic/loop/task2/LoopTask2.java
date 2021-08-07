package by.godev.basic.loop.task2;

/*
 * 2. Вычислить значения функции на отрезке [а,b] c шагом h:
 *  y = x, если x > 2; y = -x, если x <= 2 
 *  
 * */

public class LoopTask2 {

	public static void main(String[] args) {
		int a;
		int b;
		int h;

		int y;

		a = -6;
		b = 4;
		h = 2;

		for (int i = a; i <= b; i += h) {
			if (i > 2) {
				y = i;
			} else {
				y = -i;
			}
			System.out.println("Если х = " + i + ", то у = " + y);
		}

	}

}
