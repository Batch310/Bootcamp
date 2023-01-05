package day7.latihan;

import java.util.Scanner;

public class Soal01Pulsa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Point
		// 0 - 10.000 10.000
		// 10.000 - 30.000 20.000
		// 30.000

		System.out.print("Masukan pulsa ");
		int pulsa = input.nextInt();
		int pulsa1 = 0;
		int pulsaSisa = 0;
		String point = "";
		int point1 = 0, point2 = 0, point3 = 0;
		int sisaPoint = 0;
		if (pulsa >= 0) {
			point = point + point1;
		}

		if (pulsa > 10000) {
			if (pulsa > 30000) {
				point2 = 20000 / 1000;
				point = point + "+" + point2;
			} else {
				point2 = point2 + ((pulsa / 10000) / 1000);
				point = point + "+" + point2;
			}
		}
		if (pulsa >= 30000) {
			point3 = ((pulsa - 30000) / 1000*2);
			point = point + "+" + point3;
		}
		System.out.println("Output : " + point + " = " + (point1 + point2 + point3) + " point");

	}

}
