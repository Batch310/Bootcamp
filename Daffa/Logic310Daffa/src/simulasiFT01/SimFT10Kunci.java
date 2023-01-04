package simulasiFT01;

import java.util.Scanner;

public class SimFT10Kunci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// variable bantu bobot
		String bobot = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] arrBobot = bobot.split("");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Input string : ");
		String x = scanner.nextLine();
		String[] arrX = x.split("");

		System.out.println("Input array : ");
		String y = scanner.nextLine();
		String[] arrY = y.split(",");

		if (arrX.length == arrY.length) {
			for (int i = 0; i < arrY.length; i++) {
				String hurufSekarang = arrX[i];
				String indexSekarang = arrY[i];
				int indexSekarangInt = Integer.parseInt(indexSekarang);
				String hurufBobotIndexSekarang = arrBobot[indexSekarangInt];

				if (hurufSekarang.equals(hurufBobotIndexSekarang)) {
					System.out.print("true ");
				} else {
					System.out.print("false ");
				}

			}
		} else {
			System.out.println("Panjang deret harus sama!");
		}

	}

}
