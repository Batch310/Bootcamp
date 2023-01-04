package simulasi.ft1;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Var bantu bobot
		String bobot = "ABCDEFGHIJKLMOPQRSTUVWXYZ";
		String[] arrBobot = bobot.split("");

		System.out.print("Input String :");
		String x = scanner.nextLine();
		String[] arrX = x.split("");

		System.out.print("Input array :");
		String y = scanner.nextLine();
		String[] arrY = y.split(",");

		for (int i = 0; i < arrY.length; i++) {
			String hurufSekarang = arrX[i];
			String indexSekarang = arrY[i];
			int indexSekarangInt = Integer.parseInt(indexSekarang);

			// apakah huruf sekarang udh sesuai bobot ?
			String hurufBobotIndekSekarang = arrBobot[indexSekarangInt];

			if (hurufSekarang.equals(hurufBobotIndekSekarang)) {
				System.out.print("true, ");

			} else {
				System.out.print("false ");
			}
		}

	}

}
