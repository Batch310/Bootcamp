package FT1AdhietyanPS;

import java.util.Scanner;

public class Soal07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String alpha = " abcdefghijklmnopqrstuvwxyz";
		String[] arrKata = alpha.split("");

		System.out.print("input String = ");
		String x = input.nextLine();
		String[] arrX = x.split("");

		System.out.print("input Array = ");
		String y = input.nextLine();
		String[] arrY = y.split(",");

		for (int i = 0; i < arrY.length; i++) {
			String hurufSekarang = arrX[i];
			String indexSekarang = arrY[i];
			// parseInt merubah string ke int
			int indexSekarangInt = Integer.parseInt(indexSekarang);
			// variable bantu untuk mengecek huruf sudah sesuai apa belum
			String hurufBobotIndexSekarang = arrKata[indexSekarangInt];

			if (hurufSekarang.equals(hurufBobotIndexSekarang)) {
				System.out.print("True ");
			} else {
				System.out.print("False ");
			}
			
		}

	}

}
