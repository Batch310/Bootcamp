package day5.pagi;

import java.util.Scanner;

public class Soal3SiAngka1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan n : ");
		int n = input.nextInt();
		input.close();

		int ketemu = 0;

		for (int ratusan = 100; ketemu < n; ratusan++) {
			int hasilJumlah = 0;
			String awalanStr = Integer.toString(ratusan);
			String[] arrRatusanStr = awalanStr.split("");
			for (int j = 0; j < arrRatusanStr.length; j++) {
				int convAngka = Integer.parseInt(arrRatusanStr[j]);
				int hasilPangkat = (int) Math.pow(convAngka, 2);
				hasilJumlah += hasilPangkat;
			}
			if (hasilJumlah == 1) {
				System.out.println(ratusan + " adalah Si Angka 1");
				ketemu++;
			} else {
				while (hasilJumlah > 9) {
					String jumlahStr = Integer.toString(hasilJumlah);
					String[] arrJumlahStr = jumlahStr.split("");
					hasilJumlah = 0;
					for (int k = 0; k < arrJumlahStr.length; k++) {
						int convAngka = Integer.parseInt(arrJumlahStr[k]);
						int hasilPangkat = (int) Math.pow(convAngka, 2);
						hasilJumlah += hasilPangkat;
					}
					if (hasilJumlah == 1) {
						System.out.println(ratusan + " adalah Si Angka 1");
						ketemu++;
					}
				}
			}
		}

	}
}