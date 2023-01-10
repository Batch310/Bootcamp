package ujian.FT1;

import java.util.Scanner;

public class No_01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan uang = ");
		int n = scanner.nextInt();

		int hargaEs = 1000;
		int bonus = 0;
		int esLoli = 0;

		esLoli = n / hargaEs; // jumlah es Loli

		bonus = esLoli / 5; // jml bonus

		int sumEs = esLoli + bonus;

		System.out.println("Bambang Mendapatkan " + sumEs + " Es Loli");

	}

}
