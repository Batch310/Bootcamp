package day7.pagi;

import java.util.Scanner;

public class Haidar04Challenge {
	public static void main(String[] args) {

		Scanner masukan = new Scanner(System.in);

		System.out.print("Masukkan Rute: ");
		String rute = masukan.nextLine();

		// Program yang diinginkan:
		// 1. Ada pengantar makanan dari toko, dengan jalan lurus/linier
		// 2. Jarak Toko - Tempat 1 = 2km
		// 3. Jarak Tempat 1 - Tempat 2 = 500m
		// 4. Jarak Tempat 2 - Tempat 3 = 1.5km
		// 5. Jarak Tempat 3 - Tempat 4 = 2.5km
		// 6. Dan rute terakhir akan kembali ke Toko
		// 7. 1 Liter bensin dapat digunakan untuk 2.5km
		// Challenge = Tempat 2 tutup, langsung ke rute selanjutnya
		// Toko - Tempat 1 -Tempat 2 - Toko

		String[] arrRute = rute.split(" - ");

		double totalJarak = 0;
		int urutanRute = 1;

		for (int i = urutanRute; i < arrRute.length; i++) {
			if (arrRute[i].equals("Toko")) {//Toko Tempat 1 Tempat 2 Toko
				totalJarak += 0;
				if (arrRute[i - 1].equals("Tempat 1")
						|| (arrRute[i - 1].equals("Tempat 2") && arrRute[i - 2].equals("Tempat 1"))) {
					totalJarak += 2;
//				} else if (arrRute[i-1].equals("Tempat 2")) {
//					totalJarak += 2.5;
				} else if (arrRute[i - 1].equals("Tempat 3")
						|| (arrRute[i - 1].equals("Tempat 2") && arrRute[i - 2].equals("Tempat 3"))) {
					totalJarak += 4;
				} else if (arrRute[i - 1].equals("Tempat 4")
						|| (arrRute[i - 1].equals("Tempat 2") && arrRute[i - 2].equals("Tempat 4"))) {
					totalJarak += 6.5;
				}
			} else if (arrRute[i].equals("Tempat 1")) {
				if (arrRute[i - 1].equals("Toko")
						|| (arrRute[i - 1].equals("Tempat 2") && arrRute[i - 2].equals("Toko"))) {
					totalJarak += 2;
//				} else if (arrRute[i-1].equals("Tempat 2")) {
//					totalJarak += 0.5;
				} else if (arrRute[i - 1].equals("Tempat 3")
						|| (arrRute[i - 1].equals("Tempat 2") && arrRute[i - 2].equals("Tempat 3"))) {
					totalJarak += 2;
				} else if (arrRute[i - 1].equals("Tempat 4")
						|| (arrRute[i - 1].equals("Tempat 2") && arrRute[i - 2].equals("Tempat 4"))) {
					totalJarak += 4.5;
				}
			} else if (arrRute[i].equals("Tempat 2")) {
				totalJarak += 0;
//				if (arrRute[i-1].equals("Toko")) {
//					totalJarak += 2.5;
//				} else if (arrRute[i-1].equals("Tempat 1")) {
//					totalJarak += 0.5;
//				} else if (arrRute[i-1].equals("Tempat 3")) {
//					totalJarak += 1.5;
//				} else if (arrRute[i-1].equals("Tempat 4")) {
//					totalJarak += 4;
//				}
			} else if (arrRute[i].equals("Tempat 3")) {
				if (arrRute[i - 1].equals("Toko")
						|| (arrRute[i - 1].equals("Tempat 2") && arrRute[i - 2].equals("Toko"))) {
					totalJarak += 4;
				} else if (arrRute[i - 1].equals("Tempat 1")
						|| (arrRute[i - 1].equals("Tempat 2") && arrRute[i - 2].equals("Tempat 1"))) {
					totalJarak += 2;
//				} else if (arrRute[i-1].equals("Tempat 2")) {
//					totalJarak += 1.5;
				} else if (arrRute[i - 1].equals("Tempat 4")
						|| (arrRute[i - 1].equals("Tempat 2") && arrRute[i - 2].equals("Tempat 4"))) {
					totalJarak += 2.5;
				}
			} else if (arrRute[i].equals("Tempat 4")) {
				if (arrRute[i - 1].equals("Toko")
						|| (arrRute[i - 1].equals("Tempat 2") && arrRute[i - 2].equals("Toko"))) {
					totalJarak += 6.5;
				} else if (arrRute[i - 1].equals("Tempat 1")
						|| (arrRute[i - 1].equals("Tempat 2") && arrRute[i - 2].equals("Tempat 1"))) {
					totalJarak += 4.5;
//				} else if (arrRute[i-1].equals("Tempat 2")) {
//					totalJarak += 4;
				} else if (arrRute[i - 1].equals("Tempat 3")
						|| (arrRute[i - 1].equals("Tempat 2") && arrRute[i - 2].equals("Tempat 3"))) {
					totalJarak += 2.5;
				}
			} else {
				System.out.println("Rute tidak valid!");
				System.exit(0);
			}

//			System.out.println(arrRute[i]);
		}
		double liter = (totalJarak / 2.5);
		if (totalJarak % 2.5 == 0) {
			System.out.println((int) (liter) + " liter");
		} else {
			System.out.println(((int) (liter) + 1) + " liter");
		}
		System.out.println(totalJarak);
//		System.out.println(liter);

	}
}
