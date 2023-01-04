package simulasift1;

import java.util.Scanner;

public class soal10 {

	public static void main(String[] args) {

		// Variable bantu bobot
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] arrKata = alpha.split("");

		Scanner input = new Scanner(System.in);

		System.out.print("input String : ");
		String x = input.nextLine();
		String[] arrX = x.split("");

		System.out.print("input Array : ");
		String y = input.nextLine();
		String[] arrY = y.split(",");

		for (int i = 0; i < arrY.length; i++) {
			String hurufSekarang = arrX[i];
			String indexSekarang = arrY[i];
			// integer.parseInt untuk mengubah String ke Int
			int indexSekarangInt = Integer.parseInt(indexSekarang);
			//Variabel bantu untuk mengecek apakah huruf sekarang udah sesuai
			String hurufBobotIndexSekarang = arrKata[indexSekarangInt];

			if (hurufSekarang.equals(hurufBobotIndexSekarang)) {
				System.out.print("True ");
			} else {
				System.out.print("False ");
			}
		}

		System.out.println();
	}

}
