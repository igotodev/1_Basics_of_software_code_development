package by.godev.basic.branching.task1;

/*
 * 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, 
 * и если да, то будет ли он прямоугольным
 * */

public class BranchingTask1 {

	public static void main(String[] args) {
		int a;
		int b;

		a = 60;
		b = 30;

		if (((a + b) < 180) && ((a + b) > 0)) {
			System.out.print("Треугорльник с углами " + a + " и " + b + " существует");
			if (180 - (a + b) == 90) {
				System.out.print(" и он прямоугольный.\n");
			} else {
				System.out.print(", но он не прямоугольный.\n");
			}
		} else {
			System.out.println("Треугорльник с углами " + a + " и " + b + " не существует.");
		}

	}

}
