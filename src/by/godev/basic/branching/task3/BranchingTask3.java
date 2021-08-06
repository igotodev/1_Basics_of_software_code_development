package by.godev.basic.branching.task3;

/*
 * 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
 * Определить, будут ли они расположены на одной прямой.
 * */

public class BranchingTask3 {

	public static void main(String[] args) {
		double result;
		int mid1;
		int mid2;

		int pointOneX;
		int pointOneY;

		int pointTwoX;
		int pointTwoY;

		int pointThreeX;
		int pointThreeY;

		pointOneX = 3;
		pointOneY = 3;

		pointTwoX = 1;
		pointTwoY = 1;

		pointThreeX = -2;
		pointThreeY = -2;

		/*
		 * Если все точки лежат на прямой , то его площадь будет равна нулю. Подставьте
		 * значения координат в формулу: S=1/2((х1-х3)(у2-у3)-(х2-х3)(у1-у3)). Если
		 * позже всех вычислений вы получили нуль – значит, три точки лежат на одной
		 * прямой .
		 */

		mid1 = (pointOneX - pointThreeX) * (pointTwoY - pointThreeY);
		mid2 = (pointTwoX - pointThreeX) * (pointOneY - pointThreeY);
		result = (mid1 - mid2) / 2;

		if (result == 0) {
			System.out.println("Все точки лежат на одной прямой.");
		} else {
			System.out.println("Данные точки не лежат на одной прямой.");
		}
	}

}
