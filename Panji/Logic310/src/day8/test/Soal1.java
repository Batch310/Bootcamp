package day8.test;

import java.util.Scanner;

public class Soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Beli Pulsa : Rp.");
		int jumlahPulsa = input.nextInt();

		// Point
		// 0 - 10000 = 0 point
		// 10001 - 30000 = 1 point / kelipatan 1000
		// 30001 -> 2 point / kelipatan 1000

		int point1 = 0;
		int point2 = 0;
		int point3 = 0;
		int range1 = 0;
		int range2 = 10000;
		int range3 = 30000;
		int pulsa = 0;
		int totalPoint = 0;

		// Mencari point range 0 - 10000
		if (jumlahPulsa >= range1) {
			jumlahPulsa = jumlahPulsa - 10000;
			point1 = 0;
			System.out.println(point1);
		}

		// Mencari point range 10001 - 30000
		if (jumlahPulsa > range2 && jumlahPulsa >= range3) {
			
			point2 = (jumlahPulsa - 20000)/ 1000;
			System.out.println(point2);
		}

		// Mencari point diatas 30000
		if (jumlahPulsa > range3) {
			point3 = (jumlahPulsa) / 1000 * 2;
			System.out.println(point3);
		}
		totalPoint = point1 + point2 + point3;
		System.out.println(point1 + " + " + point2 + " + " + point3 + " = " + totalPoint);
	}

}
