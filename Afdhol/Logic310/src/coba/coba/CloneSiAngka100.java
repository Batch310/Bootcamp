package coba.coba;

import java.util.Scanner;

public class CloneSiAngka100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("n: ");
		int data = scan.nextInt();

		//int input = 5;

		int found = 0;

		for (int seratusInt = 100; found < data; seratusInt++) {
			// System.out.println(seratusInt);
			int hasil = 0;
			String seratusStr = Integer.toString(seratusInt);

			String[] arrStringSeratus = seratusStr.split("");

			for (int i = 0; i < arrStringSeratus.length; i++) {

				int convertAngka = Integer.parseInt(arrStringSeratus[i]);

				int totalPangkat = (int) Math.pow(convertAngka, 2);

				hasil = hasil + totalPangkat;
			}

			if (hasil == 1) {
				System.out.println(seratusInt + " adalah angka 1");
				found++;
				
			} else {
				while (hasil > 9) {
					String convertInt = Integer.toString(hasil);
					String[] arrTampungHasil = convertInt.split("");
					hasil = 0;

					for (int j = 0; j < arrTampungHasil.length; j++) {
						int convertDariString = Integer.parseInt(arrTampungHasil[j]);

						int pangkatDua = (int) Math.pow(convertDariString, 2);
						hasil = hasil + pangkatDua;
					}
					if (hasil == 1) {
						System.out.println(seratusInt + " si angka 1");
						found++;
					}
				}
			}

		}

	}

}
