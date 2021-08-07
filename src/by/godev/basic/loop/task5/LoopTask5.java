package by.godev.basic.loop.task5;

/*
 * 5.  Даны числовой ряд и некоторое число е.  
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
 * Общий член ряда имеет вид: a_n = (2 / 2^n) + (1 / 3^n)
 * */

public class LoopTask5 {

	public static void main(String[] args) {
		int n;
		double e;
		double sum;
		double a;

		n = 1;
		e = 0.001;
		sum = 0;
		a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);

		while (Math.abs(a) >= e) {
			a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
			if (Math.abs(a) >= e) {
				sum += a;
			}
			n++;
		}

		System.out.println("Cумма членов ряда равна " + sum);
	}

}
