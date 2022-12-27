package day8.latihan;

import java.util.Scanner;

public class Soal01 {

	public static void main(String[] args) {
		// BELUM SELESAI
		Scanner input = new Scanner(System.in);

		System.out.println("Masukkan nominal pulsa : ");
		int pulsa = input.nextInt();

		input.close();

		int point1 = 0;
		int point2 = 0;
		int point3 = 0;

		int b1 = 0;
		int b2 = 10000;
		int b3 = 30000;
		int b4 = 75000;
		int b5 = b3 - b2;

		if (pulsa >= b1 && pulsa <= b2) {
			point1 = 0;
			System.out.println(point1);
		}
		if (pulsa > b2 && pulsa <= b3) {
			point2 = (pulsa - b2) / 1000;
			System.out.println(point2);
		}
		if (pulsa > b3) {
			point3 = ((pulsa - b3) / 1000 * 2);

			System.out.println(point3);
		}
		System.out.println(point1 + " + " + ((b3 -b2) / 1000) + " + " + point3 + " = " + (((b3 -b2) / 1000)+ point3) );
//		System.out.println(totalPointAll);
	}

}
