package day5.test;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan jumlah Saldo OPO : ");
		int saldo = scanner.nextInt();

		int hargaEsKopi = 18000; // Harga satuan es kopi susu
		int diskon = hargaEsKopi / 2; // Persentase diskon
		int jumlahCup = saldo / diskon; // Hitung jumlah cup
		int kembalian = saldo % diskon; // Hitung kembalian
		int hitungCashback = diskon * jumlahCup;
		int cashback = hitungCashback / 10;
		int jumlahSaldoAkhir = kembalian + cashback;

		if ((hargaEsKopi * jumlahCup) / 2 > 100000) {
			System.out.print("Mohon maaf transaksi tidak berhasil, karena maksimal diskon Rp. 100000");
		} else {
			System.out.println("Jumlah Cup = " + jumlahCup + "; Saldo Akhir = " + jumlahSaldoAkhir);
		}

	}

}
