package ujian.FT1;

import java.util.Scanner;

public class No_01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan uang = ");
		int n = scanner.nextInt();

		int hargaEs = 1000;
		int bonus = 0;
		int esLoli = 1;
		int stik = 0;
		int esLoliBaru = 0;

		// esLoli = n / hargaEs; // jumlah es Loli

		// bonus = esLoli / 5; // jml bonus

		while (esLoli < (n / hargaEs)) {
			stik++;
			if (esLoli % 5 == 0 && stik > 0) {
				esLoliBaru = 0;
				bonus++;
				esLoliBaru++;
			}
			esLoli++;

		}

		int sumEs = esLoli + bonus + esLoliBaru;

		System.out.println("Bambang Mendapatkan " + sumEs + " Es Loli");

	}

}
