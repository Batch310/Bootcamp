package day8.latihanExam;

import java.util.Scanner;

public class TransaksiPulsa {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan beli pulsa = ");
		int pulsa = scanner.nextInt();

		int point1 = 0;
		int point2 = 0;
		int point3 = 0;
		int totalPoint = 0;
		int range1 = 10000; // selisih => 0-10.000
		int range2 = 20000; // selisih => 10.001-30.000

		// cari range 1 (0-10.000)
		if (pulsa >= 0) {
			if (pulsa > range1) {
				pulsa = pulsa - range1;
				point1 += totalPoint;
			} else {
				pulsa -= pulsa;
				point1 += totalPoint;
			}
		}

		// cari range 2(10.001-30.000)
		if (pulsa > range2) {

			if (pulsa > range2) {
				pulsa = pulsa - range2;
				point2 += (range2 / 1000);
			} else {
				point2 += pulsa / 1000;
			}
		} else {
			point2 = pulsa / 1000;
			pulsa = 0;
		}

		// cari point sisa pulsa
		if (pulsa > 0) {
			point3 += (pulsa / 1000) * 2;
		}

		totalPoint = point1 + point2 + point3;
		System.out.println();

		if (totalPoint == 0) {
			System.out.print(point1 + " = " + totalPoint);
			System.exit(0);
		} else if (totalPoint <= 20) {
			System.out.println(point1 + " + " + point2 + " = " + totalPoint);
			System.exit(0);
		} else {
			System.out.print(point1 + " + " + point2 + " + " + point3 + " = " + totalPoint);
		}

	}

}
