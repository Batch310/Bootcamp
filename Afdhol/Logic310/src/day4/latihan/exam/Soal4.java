package day4.latihan.exam;

import java.util.Scanner;

public class Soal4 {

	public static void main(String[] args) {

		// diket:
		// toko ke tempat 1 = 2 km
		// tempat1 ke tempat2 = 0,5km
		// tempat2 ke tempat3 = 1,5km
		// tempat3 ke tempat4 = 2,5km

		// soal= toko-tempat1-tempat2-toko
		// output 2liter

		int Toko_T1 = 2000;
		int T1_T2 = 500;
		int T2_T3 = 1500;
		int T3_T4 = 2500;
		int jarak = 0;

		double totalLiter = 0;

		int totalKM = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("Rute: ");
		String[] input = scan.nextLine().split("-");

		// System.out.println(input[1]);

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (input[i] == "tempat 1" && input[j] == "toko" || input[i] == "toko" && input[j] == "tempat1") {
					jarak = Toko_T1;
					System.out.println("cek" + jarak);
				} else if (input[i] == "tempat 1" && input[j] == "tempat 2"
						|| input[i] == "tempat 2" && input[j] == "tempat 1") {
					jarak = T1_T2;
				} else if (input[i] == "tempat 2" && input[j] == "tempat 3"
						|| input[i] == "tempat 3" && input[j] == "tempat 2") {
					jarak = T2_T3;
				} else if (input[i] == "tempat 3" && input[j] == "tempat 4"
						|| input[i] == "tempat 4" && input[j] == "tempat 3") {
					jarak = T3_T4;
				} else if (input[i] == "tempat 1" && input[j] == "tempat 2"
						|| input[i] == "tempat 2" && input[j] == "tempat 1") {
					jarak = Toko_T1 + T1_T2;
				} else if (input[i] == "tempat 1" && input[j] == "tempat 3"
						|| input[i] == "tempat 3" && input[j] == "tempat 1") {
					jarak = Toko_T1 + T2_T3;
				} else if (input[i] == "tempat 1" && input[j] == "tempat 4"
						|| input[i] == "tempat 4" && input[j] == "tempat 1") {
					jarak = Toko_T1 + T3_T4;
				} else if (input[i] == "tempat 2" && input[j] == "tempat 4"
						|| input[i] == "tempat 4" && input[j] == "tempat 2") {
					jarak = T2_T3 + T3_T4;
				}

			}
			totalKM += jarak;
			System.out.println(totalKM / 2500);
		}

	}

}
