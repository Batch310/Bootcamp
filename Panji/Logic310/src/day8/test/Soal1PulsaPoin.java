package day8.test;

import java.util.Scanner;

public class Soal1PulsaPoin {

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
		int totalPoint = 0;

		// Mencari point range 0 - 10000
		if (jumlahPulsa <= 10000) {
			point1 = 0;
			totalPoint = point1;
			System.out.println(totalPoint + " poin");
		} else if (jumlahPulsa > 10000 && jumlahPulsa <= 30000) {
			jumlahPulsa = jumlahPulsa - 10000;
			point2 = (jumlahPulsa / 1000);
			totalPoint = point2;
			System.out.println(point1 + " + " + point2 + " = " + totalPoint + " poin");
		} else if (jumlahPulsa > 30000) {
			point2 = (20000 / 1000);
			jumlahPulsa = jumlahPulsa - 30000;
			point3 = ((jumlahPulsa / 1000) * 2);
			totalPoint = point2 + point3;
			System.out.println(point1 + " + " + point2 + " + " + point3 + " = " + totalPoint + " poin");
		}
	}

}
